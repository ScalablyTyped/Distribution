package typings
package backboneDashFetchDashCacheLib.backboneDashFetchDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var expires: scala.Double
  var lastSync: scala.Double
  var prefillExpires: scala.Double
  var value: js.Any
}

object Cache {
  @scala.inline
  def apply(expires: scala.Double, lastSync: scala.Double, prefillExpires: scala.Double, value: js.Any): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("lastSync")(lastSync)
    __obj.updateDynamic("prefillExpires")(prefillExpires)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cache]
  }
}

