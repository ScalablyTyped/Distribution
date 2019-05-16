package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amount extends js.Object {
  var amount: java.lang.String
  var createdAt: stdLib.Date
  var id: java.lang.String
  var orderId: java.lang.String
  var paymentInstrumentSubtype: java.lang.String
  var purchaseOrderNumber: java.lang.String
}

object Anon_Amount {
  @scala.inline
  def apply(
    amount: java.lang.String,
    createdAt: stdLib.Date,
    id: java.lang.String,
    orderId: java.lang.String,
    paymentInstrumentSubtype: java.lang.String,
    purchaseOrderNumber: java.lang.String
  ): Anon_Amount = {
    val __obj = js.Dynamic.literal(amount = amount, createdAt = createdAt, id = id, orderId = orderId, paymentInstrumentSubtype = paymentInstrumentSubtype, purchaseOrderNumber = purchaseOrderNumber)
  
    __obj.asInstanceOf[Anon_Amount]
  }
}

