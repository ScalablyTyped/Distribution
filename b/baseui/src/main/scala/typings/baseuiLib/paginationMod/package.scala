package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paginationMod {
  type StateReducer = js.Function3[
    baseuiLib.baseuiLibStrings.change, 
    /* changes */ State, 
    /* currentState */ State, 
    State
  ]
}
