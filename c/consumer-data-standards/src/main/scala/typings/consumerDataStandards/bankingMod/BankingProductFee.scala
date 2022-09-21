package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccruedRate
import typings.consumerDataStandards.consumerDataStandardsStrings.DEPOSIT
import typings.consumerDataStandards.consumerDataStandardsStrings.EVENT
import typings.consumerDataStandards.consumerDataStandardsStrings.EXIT
import typings.consumerDataStandards.consumerDataStandardsStrings.PAYMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.PERIODIC
import typings.consumerDataStandards.consumerDataStandardsStrings.PURCHASE
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANSACTION
import typings.consumerDataStandards.consumerDataStandardsStrings.UPFRONT
import typings.consumerDataStandards.consumerDataStandardsStrings.VARIABLE
import typings.consumerDataStandards.consumerDataStandardsStrings.WITHDRAWAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductFee
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The indicative frequency with which the fee is calculated on the account. Only applies if balanceRate or accruedRate is also present. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var accrualFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A fee rate calculated based on a proportion of the calculated interest accrued on the account. One of amount, balanceRate, transactionRate and accruedRate is mandatory unless the *feeType* "VARIABLE" is supplied
    */
  var accruedRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display text providing more information on the fee
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this fee
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [feeType](#tocSproductfeetypedoc) specified. Whether mandatory or not is dependent on the value of [feeType](#tocSproductfeetypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount charged for the fee. One of amount, balanceRate, transactionRate and accruedRate is mandatory unless the *feeType* "VARIABLE" is supplied
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A fee rate calculated based on a proportion of the balance. One of amount, balanceRate, transactionRate and accruedRate is mandatory unless the *feeType* "VARIABLE" is supplied.
    */
  var balanceRate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency the fee will be charged in. Assumes AUD if absent
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An optional list of discounts to this fee that may be available
    */
  var discounts: js.UndefOr[js.Array[AccruedRate] | Null] = js.undefined
  
  /**
    * The type of fee
    */
  var feeType: DEPOSIT | EVENT | EXIT | PAYMENT | PERIODIC | PURCHASE | TRANSACTION | UPFRONT | VARIABLE | WITHDRAWAL
  
  /**
    * Name of the fee
    */
  var name: String
  
  /**
    * A fee rate calculated based on a proportion of a transaction. One of amount, balanceRate, transactionRate and accruedRate is mandatory unless the *feeType* "VARIABLE" is supplied
    */
  var transactionRate: js.UndefOr[String | Null] = js.undefined
}
object BankingProductFee {
  
  inline def apply(
    feeType: DEPOSIT | EVENT | EXIT | PAYMENT | PERIODIC | PURCHASE | TRANSACTION | UPFRONT | VARIABLE | WITHDRAWAL,
    name: String
  ): BankingProductFee = {
    val __obj = js.Dynamic.literal(feeType = feeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductFee]
  }
  
  extension [Self <: BankingProductFee](x: Self) {
    
    inline def setAccrualFrequency(value: String): Self = StObject.set(x, "accrualFrequency", value.asInstanceOf[js.Any])
    
    inline def setAccrualFrequencyNull: Self = StObject.set(x, "accrualFrequency", null)
    
    inline def setAccrualFrequencyUndefined: Self = StObject.set(x, "accrualFrequency", js.undefined)
    
    inline def setAccruedRate(value: String): Self = StObject.set(x, "accruedRate", value.asInstanceOf[js.Any])
    
    inline def setAccruedRateNull: Self = StObject.set(x, "accruedRate", null)
    
    inline def setAccruedRateUndefined: Self = StObject.set(x, "accruedRate", js.undefined)
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBalanceRate(value: String): Self = StObject.set(x, "balanceRate", value.asInstanceOf[js.Any])
    
    inline def setBalanceRateNull: Self = StObject.set(x, "balanceRate", null)
    
    inline def setBalanceRateUndefined: Self = StObject.set(x, "balanceRate", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDiscounts(value: js.Array[AccruedRate]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsNull: Self = StObject.set(x, "discounts", null)
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: AccruedRate*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setFeeType(
      value: DEPOSIT | EVENT | EXIT | PAYMENT | PERIODIC | PURCHASE | TRANSACTION | UPFRONT | VARIABLE | WITHDRAWAL
    ): Self = StObject.set(x, "feeType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTransactionRate(value: String): Self = StObject.set(x, "transactionRate", value.asInstanceOf[js.Any])
    
    inline def setTransactionRateNull: Self = StObject.set(x, "transactionRate", null)
    
    inline def setTransactionRateUndefined: Self = StObject.set(x, "transactionRate", js.undefined)
  }
}
