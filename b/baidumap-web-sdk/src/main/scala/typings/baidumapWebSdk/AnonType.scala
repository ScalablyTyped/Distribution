package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var point: Point
  var target: js.Any
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(point: Point, target: js.Any, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

