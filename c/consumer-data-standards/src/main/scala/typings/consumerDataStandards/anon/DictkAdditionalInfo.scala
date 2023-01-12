package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ADDITIONAL_CARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.BALANCE_TRANSFERS
import typings.consumerDataStandards.consumerDataStandardsStrings.BILL_PAYMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.BONUS_REWARDS
import typings.consumerDataStandards.consumerDataStandardsStrings.CARD_ACCESS
import typings.consumerDataStandards.consumerDataStandardsStrings.CASHBACK_OFFER
import typings.consumerDataStandards.consumerDataStandardsStrings.COMPLEMENTARY_PRODUCT_DISCOUNTS
import typings.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_BANKING
import typings.consumerDataStandards.consumerDataStandardsStrings.DIGITAL_WALLET
import typings.consumerDataStandards.consumerDataStandardsStrings.DONATE_INTEREST
import typings.consumerDataStandards.consumerDataStandardsStrings.EXTRA_REPAYMENTS
import typings.consumerDataStandards.consumerDataStandardsStrings.FRAUD_PROTECTION
import typings.consumerDataStandards.consumerDataStandardsStrings.FREE_TXNS
import typings.consumerDataStandards.consumerDataStandardsStrings.FREE_TXNS_ALLOWANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.GUARANTOR
import typings.consumerDataStandards.consumerDataStandardsStrings.INSTALMENT_PLAN
import typings.consumerDataStandards.consumerDataStandardsStrings.INSURANCE
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_FREE
import typings.consumerDataStandards.consumerDataStandardsStrings.INTEREST_FREE_TRANSFERS
import typings.consumerDataStandards.consumerDataStandardsStrings.LOYALTY_PROGRAM
import typings.consumerDataStandards.consumerDataStandardsStrings.NOTIFICATIONS
import typings.consumerDataStandards.consumerDataStandardsStrings.NPP_ENABLED
import typings.consumerDataStandards.consumerDataStandardsStrings.NPP_PAYID
import typings.consumerDataStandards.consumerDataStandardsStrings.OFFSET
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.OVERDRAFT
import typings.consumerDataStandards.consumerDataStandardsStrings.REDRAW
import typings.consumerDataStandards.consumerDataStandardsStrings.RELATIONSHIP_MANAGEMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.UNLIMITED_TXNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAdditionalInfo
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Display text providing more information on the feature. Mandatory if the [feature type](#tocSproductfeaturetypedoc) is set to OTHER
    */
  var additionalInfo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link to a web page with more information on this feature
    */
  var additionalInfoUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generic field containing additional information relevant to the [featureType](#tocSproductfeaturetypedoc) specified. Whether mandatory or not is dependent on the value of the [featureType.](#tocSproductfeaturetypedoc)
    */
  var additionalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of feature described
    */
  var featureType: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
}
object DictkAdditionalInfo {
  
  inline def apply(
    featureType: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
  ): DictkAdditionalInfo = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAdditionalInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkAdditionalInfo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfo(value: String): Self = StObject.set(x, "additionalInfo", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoNull: Self = StObject.set(x, "additionalInfo", null)
    
    inline def setAdditionalInfoUndefined: Self = StObject.set(x, "additionalInfo", js.undefined)
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInfoUriNull: Self = StObject.set(x, "additionalInfoUri", null)
    
    inline def setAdditionalInfoUriUndefined: Self = StObject.set(x, "additionalInfoUri", js.undefined)
    
    inline def setAdditionalValue(value: String): Self = StObject.set(x, "additionalValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalValueNull: Self = StObject.set(x, "additionalValue", null)
    
    inline def setAdditionalValueUndefined: Self = StObject.set(x, "additionalValue", js.undefined)
    
    inline def setFeatureType(
      value: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
    ): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
  }
}
