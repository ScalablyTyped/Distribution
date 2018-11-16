package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PaymentMethodLimits extends js.Object {
  var buy: js.Array[PaymentMethodLimit]
  var deposit: js.Array[PaymentMethodLimit]
  var instant_buy: js.Array[PaymentMethodLimit]
  var sell: js.Array[PaymentMethodLimit]
}

