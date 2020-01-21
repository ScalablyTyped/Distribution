package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString = js.native
  /**
    * The new role to use for the given resource registered in AWS Lake Formation.
    */
  var RoleArn: IAMRoleArn = js.native
}

object UpdateResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString, RoleArn: IAMRoleArn): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateResourceRequest]
  }
}

