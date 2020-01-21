package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBounds extends js.Object {
  var bounds: js.Array[Bounds]
  var target: js.Any
  var `type`: String
}

object AnonBounds {
  @scala.inline
  def apply(bounds: js.Array[Bounds], target: js.Any, `type`: String): AnonBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBounds]
  }
}

