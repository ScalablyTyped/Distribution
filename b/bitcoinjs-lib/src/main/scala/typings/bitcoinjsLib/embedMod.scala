package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/embed", JSImport.Namespace)
@js.native
object embedMod extends js.Object {
  def p2data(a: Payment): Payment = js.native
  def p2data(a: Payment, opts: PaymentOpts): Payment = js.native
}

