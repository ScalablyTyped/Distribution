package typings.consumerDataStandards.bankingMod

import typings.consumerDataStandards.anon.AccrualFrequency
import typings.consumerDataStandards.anon.AdditionalValue
import typings.consumerDataStandards.anon.ApplicationFrequency
import typings.consumerDataStandards.anon.ConstraintType
import typings.consumerDataStandards.anon.DictkAdditionalInfo
import typings.consumerDataStandards.anon.EligibilityType
import typings.consumerDataStandards.anon.ProductIds
import typings.consumerDataStandards.consumerDataStandardsStrings.BUSINESS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.CRED_AND_CHRG_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.LEASES
import typings.consumerDataStandards.consumerDataStandardsStrings.MARGIN_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.OVERDRAFTS
import typings.consumerDataStandards.consumerDataStandardsStrings.PERS_LOANS
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED_TRUST_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.RESIDENTIAL_MORTGAGES
import typings.consumerDataStandards.consumerDataStandardsStrings.TERM_DEPOSITS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRADE_FINANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.TRANS_AND_SAVINGS_ACCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.TRAVEL_CARDS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductDetailV4
  extends StObject
     with BankingProductV4 {
  
  /**
    * An array of bundles that this product participates in.  Each bundle is described by free form information but also by a list of product IDs of the other products that are included in the bundle.  It is assumed that the current product is included in the bundle also
    */
  var bundles: js.UndefOr[js.Array[ProductIds]] = js.undefined
  
  /**
    * Constraints on the application for or operation of the product such as minimum balances or limit thresholds
    */
  var constraints: js.UndefOr[js.Array[ConstraintType]] = js.undefined
  
  /**
    * Interest rates available for deposits
    */
  var depositRates: js.UndefOr[js.Array[AdditionalValue]] = js.undefined
  
  /**
    * Eligibility criteria for the product
    */
  var eligibility: js.UndefOr[js.Array[EligibilityType]] = js.undefined
  
  /**
    * Array of features available for the product
    */
  var features: js.UndefOr[js.Array[DictkAdditionalInfo]] = js.undefined
  
  /**
    * Fees applicable for the product
    */
  var fees: js.UndefOr[js.Array[AccrualFrequency]] = js.undefined
  
  /**
    * Interest rates charged against lending balances
    */
  var lendingRates: js.UndefOr[js.Array[ApplicationFrequency]] = js.undefined
}
object BankingProductDetailV4 {
  
  inline def apply(
    brand: String,
    description: String,
    isTailored: Boolean,
    lastUpdated: String,
    name: String,
    productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS,
    productId: String
  ): BankingProductDetailV4 = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isTailored = isTailored.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productCategory = productCategory.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductDetailV4]
  }
  
  extension [Self <: BankingProductDetailV4](x: Self) {
    
    inline def setBundles(value: js.Array[ProductIds]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: ProductIds*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setConstraints(value: js.Array[ConstraintType]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setConstraintsVarargs(value: ConstraintType*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setDepositRates(value: js.Array[AdditionalValue]): Self = StObject.set(x, "depositRates", value.asInstanceOf[js.Any])
    
    inline def setDepositRatesUndefined: Self = StObject.set(x, "depositRates", js.undefined)
    
    inline def setDepositRatesVarargs(value: AdditionalValue*): Self = StObject.set(x, "depositRates", js.Array(value*))
    
    inline def setEligibility(value: js.Array[EligibilityType]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: EligibilityType*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
    inline def setFeatures(value: js.Array[DictkAdditionalInfo]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DictkAdditionalInfo*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFees(value: js.Array[AccrualFrequency]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: AccrualFrequency*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setLendingRates(value: js.Array[ApplicationFrequency]): Self = StObject.set(x, "lendingRates", value.asInstanceOf[js.Any])
    
    inline def setLendingRatesUndefined: Self = StObject.set(x, "lendingRates", js.undefined)
    
    inline def setLendingRatesVarargs(value: ApplicationFrequency*): Self = StObject.set(x, "lendingRates", js.Array(value*))
  }
}
