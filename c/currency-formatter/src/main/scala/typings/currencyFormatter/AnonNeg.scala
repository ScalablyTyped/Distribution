package typings.currencyFormatter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNeg extends js.Object {
  var neg: String
  var pos: String
  var zero: String
}

object AnonNeg {
  @scala.inline
  def apply(neg: String, pos: String, zero: String): AnonNeg = {
    val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNeg]
  }
}

