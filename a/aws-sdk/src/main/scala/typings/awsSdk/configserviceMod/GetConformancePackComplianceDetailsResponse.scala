package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConformancePackComplianceDetailsResponse extends js.Object {
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.configserviceMod.ConformancePackName = js.native
  /**
    * Returns a list of ConformancePackEvaluationResult objects.
    */
  var ConformancePackRuleEvaluationResults: js.UndefOr[ConformancePackRuleEvaluationResultsList] = js.native
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetConformancePackComplianceDetailsResponse {
  @scala.inline
  def apply(
    ConformancePackName: ConformancePackName,
    ConformancePackRuleEvaluationResults: ConformancePackRuleEvaluationResultsList = null,
    NextToken: NextToken = null
  ): GetConformancePackComplianceDetailsResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    if (ConformancePackRuleEvaluationResults != null) __obj.updateDynamic("ConformancePackRuleEvaluationResults")(ConformancePackRuleEvaluationResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceDetailsResponse]
  }
}

