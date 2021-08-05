package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOpenIDConnectProviderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM OpenID Connect provider resource object to delete. You can get a list of OpenID Connect provider resource ARNs by using the ListOpenIDConnectProviders operation.
    */
  var OpenIDConnectProviderArn: arnType
}
object DeleteOpenIDConnectProviderRequest {
  
  inline def apply(OpenIDConnectProviderArn: arnType): DeleteOpenIDConnectProviderRequest = {
    val __obj = js.Dynamic.literal(OpenIDConnectProviderArn = OpenIDConnectProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOpenIDConnectProviderRequest]
  }
  
  extension [Self <: DeleteOpenIDConnectProviderRequest](x: Self) {
    
    inline def setOpenIDConnectProviderArn(value: arnType): Self = StObject.set(x, "OpenIDConnectProviderArn", value.asInstanceOf[js.Any])
  }
}
