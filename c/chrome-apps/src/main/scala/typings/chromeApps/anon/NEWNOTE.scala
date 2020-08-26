package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.new_note_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NEWNOTE extends js.Object {
  var NEW_NOTE: new_note_ = js.native
}

object NEWNOTE {
  @scala.inline
  def apply(NEW_NOTE: new_note_): NEWNOTE = {
    val __obj = js.Dynamic.literal(NEW_NOTE = NEW_NOTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEWNOTE]
  }
  @scala.inline
  implicit class NEWNOTEOps[Self <: NEWNOTE] (val x: Self) extends AnyVal {
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
    def setNEW_NOTE(value: new_note_): Self = this.set("NEW_NOTE", value.asInstanceOf[js.Any])
  }
  
}

