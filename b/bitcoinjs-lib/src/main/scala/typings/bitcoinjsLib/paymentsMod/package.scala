package typings.bitcoinjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object paymentsMod {
  
  type PaymentCreator = js.Function2[
    /* a */ typings.bitcoinjsLib.paymentsMod.Payment, 
    /* opts */ js.UndefOr[typings.bitcoinjsLib.paymentsMod.PaymentOpts], 
    typings.bitcoinjsLib.paymentsMod.Payment
  ]
  
  type PaymentFunction = js.Function0[typings.bitcoinjsLib.paymentsMod.Payment]
  
  type Stack = js.Array[typings.bitcoinjsLib.paymentsMod.StackElement]
  
  type StackElement = typings.node.Buffer | scala.Double
  
  type StackFunction = js.Function0[typings.bitcoinjsLib.paymentsMod.Stack]
}
