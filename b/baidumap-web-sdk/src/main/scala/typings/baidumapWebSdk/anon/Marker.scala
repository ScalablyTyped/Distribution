package typings.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  var marker: typings.baidumapWebSdk.BMap.Marker
  var target: js.Any
  var `type`: String
}

object Marker {
  @scala.inline
  def apply(marker: typings.baidumapWebSdk.BMap.Marker, target: js.Any, `type`: String): Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
}

