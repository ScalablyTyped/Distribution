package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalBundleUris
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * An array of additional bundles for the product, if applicable. To be treated as secondary documents to the `bundleUri`. Only to be used if there is a primary `bundleUri`.
    */
  var additionalBundleUris: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * An array of additional eligibility rules and criteria for the product, if applicable. To be treated as secondary documents to the `eligibilityUri`. Only to be used if there is a primary `eligibilityUri`.
    */
  var additionalEligibilityUris: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * An array of additional fees, pricing, discounts, exemptions and bonuses for the product, if applicable. To be treated as secondary documents to the `feesAndPricingUri`. Only to be used if there is a primary `feesAndPricingUri`.
    */
  var additionalFeesAndPricingUris: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * An array of additional general overviews for the product or features of the product, if applicable. To be treated as secondary documents to the `overviewUri`. Only to be used if there is a primary `overviewUri`.
    */
  var additionalOverviewUris: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * An array of additional terms and conditions for the product, if applicable. To be treated as secondary documents to the `termsUri`. Only to be used if there is a primary `termsUri`.
    */
  var additionalTermsUris: js.UndefOr[js.Array[Description] | Null] = js.undefined
  
  /**
    * Description of a bundle that this product can be part of. Mandatory if `additionalBundleUris` includes one or more supporting documents.
    */
  var bundleUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Eligibility rules and criteria for the product. Mandatory if `additionalEligibilityUris` includes one or more supporting documents.
    */
  var eligibilityUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of fees, pricing, discounts, exemptions and bonuses for the product. Mandatory if `additionalFeesAndPricingUris` includes one or more supporting documents.
    */
  var feesAndPricingUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * General overview of the product. Mandatory if `additionalOverviewUris` includes one or more supporting documents.
    */
  var overviewUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Terms and conditions for the product. Mandatory if `additionalTermsUris` includes one or more supporting documents.
    */
  var termsUri: js.UndefOr[String | Null] = js.undefined
}
object AdditionalBundleUris {
  
  inline def apply(): AdditionalBundleUris = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalBundleUris]
  }
  
  extension [Self <: AdditionalBundleUris](x: Self) {
    
    inline def setAdditionalBundleUris(value: js.Array[Description]): Self = StObject.set(x, "additionalBundleUris", value.asInstanceOf[js.Any])
    
    inline def setAdditionalBundleUrisNull: Self = StObject.set(x, "additionalBundleUris", null)
    
    inline def setAdditionalBundleUrisUndefined: Self = StObject.set(x, "additionalBundleUris", js.undefined)
    
    inline def setAdditionalBundleUrisVarargs(value: Description*): Self = StObject.set(x, "additionalBundleUris", js.Array(value*))
    
    inline def setAdditionalEligibilityUris(value: js.Array[Description]): Self = StObject.set(x, "additionalEligibilityUris", value.asInstanceOf[js.Any])
    
    inline def setAdditionalEligibilityUrisNull: Self = StObject.set(x, "additionalEligibilityUris", null)
    
    inline def setAdditionalEligibilityUrisUndefined: Self = StObject.set(x, "additionalEligibilityUris", js.undefined)
    
    inline def setAdditionalEligibilityUrisVarargs(value: Description*): Self = StObject.set(x, "additionalEligibilityUris", js.Array(value*))
    
    inline def setAdditionalFeesAndPricingUris(value: js.Array[Description]): Self = StObject.set(x, "additionalFeesAndPricingUris", value.asInstanceOf[js.Any])
    
    inline def setAdditionalFeesAndPricingUrisNull: Self = StObject.set(x, "additionalFeesAndPricingUris", null)
    
    inline def setAdditionalFeesAndPricingUrisUndefined: Self = StObject.set(x, "additionalFeesAndPricingUris", js.undefined)
    
    inline def setAdditionalFeesAndPricingUrisVarargs(value: Description*): Self = StObject.set(x, "additionalFeesAndPricingUris", js.Array(value*))
    
    inline def setAdditionalOverviewUris(value: js.Array[Description]): Self = StObject.set(x, "additionalOverviewUris", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOverviewUrisNull: Self = StObject.set(x, "additionalOverviewUris", null)
    
    inline def setAdditionalOverviewUrisUndefined: Self = StObject.set(x, "additionalOverviewUris", js.undefined)
    
    inline def setAdditionalOverviewUrisVarargs(value: Description*): Self = StObject.set(x, "additionalOverviewUris", js.Array(value*))
    
    inline def setAdditionalTermsUris(value: js.Array[Description]): Self = StObject.set(x, "additionalTermsUris", value.asInstanceOf[js.Any])
    
    inline def setAdditionalTermsUrisNull: Self = StObject.set(x, "additionalTermsUris", null)
    
    inline def setAdditionalTermsUrisUndefined: Self = StObject.set(x, "additionalTermsUris", js.undefined)
    
    inline def setAdditionalTermsUrisVarargs(value: Description*): Self = StObject.set(x, "additionalTermsUris", js.Array(value*))
    
    inline def setBundleUri(value: String): Self = StObject.set(x, "bundleUri", value.asInstanceOf[js.Any])
    
    inline def setBundleUriNull: Self = StObject.set(x, "bundleUri", null)
    
    inline def setBundleUriUndefined: Self = StObject.set(x, "bundleUri", js.undefined)
    
    inline def setEligibilityUri(value: String): Self = StObject.set(x, "eligibilityUri", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUriNull: Self = StObject.set(x, "eligibilityUri", null)
    
    inline def setEligibilityUriUndefined: Self = StObject.set(x, "eligibilityUri", js.undefined)
    
    inline def setFeesAndPricingUri(value: String): Self = StObject.set(x, "feesAndPricingUri", value.asInstanceOf[js.Any])
    
    inline def setFeesAndPricingUriNull: Self = StObject.set(x, "feesAndPricingUri", null)
    
    inline def setFeesAndPricingUriUndefined: Self = StObject.set(x, "feesAndPricingUri", js.undefined)
    
    inline def setOverviewUri(value: String): Self = StObject.set(x, "overviewUri", value.asInstanceOf[js.Any])
    
    inline def setOverviewUriNull: Self = StObject.set(x, "overviewUri", null)
    
    inline def setOverviewUriUndefined: Self = StObject.set(x, "overviewUri", js.undefined)
    
    inline def setTermsUri(value: String): Self = StObject.set(x, "termsUri", value.asInstanceOf[js.Any])
    
    inline def setTermsUriNull: Self = StObject.set(x, "termsUri", null)
    
    inline def setTermsUriUndefined: Self = StObject.set(x, "termsUri", js.undefined)
  }
}
