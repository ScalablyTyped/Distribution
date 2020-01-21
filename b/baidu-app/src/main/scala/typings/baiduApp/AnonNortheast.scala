package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNortheast extends js.Object {
  var northeast: AnonLatitudeLongitude
  var southwest: AnonLatitudeLongitude
}

object AnonNortheast {
  @scala.inline
  def apply(northeast: AnonLatitudeLongitude, southwest: AnonLatitudeLongitude): AnonNortheast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNortheast]
  }
}

