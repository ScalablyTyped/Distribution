package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterResourceRequest extends StObject {
  
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
  implicit class RegisterResourceRequestMutableBuilder[Self <: RegisterResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setUseServiceLinkedRole(value: NullableBoolean): Self = StObject.set(x, "UseServiceLinkedRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseServiceLinkedRoleUndefined: Self = StObject.set(x, "UseServiceLinkedRole", js.undefined)
  }
}
