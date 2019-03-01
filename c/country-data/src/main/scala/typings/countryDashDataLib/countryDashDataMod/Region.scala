package typings
package countryDashDataLib.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  val countries: js.Array[java.lang.String]
  val name: java.lang.String
}

object Region {
  @scala.inline
  def apply(countries: js.Array[java.lang.String], name: java.lang.String): Region = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("countries")(countries)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Region]
  }
}

