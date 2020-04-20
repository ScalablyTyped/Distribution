package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorCheckSummariesRequest extends js.Object {
  /**
    * The IDs of the Trusted Advisor checks.
    */
  var checkIds: StringList = js.native
}

object DescribeTrustedAdvisorCheckSummariesRequest {
  @scala.inline
  def apply(checkIds: StringList): DescribeTrustedAdvisorCheckSummariesRequest = {
    val __obj = js.Dynamic.literal(checkIds = checkIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesRequest]
  }
}

