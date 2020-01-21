package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typings.baseui.radioMod.State, 
    /* currentState */ typings.baseui.radioMod.State, 
    /* event */ typings.react.mod.SyntheticEvent[typings.std.HTMLInputElement, typings.std.Event_], 
    typings.baseui.radioMod.State
  ]
}
