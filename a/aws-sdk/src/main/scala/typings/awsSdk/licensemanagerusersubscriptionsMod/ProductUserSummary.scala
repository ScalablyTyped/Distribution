package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductUserSummary extends StObject {
  
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
    * The status of a product for a user.
    */
  var Status: String
  
  /**
    * The status message for a product for a user.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The end date of a subscription.
    */
  var SubscriptionEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The start date of a subscription.
    */
  var SubscriptionStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * The user name from the identity provider of the user.
    */
  var Username: String
}
object ProductUserSummary {
  
  inline def apply(IdentityProvider: IdentityProvider, Product: String, Status: String, Username: String): ProductUserSummary = {
    val __obj = js.Dynamic.literal(IdentityProvider = IdentityProvider.asInstanceOf[js.Any], Product = Product.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductUserSummary]
  }
  
  extension [Self <: ProductUserSummary](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setIdentityProvider(value: IdentityProvider): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: String): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setSubscriptionEndDate(value: String): Self = StObject.set(x, "SubscriptionEndDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionEndDateUndefined: Self = StObject.set(x, "SubscriptionEndDate", js.undefined)
    
    inline def setSubscriptionStartDate(value: String): Self = StObject.set(x, "SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStartDateUndefined: Self = StObject.set(x, "SubscriptionStartDate", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
