package typings.bigDashInteger

import typings.bigDashInteger.bigDashIntegerMod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quotient extends js.Object {
  var quotient: BigInteger
  var remainder: BigInteger
}

object Anon_Quotient {
  @scala.inline
  def apply(quotient: BigInteger, remainder: BigInteger): Anon_Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient, remainder = remainder)
  
    __obj.asInstanceOf[Anon_Quotient]
  }
}

