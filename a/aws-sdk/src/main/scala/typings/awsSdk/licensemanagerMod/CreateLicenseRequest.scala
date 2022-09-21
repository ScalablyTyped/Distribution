package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseRequest extends StObject {
  
  /**
    * License beneficiary.
    */
  var Beneficiary: String
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.licensemanagerMod.ClientToken
  
  /**
    * Configuration for consumption of the license. Choose a provisional configuration for workloads running with continuous connectivity. Choose a borrow configuration for workloads with offline usage.
    */
  var ConsumptionConfiguration: typings.awsSdk.licensemanagerMod.ConsumptionConfiguration
  
  /**
    * License entitlements.
    */
  var Entitlements: EntitlementList
  
  /**
    * Home Region for the license.
    */
  var HomeRegion: String
  
  /**
    * License issuer.
    */
  var Issuer: typings.awsSdk.licensemanagerMod.Issuer
  
  /**
    * Information about the license.
    */
  var LicenseMetadata: js.UndefOr[MetadataList] = js.undefined
  
  /**
    * License name.
    */
  var LicenseName: String
  
  /**
    * Product name.
    */
  var ProductName: String
  
  /**
    * Product SKU.
    */
  var ProductSKU: String
  
  /**
    * Date and time range during which the license is valid, in ISO8601-UTC format.
    */
  var Validity: DatetimeRange
}
object CreateLicenseRequest {
  
  inline def apply(
    Beneficiary: String,
    ClientToken: ClientToken,
    ConsumptionConfiguration: ConsumptionConfiguration,
    Entitlements: EntitlementList,
    HomeRegion: String,
    Issuer: Issuer,
    LicenseName: String,
    ProductName: String,
    ProductSKU: String,
    Validity: DatetimeRange
  ): CreateLicenseRequest = {
    val __obj = js.Dynamic.literal(Beneficiary = Beneficiary.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ConsumptionConfiguration = ConsumptionConfiguration.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], HomeRegion = HomeRegion.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], LicenseName = LicenseName.asInstanceOf[js.Any], ProductName = ProductName.asInstanceOf[js.Any], ProductSKU = ProductSKU.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseRequest]
  }
  
  extension [Self <: CreateLicenseRequest](x: Self) {
    
    inline def setBeneficiary(value: String): Self = StObject.set(x, "Beneficiary", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setConsumptionConfiguration(value: ConsumptionConfiguration): Self = StObject.set(x, "ConsumptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEntitlements(value: EntitlementList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setLicenseMetadata(value: MetadataList): Self = StObject.set(x, "LicenseMetadata", value.asInstanceOf[js.Any])
    
    inline def setLicenseMetadataUndefined: Self = StObject.set(x, "LicenseMetadata", js.undefined)
    
    inline def setLicenseMetadataVarargs(value: Metadata*): Self = StObject.set(x, "LicenseMetadata", js.Array(value*))
    
    inline def setLicenseName(value: String): Self = StObject.set(x, "LicenseName", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductSKU(value: String): Self = StObject.set(x, "ProductSKU", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: DatetimeRange): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
  }
}
