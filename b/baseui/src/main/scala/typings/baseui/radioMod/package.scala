package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  import typings.react.reactMod.SyntheticEvent
  import typings.std.Event
  import typings.std.HTMLInputElement

  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ State, 
    /* currentState */ State, 
    /* event */ SyntheticEvent[HTMLInputElement, Event], 
    State
  ]
}
