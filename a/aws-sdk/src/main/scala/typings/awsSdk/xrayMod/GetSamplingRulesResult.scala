package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingRulesResult extends js.Object {
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Rule definitions and metadata.
    */
  var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.native
}

object GetSamplingRulesResult {
  @scala.inline
  def apply(NextToken: String = null, SamplingRuleRecords: SamplingRuleRecordList = null): GetSamplingRulesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SamplingRuleRecords != null) __obj.updateDynamic("SamplingRuleRecords")(SamplingRuleRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingRulesResult]
  }
}

