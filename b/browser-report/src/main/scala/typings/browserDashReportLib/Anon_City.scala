package typings
package browserDashReportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: java.lang.String
  var code: java.lang.String
  var latitude: java.lang.String
  var longitude: java.lang.String
  var name: java.lang.String
  var timezone: java.lang.String
}

object Anon_City {
  @scala.inline
  def apply(
    city: java.lang.String,
    code: java.lang.String,
    latitude: java.lang.String,
    longitude: java.lang.String,
    name: java.lang.String,
    timezone: java.lang.String
  ): Anon_City = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Anon_City]
  }
}

