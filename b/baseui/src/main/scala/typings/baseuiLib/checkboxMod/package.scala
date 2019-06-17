package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkboxMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ CheckboxState, 
    /* currentState */ CheckboxState, 
    /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
    CheckboxState
  ]
}
