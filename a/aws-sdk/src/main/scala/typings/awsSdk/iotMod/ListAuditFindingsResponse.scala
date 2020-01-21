package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditFindingsResponse extends js.Object {
  /**
    * The findings (results) of the audit.
    */
  var findings: js.UndefOr[AuditFindings] = js.native
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAuditFindingsResponse {
  @scala.inline
  def apply(findings: AuditFindings = null, nextToken: NextToken = null): ListAuditFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditFindingsResponse]
  }
}

