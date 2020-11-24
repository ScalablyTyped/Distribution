package typings.coinbaseCommerceNode

import typings.coinbaseCommerceNode.mod.CryptoCurrency
import typings.coinbaseCommerceNode.mod.CryptoName
import typings.coinbaseCommerceNode.mod.PaymentStatus
import typings.coinbaseCommerceNode.mod.PricingType
import typings.coinbaseCommerceNode.mod._FiatCurrency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinbaseCommerceNodeStrings {
  
  @scala.inline
  def BCH: BCH = "BCH".asInstanceOf[BCH]
  
  @scala.inline
  def BTC: BTC = "BTC".asInstanceOf[BTC]
  
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @scala.inline
  def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @scala.inline
  def DELAYED: DELAYED = "DELAYED".asInstanceOf[DELAYED]
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @scala.inline
  def ETH: ETH = "ETH".asInstanceOf[ETH]
  
  @scala.inline
  def EUR: EUR = "EUR".asInstanceOf[EUR]
  
  @scala.inline
  def EXPIRED: EXPIRED = "EXPIRED".asInstanceOf[EXPIRED]
  
  @scala.inline
  def GBP: GBP = "GBP".asInstanceOf[GBP]
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def LTC: LTC = "LTC".asInstanceOf[LTC]
  
  @scala.inline
  def MANUAL: MANUAL = "MANUAL".asInstanceOf[MANUAL]
  
  @scala.inline
  def MULTIPLE: MULTIPLE = "MULTIPLE".asInstanceOf[MULTIPLE]
  
  @scala.inline
  def NEW: NEW = "NEW".asInstanceOf[NEW]
  
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @scala.inline
  def OVERPAID: OVERPAID = "OVERPAID".asInstanceOf[OVERPAID]
  
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def RESOLVED: RESOLVED = "RESOLVED".asInstanceOf[RESOLVED]
  
  @scala.inline
  def UNDERPAID: UNDERPAID = "UNDERPAID".asInstanceOf[UNDERPAID]
  
  @scala.inline
  def UNRESOLVED: UNRESOLVED = "UNRESOLVED".asInstanceOf[UNRESOLVED]
  
  @scala.inline
  def USD: USD = "USD".asInstanceOf[USD]
  
  @scala.inline
  def USDC: USDC = "USDC".asInstanceOf[USDC]
  
  @scala.inline
  def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  
  @scala.inline
  def bitcoincash: bitcoincash = "bitcoincash".asInstanceOf[bitcoincash]
  
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  
  @scala.inline
  def chargeColonconfirmed: chargeColonconfirmed = "charge:confirmed".asInstanceOf[chargeColonconfirmed]
  
  @scala.inline
  def chargeColoncreated: chargeColoncreated = "charge:created".asInstanceOf[chargeColoncreated]
  
  @scala.inline
  def chargeColondelayed: chargeColondelayed = "charge:delayed".asInstanceOf[chargeColondelayed]
  
  @scala.inline
  def chargeColonfailed: chargeColonfailed = "charge:failed".asInstanceOf[chargeColonfailed]
  
  @scala.inline
  def chargeColonpending: chargeColonpending = "charge:pending".asInstanceOf[chargeColonpending]
  
  @scala.inline
  def chargeColonresolved: chargeColonresolved = "charge:resolved".asInstanceOf[chargeColonresolved]
  
  @scala.inline
  def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def ethereum: ethereum = "ethereum".asInstanceOf[ethereum]
  
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @scala.inline
  def fixed_price: fixed_price = "fixed_price".asInstanceOf[fixed_price]
  
  @scala.inline
  def litecoin: litecoin = "litecoin".asInstanceOf[litecoin]
  
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @scala.inline
  def no_price: no_price = "no_price".asInstanceOf[no_price]
  
  @scala.inline
  def pricing_type: pricing_type = "pricing_type".asInstanceOf[pricing_type]
  
  @scala.inline
  def usdc_ : usdc_ = "usdc".asInstanceOf[usdc_]
  
  @js.native
  sealed trait BCH extends CryptoCurrency
  
  @js.native
  sealed trait BTC extends CryptoCurrency
  
  @js.native
  sealed trait CANCELED extends PaymentStatus
  
  @js.native
  sealed trait COMPLETED extends PaymentStatus
  
  @js.native
  sealed trait DELAYED extends js.Object
  
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait ETH extends CryptoCurrency
  
  @js.native
  sealed trait EUR extends _FiatCurrency
  
  @js.native
  sealed trait EXPIRED extends PaymentStatus
  
  @js.native
  sealed trait GBP extends _FiatCurrency
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait LTC extends CryptoCurrency
  
  @js.native
  sealed trait MANUAL extends js.Object
  
  @js.native
  sealed trait MULTIPLE extends js.Object
  
  @js.native
  sealed trait NEW extends PaymentStatus
  
  @js.native
  sealed trait OTHER extends js.Object
  
  @js.native
  sealed trait OVERPAID extends js.Object
  
  @js.native
  sealed trait PENDING extends PaymentStatus
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait PUT extends js.Object
  
  @js.native
  sealed trait RESOLVED extends PaymentStatus
  
  @js.native
  sealed trait UNDERPAID extends js.Object
  
  @js.native
  sealed trait UNRESOLVED extends PaymentStatus
  
  @js.native
  sealed trait USD extends _FiatCurrency
  
  @js.native
  sealed trait USDC extends CryptoCurrency
  
  @js.native
  sealed trait applicationSlashjson extends js.Object
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait bitcoin extends CryptoName
  
  @js.native
  sealed trait bitcoincash extends CryptoName
  
  @js.native
  sealed trait charge extends js.Object
  
  @js.native
  sealed trait chargeColonconfirmed extends js.Object
  
  @js.native
  sealed trait chargeColoncreated extends js.Object
  
  @js.native
  sealed trait chargeColondelayed extends js.Object
  
  @js.native
  sealed trait chargeColonfailed extends js.Object
  
  @js.native
  sealed trait chargeColonpending extends js.Object
  
  @js.native
  sealed trait chargeColonresolved extends js.Object
  
  @js.native
  sealed trait checkout extends js.Object
  
  @js.native
  sealed trait desc extends js.Object
  
  @js.native
  sealed trait email extends js.Object
  
  @js.native
  sealed trait ethereum extends CryptoName
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait fixed_price extends PricingType
  
  @js.native
  sealed trait litecoin extends CryptoName
  
  @js.native
  sealed trait name extends js.Object
  
  @js.native
  sealed trait no_price extends PricingType
  
  @js.native
  sealed trait pricing_type extends js.Object
  
  @js.native
  sealed trait usdc_ extends CryptoName
}
