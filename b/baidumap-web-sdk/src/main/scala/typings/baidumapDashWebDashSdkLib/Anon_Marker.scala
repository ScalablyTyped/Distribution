package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Marker extends js.Object {
  var marker: baidumapDashWebDashSdkLib.BMapNs.Marker
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Marker {
  @scala.inline
  def apply(marker: baidumapDashWebDashSdkLib.BMapNs.Marker, target: js.Any, `type`: java.lang.String): Anon_Marker = {
    val __obj = js.Dynamic.literal(marker = marker, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Marker]
  }
}

