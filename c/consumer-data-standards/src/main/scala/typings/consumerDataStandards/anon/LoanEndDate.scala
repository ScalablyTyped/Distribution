package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_ONLY
import typings.consumerDataStandards.consumerDataStandardsStrings.PRINCIPAL_AND_INTEREST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoanEndDate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Date that the loan is due to be repaid in full
    */
  var loanEndDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum amount of funds that can be redrawn. If not present redraw is not available even if the feature exists for the account
    */
  var maxRedraw: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent assumes AUD
    */
  var maxRedrawCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum amount of next instalment
    */
  var minInstalmentAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent assumes AUD
    */
  var minInstalmentCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum redraw amount
    */
  var minRedraw: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent assumes AUD
    */
  var minRedrawCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Next date that an instalment is required
    */
  var nextInstalmentDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set to true if one or more offset accounts are configured for this loan account
    */
  var offsetAccountEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The accountIDs of the configured offset accounts attached to this loan. Only offset accounts that can be accessed under the current authorisation should be included. It is expected behaviour that offsetAccountEnabled is set to true but the offsetAccountIds field is absent or empty. This represents a situation where an offset account exists but details can not be accessed under the current authorisation
    */
  var offsetAccountIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional original loan value
    */
  var originalLoanAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If absent assumes AUD
    */
  var originalLoanCurrency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional original start date for the loan
    */
  var originalStartDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The expected or required repayment frequency. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var repaymentFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options in place for repayments. If absent defaults to PRINCIPAL_AND_INTEREST
    */
  var repaymentType: js.UndefOr[INTEREST_ONLY | PRINCIPAL_AND_INTEREST | Null] = js.undefined
}
object LoanEndDate {
  
  inline def apply(): LoanEndDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoanEndDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoanEndDate] (val x: Self) extends AnyVal {
    
    inline def setLoanEndDate(value: String): Self = StObject.set(x, "loanEndDate", value.asInstanceOf[js.Any])
    
    inline def setLoanEndDateNull: Self = StObject.set(x, "loanEndDate", null)
    
    inline def setLoanEndDateUndefined: Self = StObject.set(x, "loanEndDate", js.undefined)
    
    inline def setMaxRedraw(value: String): Self = StObject.set(x, "maxRedraw", value.asInstanceOf[js.Any])
    
    inline def setMaxRedrawCurrency(value: String): Self = StObject.set(x, "maxRedrawCurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxRedrawCurrencyNull: Self = StObject.set(x, "maxRedrawCurrency", null)
    
    inline def setMaxRedrawCurrencyUndefined: Self = StObject.set(x, "maxRedrawCurrency", js.undefined)
    
    inline def setMaxRedrawNull: Self = StObject.set(x, "maxRedraw", null)
    
    inline def setMaxRedrawUndefined: Self = StObject.set(x, "maxRedraw", js.undefined)
    
    inline def setMinInstalmentAmount(value: String): Self = StObject.set(x, "minInstalmentAmount", value.asInstanceOf[js.Any])
    
    inline def setMinInstalmentAmountNull: Self = StObject.set(x, "minInstalmentAmount", null)
    
    inline def setMinInstalmentAmountUndefined: Self = StObject.set(x, "minInstalmentAmount", js.undefined)
    
    inline def setMinInstalmentCurrency(value: String): Self = StObject.set(x, "minInstalmentCurrency", value.asInstanceOf[js.Any])
    
    inline def setMinInstalmentCurrencyNull: Self = StObject.set(x, "minInstalmentCurrency", null)
    
    inline def setMinInstalmentCurrencyUndefined: Self = StObject.set(x, "minInstalmentCurrency", js.undefined)
    
    inline def setMinRedraw(value: String): Self = StObject.set(x, "minRedraw", value.asInstanceOf[js.Any])
    
    inline def setMinRedrawCurrency(value: String): Self = StObject.set(x, "minRedrawCurrency", value.asInstanceOf[js.Any])
    
    inline def setMinRedrawCurrencyNull: Self = StObject.set(x, "minRedrawCurrency", null)
    
    inline def setMinRedrawCurrencyUndefined: Self = StObject.set(x, "minRedrawCurrency", js.undefined)
    
    inline def setMinRedrawNull: Self = StObject.set(x, "minRedraw", null)
    
    inline def setMinRedrawUndefined: Self = StObject.set(x, "minRedraw", js.undefined)
    
    inline def setNextInstalmentDate(value: String): Self = StObject.set(x, "nextInstalmentDate", value.asInstanceOf[js.Any])
    
    inline def setNextInstalmentDateNull: Self = StObject.set(x, "nextInstalmentDate", null)
    
    inline def setNextInstalmentDateUndefined: Self = StObject.set(x, "nextInstalmentDate", js.undefined)
    
    inline def setOffsetAccountEnabled(value: Boolean): Self = StObject.set(x, "offsetAccountEnabled", value.asInstanceOf[js.Any])
    
    inline def setOffsetAccountEnabledNull: Self = StObject.set(x, "offsetAccountEnabled", null)
    
    inline def setOffsetAccountEnabledUndefined: Self = StObject.set(x, "offsetAccountEnabled", js.undefined)
    
    inline def setOffsetAccountIds(value: js.Array[String]): Self = StObject.set(x, "offsetAccountIds", value.asInstanceOf[js.Any])
    
    inline def setOffsetAccountIdsNull: Self = StObject.set(x, "offsetAccountIds", null)
    
    inline def setOffsetAccountIdsUndefined: Self = StObject.set(x, "offsetAccountIds", js.undefined)
    
    inline def setOffsetAccountIdsVarargs(value: String*): Self = StObject.set(x, "offsetAccountIds", js.Array(value*))
    
    inline def setOriginalLoanAmount(value: String): Self = StObject.set(x, "originalLoanAmount", value.asInstanceOf[js.Any])
    
    inline def setOriginalLoanAmountNull: Self = StObject.set(x, "originalLoanAmount", null)
    
    inline def setOriginalLoanAmountUndefined: Self = StObject.set(x, "originalLoanAmount", js.undefined)
    
    inline def setOriginalLoanCurrency(value: String): Self = StObject.set(x, "originalLoanCurrency", value.asInstanceOf[js.Any])
    
    inline def setOriginalLoanCurrencyNull: Self = StObject.set(x, "originalLoanCurrency", null)
    
    inline def setOriginalLoanCurrencyUndefined: Self = StObject.set(x, "originalLoanCurrency", js.undefined)
    
    inline def setOriginalStartDate(value: String): Self = StObject.set(x, "originalStartDate", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartDateNull: Self = StObject.set(x, "originalStartDate", null)
    
    inline def setOriginalStartDateUndefined: Self = StObject.set(x, "originalStartDate", js.undefined)
    
    inline def setRepaymentFrequency(value: String): Self = StObject.set(x, "repaymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setRepaymentFrequencyNull: Self = StObject.set(x, "repaymentFrequency", null)
    
    inline def setRepaymentFrequencyUndefined: Self = StObject.set(x, "repaymentFrequency", js.undefined)
    
    inline def setRepaymentType(value: INTEREST_ONLY | PRINCIPAL_AND_INTEREST): Self = StObject.set(x, "repaymentType", value.asInstanceOf[js.Any])
    
    inline def setRepaymentTypeNull: Self = StObject.set(x, "repaymentType", null)
    
    inline def setRepaymentTypeUndefined: Self = StObject.set(x, "repaymentType", js.undefined)
  }
}
