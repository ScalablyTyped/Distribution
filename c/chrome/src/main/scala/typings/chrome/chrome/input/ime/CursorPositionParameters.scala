package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorPositionParameters extends js.Object {
  /** ID of the candidate to select. */
  var candidateID: Double = js.native
  /** ID of the context that owns the candidate window. */
  var contextID: Double = js.native
}

object CursorPositionParameters {
  @scala.inline
  def apply(candidateID: Double, contextID: Double): CursorPositionParameters = {
    val __obj = js.Dynamic.literal(candidateID = candidateID.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionParameters]
  }
  @scala.inline
  implicit class CursorPositionParametersOps[Self <: CursorPositionParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCandidateID(value: Double): Self = this.set("candidateID", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
  }
  
}

