package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProductSubscriptionRequest extends StObject {
  
  /**
    * The domain name of the user.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * An object that specifies details for the identity provider.
    */
  var IdentityProvider: typings.awsSdk.licensemanagerusersubscriptionsMod.IdentityProvider
  
  /**
    * The name of the user-based subscription product.
    */
  var Product: String
  
  /**
    * The user name from the identity provider for the user.
    */
  var Username: String
}
object StopProductSubscriptionRequest {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String, Username: String): StopProductSubscriptionRequest = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProductSubscriptionRequest]
  }
  
  extension [Self <: StopProductSubscriptionRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
