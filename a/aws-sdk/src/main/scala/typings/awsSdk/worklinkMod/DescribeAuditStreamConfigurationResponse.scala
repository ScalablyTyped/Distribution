package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditStreamConfigurationResponse extends js.Object {
  /**
    * The ARN of the Amazon Kinesis data stream that will receive the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.worklinkMod.AuditStreamArn] = js.native
}

object DescribeAuditStreamConfigurationResponse {
  @scala.inline
  def apply(): DescribeAuditStreamConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditStreamConfigurationResponse]
  }
  @scala.inline
  implicit class DescribeAuditStreamConfigurationResponseOps[Self <: DescribeAuditStreamConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuditStreamArn(value: AuditStreamArn): Self = this.set("AuditStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditStreamArn: Self = this.set("AuditStreamArn", js.undefined)
  }
  
}

