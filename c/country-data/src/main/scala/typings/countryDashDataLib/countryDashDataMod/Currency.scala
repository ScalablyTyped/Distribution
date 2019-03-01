package typings
package countryDashDataLib.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  val code: java.lang.String
  val decimals: scala.Double
  val name: java.lang.String
  val number: scala.Double
}

object Currency {
  @scala.inline
  def apply(code: java.lang.String, decimals: scala.Double, name: java.lang.String, number: scala.Double): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("decimals")(decimals)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Currency]
  }
}

