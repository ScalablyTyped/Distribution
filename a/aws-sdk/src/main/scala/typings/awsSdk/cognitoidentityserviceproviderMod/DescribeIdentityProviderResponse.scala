package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityProviderResponse extends StObject {
  
  /**
    * The IdP that was deleted.
    */
  var IdentityProvider: IdentityProviderType
}
object DescribeIdentityProviderResponse {
  
  inline def apply(IdentityProvider: IdentityProviderType): DescribeIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityProviderResponse]
  }
  
  extension [Self <: DescribeIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProvider(value: IdentityProviderType): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
  }
}
