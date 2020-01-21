package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phoneInputMod {
  type StateReducer = js.Function3[
    /* type */ typings.baseui.phoneInputMod.StateChange, 
    /* nextState */ typings.baseui.phoneInputMod.State, 
    /* currentState */ typings.baseui.phoneInputMod.State, 
    typings.baseui.phoneInputMod.State
  ]
}
