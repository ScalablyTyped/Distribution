package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Spots extends js.Object {
  var spots: baidumapDashWebDashSdkLib.BMapNs.HotspotOptions
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Spots {
  @scala.inline
  def apply(spots: baidumapDashWebDashSdkLib.BMapNs.HotspotOptions, target: js.Any, `type`: java.lang.String): Anon_Spots = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("spots")(spots)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Spots]
  }
}

