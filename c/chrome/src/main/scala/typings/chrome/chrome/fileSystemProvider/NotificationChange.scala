package typings.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationChange extends js.Object {
  /** The type of the change which happened to the entry. */
  var changeType: String = js.native
  /** The path of the changed entry. */
  var entryPath: String = js.native
}

object NotificationChange {
  @scala.inline
  def apply(changeType: String, entryPath: String): NotificationChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], entryPath = entryPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationChange]
  }
  @scala.inline
  implicit class NotificationChangeOps[Self <: NotificationChange] (val x: Self) extends AnyVal {
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
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPath(value: String): Self = this.set("entryPath", value.asInstanceOf[js.Any])
  }
  
}

