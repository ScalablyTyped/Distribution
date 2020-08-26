package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditFindingRequest extends js.Object {
  /**
    * A unique identifier for a single audit finding. You can use this identifier to apply mitigation actions to the finding.
    */
  var findingId: FindingId = js.native
}

object DescribeAuditFindingRequest {
  @scala.inline
  def apply(findingId: FindingId): DescribeAuditFindingRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditFindingRequest]
  }
  @scala.inline
  implicit class DescribeAuditFindingRequestOps[Self <: DescribeAuditFindingRequest] (val x: Self) extends AnyVal {
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
    def setFindingId(value: FindingId): Self = this.set("findingId", value.asInstanceOf[js.Any])
  }
  
}

