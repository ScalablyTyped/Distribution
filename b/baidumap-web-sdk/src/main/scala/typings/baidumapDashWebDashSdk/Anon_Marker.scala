package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMapNs.Marker
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
    val __obj = js.Dynamic.literal(marker = marker, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Marker]
  }
}

