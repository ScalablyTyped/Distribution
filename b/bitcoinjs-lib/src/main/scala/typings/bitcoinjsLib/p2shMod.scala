package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object p2shMod {
  
  @JSImport("bitcoinjs-lib/types/payments/p2sh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def p2sh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  @scala.inline
  def p2sh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
}
