package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.permissions_increase_
import typings.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PERMISSIONSINCREASE extends js.Object {
  var PERMISSIONS_INCREASE: permissions_increase_ = js.native
  var UNKNOWN: unknown__ = js.native
}

object PERMISSIONSINCREASE {
  @scala.inline
  def apply(PERMISSIONS_INCREASE: permissions_increase_, UNKNOWN: unknown__): PERMISSIONSINCREASE = {
    val __obj = js.Dynamic.literal(PERMISSIONS_INCREASE = PERMISSIONS_INCREASE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PERMISSIONSINCREASE]
  }
  @scala.inline
  implicit class PERMISSIONSINCREASEOps[Self <: PERMISSIONSINCREASE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPERMISSIONS_INCREASE(value: permissions_increase_): Self = this.set("PERMISSIONS_INCREASE", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
  
}

