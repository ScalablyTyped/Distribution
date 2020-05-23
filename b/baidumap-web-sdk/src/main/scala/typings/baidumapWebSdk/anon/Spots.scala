package typings.baidumapWebSdk.anon

import typings.baidumapWebSdk.BMap.HotspotOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spots extends js.Object {
  var spots: HotspotOptions
  var target: js.Any
  var `type`: String
}

object Spots {
  @scala.inline
  def apply(spots: HotspotOptions, target: js.Any, `type`: String): Spots = {
    val __obj = js.Dynamic.literal(spots = spots.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spots]
  }
}

