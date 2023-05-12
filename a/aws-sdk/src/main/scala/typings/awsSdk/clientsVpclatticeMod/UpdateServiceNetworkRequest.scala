package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceNetworkRequest extends StObject {
  
  /**
    * The type of IAM policy.    NONE: The resource does not use an IAM policy. This is the default.    AWS_IAM: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy is required.  
    */
  var authType: AuthType
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service network.
    */
  var serviceNetworkIdentifier: ServiceNetworkIdentifier
}
object UpdateServiceNetworkRequest {
  
  inline def apply(authType: AuthType, serviceNetworkIdentifier: ServiceNetworkIdentifier): UpdateServiceNetworkRequest = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serviceNetworkIdentifier = serviceNetworkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setServiceNetworkIdentifier(value: ServiceNetworkIdentifier): Self = StObject.set(x, "serviceNetworkIdentifier", value.asInstanceOf[js.Any])
  }
}
