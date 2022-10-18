package typings.bitcoinjsLib

import typings.bitcoinjsLib.srcPaymentsMod.Payment
import typings.bitcoinjsLib.srcPaymentsMod.PaymentOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPaymentsP2msMod {
  
  @JSImport("bitcoinjs-lib/src/payments/p2ms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def p2ms(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2ms(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
}
