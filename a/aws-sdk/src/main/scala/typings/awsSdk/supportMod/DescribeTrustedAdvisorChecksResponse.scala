package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustedAdvisorChecksResponse extends js.Object {
  /**
    * Information about all available Trusted Advisor checks.
    */
  var checks: TrustedAdvisorCheckList = js.native
}

object DescribeTrustedAdvisorChecksResponse {
  @scala.inline
  def apply(checks: TrustedAdvisorCheckList): DescribeTrustedAdvisorChecksResponse = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTrustedAdvisorChecksResponse]
  }
}

