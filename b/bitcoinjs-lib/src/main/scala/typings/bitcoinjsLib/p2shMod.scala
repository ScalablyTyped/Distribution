package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bitcoinjs-lib/types/payments/p2sh", JSImport.Namespace)
@js.native
object p2shMod extends js.Object {
  
  def p2sh(a: Payment): Payment = js.native
  def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
}
