package typings.countryDashData.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continent extends js.Object {
  val countries: js.Array[Country]
  val name: String
  val regions: js.Array[String]
}

object Continent {
  @scala.inline
  def apply(countries: js.Array[Country], name: String, regions: js.Array[String]): Continent = {
    val __obj = js.Dynamic.literal(countries = countries, name = name, regions = regions)
  
    __obj.asInstanceOf[Continent]
  }
}

