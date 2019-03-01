package typings
package currencyDashFormatterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Neg extends js.Object {
  var neg: java.lang.String
  var pos: java.lang.String
  var zero: java.lang.String
}

object Anon_Neg {
  @scala.inline
  def apply(neg: java.lang.String, pos: java.lang.String, zero: java.lang.String): Anon_Neg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("neg")(neg)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Anon_Neg]
  }
}

