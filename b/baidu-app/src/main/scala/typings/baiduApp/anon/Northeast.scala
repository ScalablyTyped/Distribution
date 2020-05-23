package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Northeast extends js.Object {
  var northeast: Longitude
  var southwest: Longitude
}

object Northeast {
  @scala.inline
  def apply(northeast: Longitude, southwest: Longitude): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
}

