package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AccrualFrequency
import typings.consumerDataStandards.anon.AdditionalBundleUris
import typings.consumerDataStandards.anon.AdditionalValue
import typings.consumerDataStandards.anon.ApplicationFrequency
import typings.consumerDataStandards.anon.ConstraintType
import typings.consumerDataStandards.anon.DictkAdditionalInfo
import typings.consumerDataStandards.anon.EligibilityType
import typings.consumerDataStandards.anon.ImageUri
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
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object that contains links to additional information on specific topics
    */
  var additionalInformation: js.UndefOr[AdditionalBundleUris] = js.undefined
  
  /**
    * A link to an application web page where this product can be applied for.
    */
  var applicationUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A label of the brand for the product. Able to be used for filtering. For data holders with single brands this value is still required
    */
  var brand: String
  
  /**
    * An optional display name of the brand
    */
  var brandName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An array of bundles that this product participates in.  Each bundle is described by free form information but also by a list of product IDs of the other products that are included in the bundle.  It is assumed that the current product is included in the bundle also
    */
  var bundles: js.UndefOr[js.Array[ProductIds]] = js.undefined
  
  /**
    * An array of card art images
    */
  var cardArt: js.UndefOr[js.Array[ImageUri] | Null] = js.undefined
  
  /**
    * Constraints on the application for or operation of the product such as minimum balances or limit thresholds
    */
  var constraints: js.UndefOr[js.Array[ConstraintType]] = js.undefined
  
  /**
    * Interest rates available for deposits
    */
  var depositRates: js.UndefOr[js.Array[AdditionalValue]] = js.undefined
  
  /**
    * A description of the product
    */
  var description: String
  
  /**
    * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
    */
  var effectiveFrom: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
    */
  var effectiveTo: js.UndefOr[String | Null] = js.undefined
  
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
    * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
    */
  var isTailored: Boolean
  
  /**
    * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
    */
  var lastUpdated: String
  
  /**
    * Interest rates charged against lending balances
    */
  var lendingRates: js.UndefOr[js.Array[ApplicationFrequency]] = js.undefined
  
  /**
    * The display name of the product
    */
  var name: String
  
  /**
    * The category to which a product or account belongs. See [here](#product-categories) for more details
    */
  var productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS
  
  /**
    * A data holder specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
    */
  var productId: String
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
    
    inline def setAdditionalInformation(value: AdditionalBundleUris): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setApplicationUri(value: String): Self = StObject.set(x, "applicationUri", value.asInstanceOf[js.Any])
    
    inline def setApplicationUriNull: Self = StObject.set(x, "applicationUri", null)
    
    inline def setApplicationUriUndefined: Self = StObject.set(x, "applicationUri", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBrandNameNull: Self = StObject.set(x, "brandName", null)
    
    inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
    
    inline def setBundles(value: js.Array[ProductIds]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: ProductIds*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setCardArt(value: js.Array[ImageUri]): Self = StObject.set(x, "cardArt", value.asInstanceOf[js.Any])
    
    inline def setCardArtNull: Self = StObject.set(x, "cardArt", null)
    
    inline def setCardArtUndefined: Self = StObject.set(x, "cardArt", js.undefined)
    
    inline def setCardArtVarargs(value: ImageUri*): Self = StObject.set(x, "cardArt", js.Array(value*))
    
    inline def setConstraints(value: js.Array[ConstraintType]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setConstraintsVarargs(value: ConstraintType*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setDepositRates(value: js.Array[AdditionalValue]): Self = StObject.set(x, "depositRates", value.asInstanceOf[js.Any])
    
    inline def setDepositRatesUndefined: Self = StObject.set(x, "depositRates", js.undefined)
    
    inline def setDepositRatesVarargs(value: AdditionalValue*): Self = StObject.set(x, "depositRates", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFrom(value: String): Self = StObject.set(x, "effectiveFrom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFromNull: Self = StObject.set(x, "effectiveFrom", null)
    
    inline def setEffectiveFromUndefined: Self = StObject.set(x, "effectiveFrom", js.undefined)
    
    inline def setEffectiveTo(value: String): Self = StObject.set(x, "effectiveTo", value.asInstanceOf[js.Any])
    
    inline def setEffectiveToNull: Self = StObject.set(x, "effectiveTo", null)
    
    inline def setEffectiveToUndefined: Self = StObject.set(x, "effectiveTo", js.undefined)
    
    inline def setEligibility(value: js.Array[EligibilityType]): Self = StObject.set(x, "eligibility", value.asInstanceOf[js.Any])
    
    inline def setEligibilityUndefined: Self = StObject.set(x, "eligibility", js.undefined)
    
    inline def setEligibilityVarargs(value: EligibilityType*): Self = StObject.set(x, "eligibility", js.Array(value*))
    
    inline def setFeatures(value: js.Array[DictkAdditionalInfo]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DictkAdditionalInfo*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFees(value: js.Array[AccrualFrequency]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: AccrualFrequency*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setIsTailored(value: Boolean): Self = StObject.set(x, "isTailored", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLendingRates(value: js.Array[ApplicationFrequency]): Self = StObject.set(x, "lendingRates", value.asInstanceOf[js.Any])
    
    inline def setLendingRatesUndefined: Self = StObject.set(x, "lendingRates", js.undefined)
    
    inline def setLendingRatesVarargs(value: ApplicationFrequency*): Self = StObject.set(x, "lendingRates", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProductCategory(
      value: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS
    ): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
