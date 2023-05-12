package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAdditionalInformation
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A link to detail on bundles that this plan can be a part of
    */
  var bundleUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to detail on eligibility criteria for the plan
    */
  var eligibilityUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to a general overview of the plan
    */
  var overviewUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to detail on pricing for the plan
    */
  var pricingUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to terms and conditions for the plan
    */
  var termsUri: js.UndefOr[String | Null] = js.undefined
}
object TelcoAdditionalInformation {
  
  inline def apply(): TelcoAdditionalInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoAdditionalInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAdditionalInformation] (val x: Self) extends AnyVal {
    
    inline def setBundleUri(value: String): Self = StObject.set(x, "bundleUri", value.asInstanceOf[js.Any])
    
    inline def setBundleUriNull: Self = StObject.set(x, "bundleUri", null)
    
    inline def setBundleUriUndefined: Self = StObject.set(x, "bundleUri", js.undefined)
    
    inline def setEligibilityUri(value: String): Self = StObject.set(x, "eligibilityUri", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUriNull: Self = StObject.set(x, "eligibilityUri", null)
    
    inline def setEligibilityUriUndefined: Self = StObject.set(x, "eligibilityUri", js.undefined)
    
    inline def setOverviewUri(value: String): Self = StObject.set(x, "overviewUri", value.asInstanceOf[js.Any])
    
    inline def setOverviewUriNull: Self = StObject.set(x, "overviewUri", null)
    
    inline def setOverviewUriUndefined: Self = StObject.set(x, "overviewUri", js.undefined)
    
    inline def setPricingUri(value: String): Self = StObject.set(x, "pricingUri", value.asInstanceOf[js.Any])
    
    inline def setPricingUriNull: Self = StObject.set(x, "pricingUri", null)
    
    inline def setPricingUriUndefined: Self = StObject.set(x, "pricingUri", js.undefined)
    
    inline def setTermsUri(value: String): Self = StObject.set(x, "termsUri", value.asInstanceOf[js.Any])
    
    inline def setTermsUriNull: Self = StObject.set(x, "termsUri", null)
    
    inline def setTermsUriUndefined: Self = StObject.set(x, "termsUri", js.undefined)
  }
}
