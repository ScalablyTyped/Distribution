package typings.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNortheast extends js.Object {
  var northeast: AnonLongitude
  var southwest: AnonLongitude
}

object AnonNortheast {
  @scala.inline
  def apply(northeast: AnonLongitude, southwest: AnonLongitude): AnonNortheast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNortheast]
  }
}

