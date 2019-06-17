package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ State, 
    /* currentState */ State, 
    /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
    State
  ]
}
