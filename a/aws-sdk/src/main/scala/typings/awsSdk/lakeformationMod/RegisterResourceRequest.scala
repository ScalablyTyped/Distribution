package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to register.
    */
  var ResourceArn: ResourceArnString = js.native
  /**
    * The identifier for the role that registers the resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog. A service-linked role is a unique type of IAM role that is linked directly to Lake Formation. For more information, see Using Service-Linked Roles for Lake Formation.
    */
  var UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.native
}

object RegisterResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): RegisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterResourceRequest]
  }
  @scala.inline
  implicit class RegisterResourceRequestOps[Self <: RegisterResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: ResourceArnString): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setUseServiceLinkedRole(value: NullableBoolean): Self = this.set("UseServiceLinkedRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseServiceLinkedRole: Self = this.set("UseServiceLinkedRole", js.undefined)
  }
  
}

