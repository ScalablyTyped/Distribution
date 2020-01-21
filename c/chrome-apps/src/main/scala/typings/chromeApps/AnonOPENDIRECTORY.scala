package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOPENDIRECTORY extends js.Object {
  var OPEN_DIRECTORY: openDirectory
  var OPEN_FILE: openFile
  var OPEN_WRITABLE_FILE: openWritableFile
  var SAVE_FILE: saveFile
}

object AnonOPENDIRECTORY {
  @scala.inline
  def apply(
    OPEN_DIRECTORY: openDirectory,
    OPEN_FILE: openFile,
    OPEN_WRITABLE_FILE: openWritableFile,
    SAVE_FILE: saveFile
  ): AnonOPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = OPEN_DIRECTORY.asInstanceOf[js.Any], OPEN_FILE = OPEN_FILE.asInstanceOf[js.Any], OPEN_WRITABLE_FILE = OPEN_WRITABLE_FILE.asInstanceOf[js.Any], SAVE_FILE = SAVE_FILE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOPENDIRECTORY]
  }
}

