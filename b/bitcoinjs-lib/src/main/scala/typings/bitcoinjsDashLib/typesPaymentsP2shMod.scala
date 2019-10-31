package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.typesPaymentsMod.Payment
import typings.bitcoinjsDashLib.typesPaymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/p2sh", JSImport.Namespace)
@js.native
object typesPaymentsP2shMod extends js.Object {
  def p2sh(a: Payment): Payment = js.native
  def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
}

