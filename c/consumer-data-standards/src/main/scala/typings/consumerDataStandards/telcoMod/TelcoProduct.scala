package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BundleUri
import typings.consumerDataStandards.anon.ContractUri
import typings.consumerDataStandards.anon.Period
import typings.consumerDataStandards.consumerDataStandardsStrings.ALL
import typings.consumerDataStandards.consumerDataStandardsStrings.BROADBAND
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typings.consumerDataStandards.consumerDataStandardsStrings.MOBILE
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PERSONAL
import typings.consumerDataStandards.consumerDataStandardsStrings.POST_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.PRE_PAID
import typings.consumerDataStandards.consumerDataStandardsStrings.UPFRONT_PAID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProduct
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object that contains links to additional information on specific topics
    */
  var additionalInformation: js.UndefOr[BundleUri] = js.undefined
  
  /**
    * A link to an application web page where this plan can be applied for
    */
  var applicationUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of product
    */
  var billingType: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER
  
  /**
    * The ID of the brand under which this product is offered
    */
  var brand: String
  
  /**
    * The display name of the brand under which this product is offered
    */
  var brandName: String
  
  /**
    * Required if part of a bundle. If not present FALSE is assumed
    */
  var bundle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Summary of the contract details. Mandatory if the billing type is POST_PAID and a contract agreement is required with the service provider for the plan
    */
  var contract: js.UndefOr[ContractUri] = js.undefined
  
  /**
    * A description of the product
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the product
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time from which this product is effective (ie. is available for origination). Used to enable the articulation of products to the regime before they are available for customers to originate
    */
  var effectiveFrom: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time at which this product will be retired and will no longer be offered. Used to enable the managed deprecation of plans
    */
  var effectiveTo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last date and time that the information for this plan was changed (or the creation date for the plan if it has never been altered)
    */
  var lastUpdated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of pricing details for the product plan
    */
  var pricing: js.Array[Period]
  
  /**
    * The ID of the specific product
    */
  var productId: String
  
  /**
    * The purpose type of the product. If absent, then the value PERSONAL is assumed
    */
  var purpose: js.UndefOr[PERSONAL | BUSINESS | ALL | Null] = js.undefined
  
  /**
    * The ID of the Third Party through which this product may be originated
    */
  var thirdPartyAgentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the Third Party through which this product may be originated
    */
  var thirdPartyAgentName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of product. [MOBILE](https://www.legislation.gov.au/Details/C2022C00170/Html/Volume_1#_Toc95898745) service or BROADBAND fixed internet service
    */
  var `type`: MOBILE | BROADBAND
}
object TelcoProduct {
  
  inline def apply(
    billingType: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER,
    brand: String,
    brandName: String,
    pricing: js.Array[Period],
    productId: String,
    `type`: MOBILE | BROADBAND
  ): TelcoProduct = {
    val __obj = js.Dynamic.literal(billingType = billingType.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], brandName = brandName.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProduct] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInformation(value: BundleUri): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setApplicationUri(value: String): Self = StObject.set(x, "applicationUri", value.asInstanceOf[js.Any])
    
    inline def setApplicationUriNull: Self = StObject.set(x, "applicationUri", null)
    
    inline def setApplicationUriUndefined: Self = StObject.set(x, "applicationUri", js.undefined)
    
    inline def setBillingType(value: PRE_PAID | POST_PAID | UPFRONT_PAID | OTHER): Self = StObject.set(x, "billingType", value.asInstanceOf[js.Any])
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBundle(value: Boolean): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setBundleNull: Self = StObject.set(x, "bundle", null)
    
    inline def setBundleUndefined: Self = StObject.set(x, "bundle", js.undefined)
    
    inline def setContract(value: ContractUri): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
    
    inline def setContractUndefined: Self = StObject.set(x, "contract", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEffectiveFrom(value: String): Self = StObject.set(x, "effectiveFrom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFromNull: Self = StObject.set(x, "effectiveFrom", null)
    
    inline def setEffectiveFromUndefined: Self = StObject.set(x, "effectiveFrom", js.undefined)
    
    inline def setEffectiveTo(value: String): Self = StObject.set(x, "effectiveTo", value.asInstanceOf[js.Any])
    
    inline def setEffectiveToNull: Self = StObject.set(x, "effectiveTo", null)
    
    inline def setEffectiveToUndefined: Self = StObject.set(x, "effectiveTo", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedNull: Self = StObject.set(x, "lastUpdated", null)
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setPricing(value: js.Array[Period]): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    inline def setPricingVarargs(value: Period*): Self = StObject.set(x, "pricing", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setPurpose(value: PERSONAL | BUSINESS | ALL): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setThirdPartyAgentId(value: String): Self = StObject.set(x, "thirdPartyAgentId", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyAgentIdNull: Self = StObject.set(x, "thirdPartyAgentId", null)
    
    inline def setThirdPartyAgentIdUndefined: Self = StObject.set(x, "thirdPartyAgentId", js.undefined)
    
    inline def setThirdPartyAgentName(value: String): Self = StObject.set(x, "thirdPartyAgentName", value.asInstanceOf[js.Any])
    
    inline def setThirdPartyAgentNameNull: Self = StObject.set(x, "thirdPartyAgentName", null)
    
    inline def setThirdPartyAgentNameUndefined: Self = StObject.set(x, "thirdPartyAgentName", js.undefined)
    
    inline def setType(value: MOBILE | BROADBAND): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
