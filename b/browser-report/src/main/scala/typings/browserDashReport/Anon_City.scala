package typings.browserDashReport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_City extends js.Object {
  var city: String
  var code: String
  var latitude: String
  var longitude: String
  var name: String
  var timezone: String
}

object Anon_City {
  @scala.inline
  def apply(city: String, code: String, latitude: String, longitude: String, name: String, timezone: String): Anon_City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_City]
  }
}

