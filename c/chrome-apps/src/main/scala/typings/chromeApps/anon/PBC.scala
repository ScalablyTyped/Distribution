package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PBC extends js.Object {
  var PBC: typings.chromeApps.chromeAppsStrings.PBC = js.native
  var PIN: typings.chromeApps.chromeAppsStrings.PIN = js.native
}

object PBC {
  @scala.inline
  def apply(PBC: typings.chromeApps.chromeAppsStrings.PBC, PIN: typings.chromeApps.chromeAppsStrings.PIN): PBC = {
    val __obj = js.Dynamic.literal(PBC = PBC.asInstanceOf[js.Any], PIN = PIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBC]
  }
  @scala.inline
  implicit class PBCOps[Self <: PBC] (val x: Self) extends AnyVal {
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
    def setPBC(value: typings.chromeApps.chromeAppsStrings.PBC): Self = this.set("PBC", value.asInstanceOf[js.Any])
    @scala.inline
    def setPIN(value: typings.chromeApps.chromeAppsStrings.PIN): Self = this.set("PIN", value.asInstanceOf[js.Any])
  }
  
}

