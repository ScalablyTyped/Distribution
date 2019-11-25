package typings.countryDashData.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  val countries: js.Array[String]
  val name: String
}

object Region {
  @scala.inline
  def apply(countries: js.Array[String], name: String): Region = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Region]
  }
}

