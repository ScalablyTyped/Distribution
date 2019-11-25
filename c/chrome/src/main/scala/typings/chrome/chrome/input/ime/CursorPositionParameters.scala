package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorPositionParameters extends js.Object {
  /** ID of the candidate to select. */
  var candidateID: Double
  /** ID of the context that owns the candidate window. */
  var contextID: Double
}

object CursorPositionParameters {
  @scala.inline
  def apply(candidateID: Double, contextID: Double): CursorPositionParameters = {
    val __obj = js.Dynamic.literal(candidateID = candidateID.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CursorPositionParameters]
  }
}

