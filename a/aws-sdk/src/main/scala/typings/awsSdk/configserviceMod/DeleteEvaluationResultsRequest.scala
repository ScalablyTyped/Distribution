package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEvaluationResultsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to delete the evaluation results.
    */
  var ConfigRuleName: StringWithCharLimit64 = js.native
}

object DeleteEvaluationResultsRequest {
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): DeleteEvaluationResultsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationResultsRequest]
  }
  @scala.inline
  implicit class DeleteEvaluationResultsRequestOps[Self <: DeleteEvaluationResultsRequest] (val x: Self) extends AnyVal {
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
    def setConfigRuleName(value: StringWithCharLimit64): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
  }
  
}

