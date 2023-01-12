package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
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

trait ApplicationUri
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
    * An array of card art images
    */
  var cardArt: js.UndefOr[js.Array[ImageUri] | Null] = js.undefined
  
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
    * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
    */
  var isTailored: Boolean
  
  /**
    * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
    */
  var lastUpdated: String
  
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
object ApplicationUri {
  
  inline def apply(
    brand: String,
    description: String,
    isTailored: Boolean,
    lastUpdated: String,
    name: String,
    productCategory: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS,
    productId: String
  ): ApplicationUri = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isTailored = isTailored.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productCategory = productCategory.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationUri] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInformation(value: AdditionalBundleUris): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
    
    inline def setApplicationUri(value: String): Self = StObject.set(x, "applicationUri", value.asInstanceOf[js.Any])
    
    inline def setApplicationUriNull: Self = StObject.set(x, "applicationUri", null)
    
    inline def setApplicationUriUndefined: Self = StObject.set(x, "applicationUri", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setBrandNameNull: Self = StObject.set(x, "brandName", null)
    
    inline def setBrandNameUndefined: Self = StObject.set(x, "brandName", js.undefined)
    
    inline def setCardArt(value: js.Array[ImageUri]): Self = StObject.set(x, "cardArt", value.asInstanceOf[js.Any])
    
    inline def setCardArtNull: Self = StObject.set(x, "cardArt", null)
    
    inline def setCardArtUndefined: Self = StObject.set(x, "cardArt", js.undefined)
    
    inline def setCardArtVarargs(value: ImageUri*): Self = StObject.set(x, "cardArt", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFrom(value: String): Self = StObject.set(x, "effectiveFrom", value.asInstanceOf[js.Any])
    
    inline def setEffectiveFromNull: Self = StObject.set(x, "effectiveFrom", null)
    
    inline def setEffectiveFromUndefined: Self = StObject.set(x, "effectiveFrom", js.undefined)
    
    inline def setEffectiveTo(value: String): Self = StObject.set(x, "effectiveTo", value.asInstanceOf[js.Any])
    
    inline def setEffectiveToNull: Self = StObject.set(x, "effectiveTo", null)
    
    inline def setEffectiveToUndefined: Self = StObject.set(x, "effectiveTo", js.undefined)
    
    inline def setIsTailored(value: Boolean): Self = StObject.set(x, "isTailored", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProductCategory(
      value: BUSINESS_LOANS | CRED_AND_CHRG_CARDS | LEASES | MARGIN_LOANS | OVERDRAFTS | PERS_LOANS | REGULATED_TRUST_ACCOUNTS | RESIDENTIAL_MORTGAGES | TERM_DEPOSITS | TRADE_FINANCE | TRANS_AND_SAVINGS_ACCOUNTS | TRAVEL_CARDS
    ): Self = StObject.set(x, "productCategory", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
