package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditFindingResponse extends js.Object {
  var finding: js.UndefOr[AuditFinding] = js.native
}

object DescribeAuditFindingResponse {
  @scala.inline
  def apply(finding: AuditFinding = null): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
}

