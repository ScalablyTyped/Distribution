package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceRequest extends StObject {
  
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
  
  @scala.inline
  implicit class UpdateResourceRequestMutableBuilder[Self <: UpdateResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
