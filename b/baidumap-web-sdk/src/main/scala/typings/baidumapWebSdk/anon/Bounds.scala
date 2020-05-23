package typings.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounds extends js.Object {
  var bounds: js.Array[typings.baidumapWebSdk.BMap.Bounds]
  var target: js.Any
  var `type`: String
}

object Bounds {
  @scala.inline
  def apply(bounds: js.Array[typings.baidumapWebSdk.BMap.Bounds], target: js.Any, `type`: String): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
}

