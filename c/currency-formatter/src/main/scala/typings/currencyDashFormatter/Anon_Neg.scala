package typings.currencyDashFormatter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Neg extends js.Object {
  var neg: String
  var pos: String
  var zero: String
}

object Anon_Neg {
  @scala.inline
  def apply(neg: String, pos: String, zero: String): Anon_Neg = {
    val __obj = js.Dynamic.literal(neg = neg, pos = pos, zero = zero)
  
    __obj.asInstanceOf[Anon_Neg]
  }
}

