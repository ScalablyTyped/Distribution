package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutLicenseResponse extends StObject {
  
  /**
    * Checkout type.
    */
  var CheckoutType: js.UndefOr[typings.awsSdk.licensemanagerMod.CheckoutType] = js.undefined
  
  /**
    * Allowed license entitlements.
    */
  var EntitlementsAllowed: js.UndefOr[EntitlementDataList] = js.undefined
  
  /**
    * Date and time at which the license checkout expires.
    */
  var Expiration: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * Date and time at which the license checkout is issued.
    */
  var IssuedAt: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the checkout license.
    */
  var LicenseArn: js.UndefOr[String] = js.undefined
  
  /**
    * License consumption token.
    */
  var LicenseConsumptionToken: js.UndefOr[String] = js.undefined
  
  /**
    * Node ID.
    */
  var NodeId: js.UndefOr[String] = js.undefined
  
  /**
    * Signed token.
    */
  var SignedToken: js.UndefOr[typings.awsSdk.licensemanagerMod.SignedToken] = js.undefined
}
object CheckoutLicenseResponse {
  
  inline def apply(): CheckoutLicenseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutLicenseResponse]
  }
  
  extension [Self <: CheckoutLicenseResponse](x: Self) {
    
    inline def setCheckoutType(value: CheckoutType): Self = StObject.set(x, "CheckoutType", value.asInstanceOf[js.Any])
    
    inline def setCheckoutTypeUndefined: Self = StObject.set(x, "CheckoutType", js.undefined)
    
    inline def setEntitlementsAllowed(value: EntitlementDataList): Self = StObject.set(x, "EntitlementsAllowed", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsAllowedUndefined: Self = StObject.set(x, "EntitlementsAllowed", js.undefined)
    
    inline def setEntitlementsAllowedVarargs(value: EntitlementData*): Self = StObject.set(x, "EntitlementsAllowed", js.Array(value*))
    
    inline def setExpiration(value: ISO8601DateTime): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setIssuedAt(value: ISO8601DateTime): Self = StObject.set(x, "IssuedAt", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtUndefined: Self = StObject.set(x, "IssuedAt", js.undefined)
    
    inline def setLicenseArn(value: String): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnUndefined: Self = StObject.set(x, "LicenseArn", js.undefined)
    
    inline def setLicenseConsumptionToken(value: String): Self = StObject.set(x, "LicenseConsumptionToken", value.asInstanceOf[js.Any])
    
    inline def setLicenseConsumptionTokenUndefined: Self = StObject.set(x, "LicenseConsumptionToken", js.undefined)
    
    inline def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    inline def setSignedToken(value: SignedToken): Self = StObject.set(x, "SignedToken", value.asInstanceOf[js.Any])
    
    inline def setSignedTokenUndefined: Self = StObject.set(x, "SignedToken", js.undefined)
  }
}
