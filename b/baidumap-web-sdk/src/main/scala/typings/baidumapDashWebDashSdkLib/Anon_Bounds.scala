package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounds extends js.Object {
  var bounds: js.Array[baidumapDashWebDashSdkLib.BMapNs.Bounds]
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Bounds {
  @scala.inline
  def apply(
    bounds: js.Array[baidumapDashWebDashSdkLib.BMapNs.Bounds],
    target: js.Any,
    `type`: java.lang.String
  ): Anon_Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Bounds]
  }
}

