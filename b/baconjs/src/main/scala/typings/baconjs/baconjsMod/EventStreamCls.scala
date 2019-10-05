package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import typings.baconjs.Bacon.More
import typings.baconjs.Bacon.NoMore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "EventStream")
@js.native
class EventStreamCls[E, A] protected () extends EventStream[E, A] {
  /**
    * @callback EventStream#new~subscribe
    * @param {EventStream#new~sink} sink
    * @returns {EventStream#new~unsubscribe}
    */
  /**
    * @callback EventStream#new~sink
    * @param {More|NoMore|(A|Initial<A>|Next<A>|End<A>|Error<E>)|(A|Initial<A>|Next<A>|End<A>|Error<E>)[]} value
    * @returns {void}
    */
  /**
    * @callback EventStream#new~unsubscribe
    * @returns {void}
    */
  /**
    * @constructor EventStream#new
    * @constructs Bacon.EventStream
    * @description Creates an [EventStream]{@link Bacon.EventStream} with the given `subscribe` function.
    * @param {EventStream#new~subscribe} subscribe
    * @returns {EventStream<E, A>}
    */
  def this(subscribe: js.Function1[
        /* sink */ js.Function1[
          /* value */ More | NoMore | A | typings.baconjs.Bacon.Initial[A] | typings.baconjs.Bacon.Next[A] | typings.baconjs.Bacon.End[A] | typings.baconjs.Bacon.Error[E] | (js.Array[
            A | typings.baconjs.Bacon.Initial[A] | typings.baconjs.Bacon.Next[A] | typings.baconjs.Bacon.End[A] | typings.baconjs.Bacon.Error[E]
          ]), 
          Unit
        ], 
        js.Function0[Unit]
      ]) = this()
}

