package typings.consumerDataStandards.bankingMod

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

trait accV3DetailFeatureObj
  extends StObject
     with BankingProductFeatureV2 {
  
  var isActivated: js.UndefOr[Boolean] = js.undefined
}
object accV3DetailFeatureObj {
  
  inline def apply(
    featureType: ADDITIONAL_CARDS | BALANCE_TRANSFERS | BILL_PAYMENT | BONUS_REWARDS | CARD_ACCESS | CASHBACK_OFFER | COMPLEMENTARY_PRODUCT_DISCOUNTS | DIGITAL_BANKING | DIGITAL_WALLET | DONATE_INTEREST | EXTRA_REPAYMENTS | FRAUD_PROTECTION | FREE_TXNS | FREE_TXNS_ALLOWANCE | GUARANTOR | INSURANCE | INSTALMENT_PLAN | INTEREST_FREE | INTEREST_FREE_TRANSFERS | LOYALTY_PROGRAM | NOTIFICATIONS | NPP_ENABLED | NPP_PAYID | OFFSET | OTHER | OVERDRAFT | REDRAW | RELATIONSHIP_MANAGEMENT | UNLIMITED_TXNS
  ): accV3DetailFeatureObj = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[accV3DetailFeatureObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: accV3DetailFeatureObj] (val x: Self) extends AnyVal {
    
    inline def setIsActivated(value: Boolean): Self = StObject.set(x, "isActivated", value.asInstanceOf[js.Any])
    
    inline def setIsActivatedUndefined: Self = StObject.set(x, "isActivated", js.undefined)
  }
}
