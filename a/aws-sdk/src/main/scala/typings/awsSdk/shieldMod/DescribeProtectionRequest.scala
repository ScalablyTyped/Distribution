package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.shieldMod.ProtectionId] = js.native
  /**
    * The ARN (Amazon Resource Name) of the AWS resource for the Protection object that is described. When submitting the DescribeProtection request you must provide either the ResourceArn or the ProtectionID, but not both.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.native
}

object DescribeProtectionRequest {
  @scala.inline
  def apply(): DescribeProtectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionRequest]
  }
  @scala.inline
  implicit class DescribeProtectionRequestOps[Self <: DescribeProtectionRequest] (val x: Self) extends AnyVal {
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
    def setProtectionId(value: ProtectionId): Self = this.set("ProtectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtectionId: Self = this.set("ProtectionId", js.undefined)
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
  }
  
}

