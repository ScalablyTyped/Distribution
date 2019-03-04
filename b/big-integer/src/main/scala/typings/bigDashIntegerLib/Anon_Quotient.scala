package typings
package bigDashIntegerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quotient extends js.Object {
  var quotient: bigDashIntegerLib.bigDashIntegerMod.bigIntNs.BigInteger
  var remainder: bigDashIntegerLib.bigDashIntegerMod.bigIntNs.BigInteger
}

object Anon_Quotient {
  @scala.inline
  def apply(
    quotient: bigDashIntegerLib.bigDashIntegerMod.bigIntNs.BigInteger,
    remainder: bigDashIntegerLib.bigDashIntegerMod.bigIntNs.BigInteger
  ): Anon_Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient, remainder = remainder)
  
    __obj.asInstanceOf[Anon_Quotient]
  }
}

