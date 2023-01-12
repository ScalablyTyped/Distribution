package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS
import typings.consumerDataStandards.consumerDataStandardsStrings.EMPLOYMENT_STATUS
import typings.consumerDataStandards.consumerDataStandardsStrings.MAX_AGE
import typings.consumerDataStandards.consumerDataStandardsStrings.MIN_AGE
import typings.consumerDataStandards.consumerDataStandardsStrings.MIN_INCOME
import typings.consumerDataStandards.consumerDataStandardsStrings.MIN_TURNOVER
import typings.consumerDataStandards.consumerDataStandardsStrings.NATURAL_PERSON
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PENSION_RECIPIENT
import typings.consumerDataStandards.consumerDataStandardsStrings.RESIDENCY_STATUS
import typings.consumerDataStandards.consumerDataStandardsStrings.STAFF
import typings.consumerDataStandards.consumerDataStandardsStrings.STUDENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EligibilityType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the [eligibility](#tocSproducteligibilitytypedoc) criteria. Mandatory if the field is set to OTHER
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this eligibility criteria
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [eligibilityType](#tocSproducteligibilitytypedoc) specified. Whether mandatory or not is dependent on the value of [eligibilityType](#tocSproducteligibilitytypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning
    */
  var eligibilityType: BUSINESS | EMPLOYMENT_STATUS | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
}
object EligibilityType {
  
  inline def apply(
    eligibilityType: BUSINESS | EMPLOYMENT_STATUS | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
  ): EligibilityType = {
    val __obj = js.Dynamic.literal(eligibilityType = eligibilityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EligibilityType] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setEligibilityType(
      value: BUSINESS | EMPLOYMENT_STATUS | MAX_AGE | MIN_AGE | MIN_INCOME | MIN_TURNOVER | NATURAL_PERSON | OTHER | PENSION_RECIPIENT | RESIDENCY_STATUS | STAFF | STUDENT
    ): Self = StObject.set(x, "eligibilityType", value.asInstanceOf[js.Any])
  }
}
