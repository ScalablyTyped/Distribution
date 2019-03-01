package typings
package countryDashDataLib.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continent extends js.Object {
  val countries: js.Array[Country]
  val name: java.lang.String
  val regions: js.Array[java.lang.String]
}

object Continent {
  @scala.inline
  def apply(countries: js.Array[Country], name: java.lang.String, regions: js.Array[java.lang.String]): Continent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("countries")(countries)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Continent]
  }
}

