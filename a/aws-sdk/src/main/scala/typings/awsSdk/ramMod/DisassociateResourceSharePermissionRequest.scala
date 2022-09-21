package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResourceSharePermissionRequest extends StObject {
  
  /**
    * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This lets you safely retry the request without accidentally performing the same operation a second time. Passing the same value to a later call to an operation requires that you also pass the same value for all other parameters. We recommend that you use a UUID type of value.. If you don't provide this value, then Amazon Web Services generates a random one for you.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resoure Name (ARN) of the permission to disassociate from the resource share. Changes to permissions take effect immediately.
    */
  var permissionArn: String
  
  /**
    * The Amazon Resoure Name (ARN) of the resource share from which you want to disassociate a permission.
    */
  var resourceShareArn: String
}
object DisassociateResourceSharePermissionRequest {
  
  inline def apply(permissionArn: String, resourceShareArn: String): DisassociateResourceSharePermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any], resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateResourceSharePermissionRequest]
  }
  
  extension [Self <: DisassociateResourceSharePermissionRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
