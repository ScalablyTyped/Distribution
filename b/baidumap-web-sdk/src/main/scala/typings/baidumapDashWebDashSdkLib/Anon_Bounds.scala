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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Bounds]
  }
}

