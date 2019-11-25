package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: js.Array[Bounds]
  var target: js.Any
  var `type`: String
}

object Anon_Bounds {
  @scala.inline
  def apply(bounds: js.Array[Bounds], target: js.Any, `type`: String): Anon_Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bounds]
  }
}

