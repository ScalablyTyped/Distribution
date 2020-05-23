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
    * The identifier for the role.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Designates a trusted caller, an IAM principal, by registering this caller with the Data Catalog. 
    */
  var UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.native
}

object RegisterResourceRequest {
  @scala.inline
  def apply(
    ResourceArn: ResourceArnString,
    RoleArn: IAMRoleArn = null,
    UseServiceLinkedRole: js.UndefOr[NullableBoolean] = js.undefined
  ): RegisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(UseServiceLinkedRole)) __obj.updateDynamic("UseServiceLinkedRole")(UseServiceLinkedRole.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterResourceRequest]
  }
}

