package typings.reactDashReduxLib

import typings.reactDashReduxLib.reactDashReduxMod.reactDashReduxModMembers.connect
import typings.reactLib.reactMod.ReactNs.FC
import typings.reduxLib.reduxMod.{Action, Dispatch, Store}

import scala.scalajs.js

/**
  * This is very rudimentary, just enough to support the demo
  */
object ReduxFacade {

  /** Since redux forces us to use plain js objects,
    *  this is the only trivially extractable boilerplate
    */
  trait Extractor[T] {
    protected val _type: String
    def unapply(a: Action[String]): Option[T] =
      if (a.`type` == _type) Some(a.asInstanceOf[T]) else None
  }

  trait Connected[State, Action] extends js.Object {
    val dispatch: Dispatch[Action]
    val state:    State
  }

  /* take a store and a component which takes `dispatch` and `state` as props, return a component with those filled */
  def simpleConnect[State <: js.Any, Action <: js.Any, P](store: Store[State, Action],
                                                          fc:    FC[Connected[State, Action] with P]): FC[P] = {
    val keepState: js.Function1[State, js.Dynamic] =
      s => js.Dynamic.literal(state = s)
    val keepDispatch: js.Function1[Dispatch[Action], js.Dynamic] =
      d => js.Dynamic.literal(dispatch = d)

    connect.asInstanceOf[js.Dynamic](keepState, keepDispatch)(fc).asInstanceOf[FC[P]]
  }
}
