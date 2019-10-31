package typings.bitcoinjsDashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesPaymentsMod {
  import typings.node.Buffer

  type PaymentFunction = js.Function0[Payment]
  type Stack = js.Array[StackElement]
  type StackElement = Buffer | Double
  type StackFunction = js.Function0[Stack]
}
