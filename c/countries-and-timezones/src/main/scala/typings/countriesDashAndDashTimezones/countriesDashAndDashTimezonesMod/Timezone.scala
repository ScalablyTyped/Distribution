package typings.countriesDashAndDashTimezones.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var countries: js.Array[String]
  var name: String
  var offsetStr: String
  var utcOffset: Double
}

object Timezone {
  @scala.inline
  def apply(countries: js.Array[String], name: String, offsetStr: String, utcOffset: Double): Timezone = {
    val __obj = js.Dynamic.literal(countries = countries, name = name, offsetStr = offsetStr, utcOffset = utcOffset)
  
    __obj.asInstanceOf[Timezone]
  }
}

