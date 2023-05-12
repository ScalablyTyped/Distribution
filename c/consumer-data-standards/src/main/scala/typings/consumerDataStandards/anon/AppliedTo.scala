package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.CONCESSION
import typings.consumerDataStandards.consumerDataStandardsStrings.GRANT
import typings.consumerDataStandards.consumerDataStandardsStrings.INVOICE
import typings.consumerDataStandards.consumerDataStandardsStrings.REBATE
import typings.consumerDataStandards.consumerDataStandardsStrings.USAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppliedTo
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the concession
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional link to additional information regarding the concession
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Conditional attribute for the amount of discount for the concession- required if type is FIXED_AMOUNT
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Array of ENUM's to specify what the concession applies to. Multiple ENUM values can be provided. If absent, USAGE is assumed
    */
  var appliedTo: js.UndefOr[(js.Array[INVOICE | USAGE]) | Null] = js.undefined
  
  /**
    * Conditional attribute for frequency at which a concession is applied. Required if type is FIXED_AMOUNT or FIXED_PERCENTAGE. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var discountFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the concession
    */
  var displayName: String
  
  /**
    * Optional end date for the application of the concession
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Conditional attribute for the percentage of discount of concession - required if type is FIXED_PERCENTAGE
    */
  var percentage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional start date for the application of the concession
    */
  var startDate: String
  
  /**
    * The concession type
    */
  var `type`: CONCESSION | REBATE | GRANT
}
object AppliedTo {
  
  inline def apply(displayName: String, startDate: String, `type`: CONCESSION | REBATE | GRANT): AppliedTo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppliedTo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAppliedTo(value: js.Array[INVOICE | USAGE]): Self = StObject.set(x, "appliedTo", value.asInstanceOf[js.Any])
    
    inline def setAppliedToNull: Self = StObject.set(x, "appliedTo", null)
    
    inline def setAppliedToUndefined: Self = StObject.set(x, "appliedTo", js.undefined)
    
    inline def setAppliedToVarargs(value: (INVOICE | USAGE)*): Self = StObject.set(x, "appliedTo", js.Array(value*))
    
    inline def setDiscountFrequency(value: String): Self = StObject.set(x, "discountFrequency", value.asInstanceOf[js.Any])
    
    inline def setDiscountFrequencyNull: Self = StObject.set(x, "discountFrequency", null)
    
    inline def setDiscountFrequencyUndefined: Self = StObject.set(x, "discountFrequency", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setPercentage(value: String): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageNull: Self = StObject.set(x, "percentage", null)
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setType(value: CONCESSION | REBATE | GRANT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
