package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Point extends js.Object {
  var point: Point
  var target: js.Any
  var `type`: String
}

object Anon_Point {
  @scala.inline
  def apply(point: Point, target: js.Any, `type`: String): Anon_Point = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Point]
  }
}

