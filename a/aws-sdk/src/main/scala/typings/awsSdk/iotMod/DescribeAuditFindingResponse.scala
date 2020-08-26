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
  def apply(): DescribeAuditFindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditFindingResponse]
  }
  @scala.inline
  implicit class DescribeAuditFindingResponseOps[Self <: DescribeAuditFindingResponse] (val x: Self) extends AnyVal {
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
    def setFinding(value: AuditFinding): Self = this.set("finding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
  }
  
}

