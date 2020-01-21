package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsResponse extends js.Object {
  /**
    * The findings that matched the filters specified in the request.
    */
  var Findings: AwsSecurityFindingList = js.native
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: AwsSecurityFindingList, NextToken: NextToken = null): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

