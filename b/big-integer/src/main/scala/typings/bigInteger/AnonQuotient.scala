package typings.bigInteger

import typings.bigInteger.mod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuotient extends js.Object {
  var quotient: BigInteger
  var remainder: BigInteger
}

object AnonQuotient {
  @scala.inline
  def apply(quotient: BigInteger, remainder: BigInteger): AnonQuotient = {
    val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuotient]
  }
}

