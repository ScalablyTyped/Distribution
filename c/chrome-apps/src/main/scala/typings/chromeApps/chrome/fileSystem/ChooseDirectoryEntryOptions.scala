package typings.chromeApps.chrome.fileSystem

import typings.chromeApps.chromeAppsStrings.openDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ @js.native
trait ChooseDirectoryEntryOptions extends ChooseEntryOptionsBase {
  var `type`: openDirectory = js.native
}

object ChooseDirectoryEntryOptions {
  @scala.inline
  def apply(`type`: openDirectory): ChooseDirectoryEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseDirectoryEntryOptions]
  }
  @scala.inline
  implicit class ChooseDirectoryEntryOptionsOps[Self <: ChooseDirectoryEntryOptions] (val x: Self) extends AnyVal {
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
    def setType(value: openDirectory): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

