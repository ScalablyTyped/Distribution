package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Marker extends js.Object {
  var marker: Marker
  var target: js.Any
  var `type`: String
}

object Anon_Marker {
  @scala.inline
  def apply(marker: Marker, target: js.Any, `type`: String): Anon_Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Marker]
  }
}

