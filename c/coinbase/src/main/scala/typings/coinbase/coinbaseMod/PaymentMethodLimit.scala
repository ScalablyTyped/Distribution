package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodLimit extends js.Object {
  var period_in_days: Double
  var remaining: MoneyHash
  var total: MoneyHash
}

object PaymentMethodLimit {
  @scala.inline
  def apply(period_in_days: Double, remaining: MoneyHash, total: MoneyHash): PaymentMethodLimit = {
    val __obj = js.Dynamic.literal(period_in_days = period_in_days.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaymentMethodLimit]
  }
}

