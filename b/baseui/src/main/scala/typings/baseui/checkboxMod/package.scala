package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkboxMod {
  import typings.react.reactMod.SyntheticEvent
  import typings.std.Event
  import typings.std.HTMLInputElement

  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ CheckboxState, 
    /* currentState */ CheckboxState, 
    /* event */ SyntheticEvent[HTMLInputElement, Event], 
    CheckboxState
  ]
}
