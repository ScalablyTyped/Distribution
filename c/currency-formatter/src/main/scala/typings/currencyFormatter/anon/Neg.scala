package typings.currencyFormatter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neg extends js.Object {
  var neg: String
  var pos: String
  var zero: String
}

object Neg {
  @scala.inline
  def apply(neg: String, pos: String, zero: String): Neg = {
    val __obj = js.Dynamic.literal(neg = neg.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neg]
  }
}

