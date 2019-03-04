package typings
package countriesDashAndDashTimezonesLib.countriesDashAndDashTimezonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var countries: js.Array[java.lang.String]
  var name: java.lang.String
  var offsetStr: java.lang.String
  var utcOffset: scala.Double
}

object Timezone {
  @scala.inline
  def apply(
    countries: js.Array[java.lang.String],
    name: java.lang.String,
    offsetStr: java.lang.String,
    utcOffset: scala.Double
  ): Timezone = {
    val __obj = js.Dynamic.literal(countries = countries, name = name, offsetStr = offsetStr, utcOffset = utcOffset)
  
    __obj.asInstanceOf[Timezone]
  }
}

