package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
  /**
    * The summary information for the requested Trusted Advisor checks.
    */
  var summaries: TrustedAdvisorCheckSummaryList = js.native
}

object DescribeTrustedAdvisorCheckSummariesResponse {
  @scala.inline
  def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
    val __obj = js.Dynamic.literal(summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
  }
}

