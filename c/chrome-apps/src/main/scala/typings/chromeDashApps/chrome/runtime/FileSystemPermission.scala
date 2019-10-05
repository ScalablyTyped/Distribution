package typings.chromeDashApps.chrome.runtime

import typings.chromeDashApps.chromeDashAppsStrings.directory
import typings.chromeDashApps.chromeDashAppsStrings.requestFileSystem
import typings.chromeDashApps.chromeDashAppsStrings.retainEntries
import typings.chromeDashApps.chromeDashAppsStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemPermission extends ChromeOSOnlyPermissions {
  /**
    * @enum {string}
    * @requires(CrOS) 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[write | retainEntries | directory | requestFileSystem]
}

object FileSystemPermission {
  @scala.inline
  def apply(fileSystem: js.Array[write | retainEntries | directory | requestFileSystem]): FileSystemPermission = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem)
  
    __obj.asInstanceOf[FileSystemPermission]
  }
}

