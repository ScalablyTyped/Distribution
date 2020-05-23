package typings.bigInteger.anon

import typings.bigInteger.mod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quotient extends js.Object {
  var quotient: BigInteger
  var remainder: BigInteger
}

object Quotient {
  @scala.inline
  def apply(quotient: BigInteger, remainder: BigInteger): Quotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quotient]
  }
}

