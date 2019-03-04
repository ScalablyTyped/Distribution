package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorPositionParameters extends js.Object {
  /** ID of the candidate to select. */
  var candidateID: scala.Double
  /** ID of the context that owns the candidate window. */
  var contextID: scala.Double
}

object CursorPositionParameters {
  @scala.inline
  def apply(candidateID: scala.Double, contextID: scala.Double): CursorPositionParameters = {
    val __obj = js.Dynamic.literal(candidateID = candidateID, contextID = contextID)
  
    __obj.asInstanceOf[CursorPositionParameters]
  }
}

