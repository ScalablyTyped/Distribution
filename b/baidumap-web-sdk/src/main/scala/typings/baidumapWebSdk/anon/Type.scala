package typings.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var point: typings.baidumapWebSdk.BMap.Point
  var target: js.Any
  var `type`: String
}

object Type {
  @scala.inline
  def apply(point: typings.baidumapWebSdk.BMap.Point, target: js.Any, `type`: String): Type = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

