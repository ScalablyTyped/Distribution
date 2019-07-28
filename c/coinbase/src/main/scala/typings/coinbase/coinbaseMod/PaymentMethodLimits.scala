package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodLimits extends js.Object {
  var buy: js.Array[PaymentMethodLimit]
  var deposit: js.Array[PaymentMethodLimit]
  var instant_buy: js.Array[PaymentMethodLimit]
  var sell: js.Array[PaymentMethodLimit]
}

object PaymentMethodLimits {
  @scala.inline
  def apply(
    buy: js.Array[PaymentMethodLimit],
    deposit: js.Array[PaymentMethodLimit],
    instant_buy: js.Array[PaymentMethodLimit],
    sell: js.Array[PaymentMethodLimit]
  ): PaymentMethodLimits = {
    val __obj = js.Dynamic.literal(buy = buy, deposit = deposit, instant_buy = instant_buy, sell = sell)
  
    __obj.asInstanceOf[PaymentMethodLimits]
  }
}

