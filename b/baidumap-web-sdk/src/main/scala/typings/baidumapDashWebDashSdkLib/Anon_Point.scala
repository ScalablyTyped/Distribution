package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Point extends js.Object {
  var point: baidumapDashWebDashSdkLib.BMapNs.Point
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Point {
  @scala.inline
  def apply(point: baidumapDashWebDashSdkLib.BMapNs.Point, target: js.Any, `type`: java.lang.String): Anon_Point = {
    val __obj = js.Dynamic.literal(point = point, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Point]
  }
}

