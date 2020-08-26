package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OPENDIRECTORY extends js.Object {
  var OPEN_DIRECTORY: openDirectory = js.native
  var OPEN_FILE: openFile = js.native
  var OPEN_WRITABLE_FILE: openWritableFile = js.native
  var SAVE_FILE: saveFile = js.native
}

object OPENDIRECTORY {
  @scala.inline
  def apply(
    OPEN_DIRECTORY: openDirectory,
    OPEN_FILE: openFile,
    OPEN_WRITABLE_FILE: openWritableFile,
    SAVE_FILE: saveFile
  ): OPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = OPEN_DIRECTORY.asInstanceOf[js.Any], OPEN_FILE = OPEN_FILE.asInstanceOf[js.Any], OPEN_WRITABLE_FILE = OPEN_WRITABLE_FILE.asInstanceOf[js.Any], SAVE_FILE = SAVE_FILE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPENDIRECTORY]
  }
  @scala.inline
  implicit class OPENDIRECTORYOps[Self <: OPENDIRECTORY] (val x: Self) extends AnyVal {
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
    def setOPEN_DIRECTORY(value: openDirectory): Self = this.set("OPEN_DIRECTORY", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_FILE(value: openFile): Self = this.set("OPEN_FILE", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_WRITABLE_FILE(value: openWritableFile): Self = this.set("OPEN_WRITABLE_FILE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSAVE_FILE(value: saveFile): Self = this.set("SAVE_FILE", value.asInstanceOf[js.Any])
  }
  
}

