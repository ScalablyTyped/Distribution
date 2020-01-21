package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMarker extends js.Object {
  var marker: Marker
  var target: js.Any
  var `type`: String
}

object AnonMarker {
  @scala.inline
  def apply(marker: Marker, target: js.Any, `type`: String): AnonMarker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMarker]
  }
}

