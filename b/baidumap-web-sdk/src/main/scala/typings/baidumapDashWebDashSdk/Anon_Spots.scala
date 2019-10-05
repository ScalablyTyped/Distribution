package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.HotspotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spots extends js.Object {
  var spots: HotspotOptions
  var target: js.Any
  var `type`: String
}

object Anon_Spots {
  @scala.inline
  def apply(spots: HotspotOptions, target: js.Any, `type`: String): Anon_Spots = {
    val __obj = js.Dynamic.literal(spots = spots, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Spots]
  }
}

