package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.conflicting_
import typings.chromeApps.chromeAppsStrings.pending_
import typings.chromeApps.chromeAppsStrings.synced_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONFLICTING extends js.Object {
  var CONFLICTING: conflicting_ = js.native
  var PENDING: pending_ = js.native
  var SYNCED: synced_ = js.native
}

object CONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting_, PENDING: pending_, SYNCED: synced_): CONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONFLICTING]
  }
  @scala.inline
  implicit class CONFLICTINGOps[Self <: CONFLICTING] (val x: Self) extends AnyVal {
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
    def setCONFLICTING(value: conflicting_): Self = this.set("CONFLICTING", value.asInstanceOf[js.Any])
    @scala.inline
    def setPENDING(value: pending_): Self = this.set("PENDING", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYNCED(value: synced_): Self = this.set("SYNCED", value.asInstanceOf[js.Any])
  }
  
}

