package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/p2wsh", JSImport.Namespace)
@js.native
object p2wshMod extends js.Object {
  def p2wsh(a: Payment): Payment = js.native
  def p2wsh(a: Payment, opts: PaymentOpts): Payment = js.native
}

