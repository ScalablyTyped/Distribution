package typings.coinbaseCommerceNode

import typings.coinbaseCommerceNode.mod.CryptoCurrency
import typings.coinbaseCommerceNode.mod.CryptoName
import typings.coinbaseCommerceNode.mod.PaymentStatus
import typings.coinbaseCommerceNode.mod.PricingType
import typings.coinbaseCommerceNode.mod._FiatCurrency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinbaseCommerceNodeStrings {
  
  @js.native
  sealed trait BCH
    extends StObject
       with CryptoCurrency
  @scala.inline
  def BCH: BCH = "BCH".asInstanceOf[BCH]
  
  @js.native
  sealed trait BTC
    extends StObject
       with CryptoCurrency
  @scala.inline
  def BTC: BTC = "BTC".asInstanceOf[BTC]
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with PaymentStatus
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with PaymentStatus
  @scala.inline
  def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait DELAYED extends StObject
  @scala.inline
  def DELAYED: DELAYED = "DELAYED".asInstanceOf[DELAYED]
  
  @js.native
  sealed trait DELETE extends StObject
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait ETH
    extends StObject
       with CryptoCurrency
  @scala.inline
  def ETH: ETH = "ETH".asInstanceOf[ETH]
  
  @js.native
  sealed trait EUR
    extends StObject
       with _FiatCurrency
  @scala.inline
  def EUR: EUR = "EUR".asInstanceOf[EUR]
  
  @js.native
  sealed trait EXPIRED
    extends StObject
       with PaymentStatus
  @scala.inline
  def EXPIRED: EXPIRED = "EXPIRED".asInstanceOf[EXPIRED]
  
  @js.native
  sealed trait GBP
    extends StObject
       with _FiatCurrency
  @scala.inline
  def GBP: GBP = "GBP".asInstanceOf[GBP]
  
  @js.native
  sealed trait GET extends StObject
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait LTC
    extends StObject
       with CryptoCurrency
  @scala.inline
  def LTC: LTC = "LTC".asInstanceOf[LTC]
  
  @js.native
  sealed trait MANUAL extends StObject
  @scala.inline
  def MANUAL: MANUAL = "MANUAL".asInstanceOf[MANUAL]
  
  @js.native
  sealed trait MULTIPLE extends StObject
  @scala.inline
  def MULTIPLE: MULTIPLE = "MULTIPLE".asInstanceOf[MULTIPLE]
  
  @js.native
  sealed trait NEW
    extends StObject
       with PaymentStatus
  @scala.inline
  def NEW: NEW = "NEW".asInstanceOf[NEW]
  
  @js.native
  sealed trait OTHER extends StObject
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OVERPAID extends StObject
  @scala.inline
  def OVERPAID: OVERPAID = "OVERPAID".asInstanceOf[OVERPAID]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with PaymentStatus
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait POST extends StObject
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait RESOLVED
    extends StObject
       with PaymentStatus
  @scala.inline
  def RESOLVED: RESOLVED = "RESOLVED".asInstanceOf[RESOLVED]
  
  @js.native
  sealed trait UNDERPAID extends StObject
  @scala.inline
  def UNDERPAID: UNDERPAID = "UNDERPAID".asInstanceOf[UNDERPAID]
  
  @js.native
  sealed trait UNRESOLVED
    extends StObject
       with PaymentStatus
  @scala.inline
  def UNRESOLVED: UNRESOLVED = "UNRESOLVED".asInstanceOf[UNRESOLVED]
  
  @js.native
  sealed trait USD
    extends StObject
       with _FiatCurrency
  @scala.inline
  def USD: USD = "USD".asInstanceOf[USD]
  
  @js.native
  sealed trait USDC
    extends StObject
       with CryptoCurrency
  @scala.inline
  def USDC: USDC = "USDC".asInstanceOf[USDC]
  
  @js.native
  sealed trait applicationSlashjson extends StObject
  @scala.inline
  def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
  
  @js.native
  sealed trait asc extends StObject
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait bitcoin
    extends StObject
       with CryptoName
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @js.native
  sealed trait bitcoincash
    extends StObject
       with CryptoName
  @scala.inline
  def bitcoincash: bitcoincash = "bitcoincash".asInstanceOf[bitcoincash]
  
  @js.native
  sealed trait charge extends StObject
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  
  @js.native
  sealed trait chargeColonconfirmed extends StObject
  @scala.inline
  def chargeColonconfirmed: chargeColonconfirmed = "charge:confirmed".asInstanceOf[chargeColonconfirmed]
  
  @js.native
  sealed trait chargeColoncreated extends StObject
  @scala.inline
  def chargeColoncreated: chargeColoncreated = "charge:created".asInstanceOf[chargeColoncreated]
  
  @js.native
  sealed trait chargeColondelayed extends StObject
  @scala.inline
  def chargeColondelayed: chargeColondelayed = "charge:delayed".asInstanceOf[chargeColondelayed]
  
  @js.native
  sealed trait chargeColonfailed extends StObject
  @scala.inline
  def chargeColonfailed: chargeColonfailed = "charge:failed".asInstanceOf[chargeColonfailed]
  
  @js.native
  sealed trait chargeColonpending extends StObject
  @scala.inline
  def chargeColonpending: chargeColonpending = "charge:pending".asInstanceOf[chargeColonpending]
  
  @js.native
  sealed trait chargeColonresolved extends StObject
  @scala.inline
  def chargeColonresolved: chargeColonresolved = "charge:resolved".asInstanceOf[chargeColonresolved]
  
  @js.native
  sealed trait checkout extends StObject
  @scala.inline
  def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @js.native
  sealed trait desc extends StObject
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait email extends StObject
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait ethereum
    extends StObject
       with CryptoName
  @scala.inline
  def ethereum: ethereum = "ethereum".asInstanceOf[ethereum]
  
  @js.native
  sealed trait event extends StObject
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait fixed_price
    extends StObject
       with PricingType
  @scala.inline
  def fixed_price: fixed_price = "fixed_price".asInstanceOf[fixed_price]
  
  @js.native
  sealed trait litecoin
    extends StObject
       with CryptoName
  @scala.inline
  def litecoin: litecoin = "litecoin".asInstanceOf[litecoin]
  
  @js.native
  sealed trait name extends StObject
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait no_price
    extends StObject
       with PricingType
  @scala.inline
  def no_price: no_price = "no_price".asInstanceOf[no_price]
  
  @js.native
  sealed trait pricing_type extends StObject
  @scala.inline
  def pricing_type: pricing_type = "pricing_type".asInstanceOf[pricing_type]
  
  @js.native
  sealed trait usdc_
    extends StObject
       with CryptoName
  @scala.inline
  def usdc_ : usdc_ = "usdc".asInstanceOf[usdc_]
}
