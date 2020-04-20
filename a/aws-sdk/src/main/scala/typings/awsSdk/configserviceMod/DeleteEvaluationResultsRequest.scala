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
}

