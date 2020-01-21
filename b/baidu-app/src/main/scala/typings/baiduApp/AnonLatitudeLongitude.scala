package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitudeLongitude extends js.Object {
  var latitude: Double
  var longitude: Double
}

object AnonLatitudeLongitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): AnonLatitudeLongitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLatitudeLongitude]
  }
}

