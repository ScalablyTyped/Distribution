package typings.bitcoinjsLib

import typings.bitcoinjsLib.paymentsMod.Payment
import typings.bitcoinjsLib.paymentsMod.PaymentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object p2wpkhMod {
  
  @JSImport("bitcoinjs-lib/types/payments/p2wpkh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def p2wpkh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2wpkh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
}
