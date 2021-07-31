package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceSharePermissionRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the AWS RAM permission to associate with the resource share.
    */
  var permissionArn: String
  
  /**
    * Indicates whether the permission should replace the permissions that are currently associated with the resource share. Use true to replace the current permissions. Use false to add the permission to the current permission.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}
object AssociateResourceSharePermissionRequest {
  
  @scala.inline
  def apply(permissionArn: String, resourceShareArn: String): AssociateResourceSharePermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceSharePermissionRequest]
  }
  
  @scala.inline
  implicit class AssociateResourceSharePermissionRequestMutableBuilder[Self <: AssociateResourceSharePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
