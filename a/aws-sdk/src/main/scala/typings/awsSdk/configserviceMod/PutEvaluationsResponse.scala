package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEvaluationsResponse extends js.Object {
  /**
    * Requests that failed because of a client or server error.
    */
  var FailedEvaluations: js.UndefOr[Evaluations] = js.native
}

object PutEvaluationsResponse {
  @scala.inline
  def apply(): PutEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEvaluationsResponse]
  }
  @scala.inline
  implicit class PutEvaluationsResponseOps[Self <: PutEvaluationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailedEvaluationsVarargs(value: Evaluation*): Self = this.set("FailedEvaluations", js.Array(value :_*))
    @scala.inline
    def setFailedEvaluations(value: Evaluations): Self = this.set("FailedEvaluations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedEvaluations: Self = this.set("FailedEvaluations", js.undefined)
  }
  
}

