package typings.chromeApps.chrome.fileSystem

import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **openFile**
  *  - Prompts the user to open an existing file and returns a FileEntry on success.
  *    From Chrome 31 onwards, the FileEntry will be writable if the application has
  *    the 'write' permission under 'fileSystem'; otherwise, the FileEntry will be read-only.
  * **openWritableFile**
  *  - Prompts the user to open an existing file and returns a writable FileEntry on success.
  *    Calls using this type will fail with a runtime error if the application doesn't have the
  *    'write' permission under 'fileSystem'.
  * **saveFile**
  *  - Prompts the user to open an existing file or a new file and returns a writable FileEntry
  *    on success. Calls using this type will fail with a runtime error if the application doesn't
  *    have the 'write' permission under 'fileSystem'.
  * **openDirectory**
  *  - Prompts the user to open a directory and returns a DirectoryEntry on success. Calls using
  *    this type will fail with a runtime error if the application doesn't have the 'directory'
  *    permission under 'fileSystem'. If the application has the 'write' permission under
  *    'fileSystem', the returned DirectoryEntry will be writable; otherwise it will be read-only.
  *    New in Chrome 31.
  * @enum
  */
@JSGlobal("chrome.fileSystem.ChooseEntryType")
@js.native
object ChooseEntryType extends js.Object {
  var OPEN_DIRECTORY: openDirectory = js.native
  var OPEN_FILE: openFile = js.native
  var OPEN_WRITABLE_FILE: openWritableFile = js.native
  var SAVE_FILE: saveFile = js.native
}

