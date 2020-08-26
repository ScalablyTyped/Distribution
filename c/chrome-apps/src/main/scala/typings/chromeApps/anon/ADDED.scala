package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.added_
import typings.chromeApps.chromeAppsStrings.deleted_
import typings.chromeApps.chromeAppsStrings.updated_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ADDED extends js.Object {
  var ADDED: added_ = js.native
  var DELETED: deleted_ = js.native
  var UPDATED: updated_ = js.native
}

object ADDED {
  @scala.inline
  def apply(ADDED: added_, DELETED: deleted_, UPDATED: updated_): ADDED = {
    val __obj = js.Dynamic.literal(ADDED = ADDED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any], UPDATED = UPDATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADDED]
  }
  @scala.inline
  implicit class ADDEDOps[Self <: ADDED] (val x: Self) extends AnyVal {
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
    def setADDED(value: added_): Self = this.set("ADDED", value.asInstanceOf[js.Any])
    @scala.inline
    def setDELETED(value: deleted_): Self = this.set("DELETED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPDATED(value: updated_): Self = this.set("UPDATED", value.asInstanceOf[js.Any])
  }
  
}

