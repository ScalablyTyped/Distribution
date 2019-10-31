package typings.bitcoinjsDashLib

import typings.bitcoinjsDashLib.typesPaymentsMod.Payment
import typings.bitcoinjsDashLib.typesPaymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/payments/embed", JSImport.Namespace)
@js.native
object typesPaymentsEmbedMod extends js.Object {
  def p2data(a: Payment): Payment = js.native
  def p2data(a: Payment, opts: PaymentOpts): Payment = js.native
}

