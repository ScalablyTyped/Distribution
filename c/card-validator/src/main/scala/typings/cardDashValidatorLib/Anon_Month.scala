package typings
package cardDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Month extends js.Object {
  var month: java.lang.String
  var year: java.lang.String
}

object Anon_Month {
  @scala.inline
  def apply(month: java.lang.String, year: java.lang.String): Anon_Month = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Anon_Month]
  }
}

