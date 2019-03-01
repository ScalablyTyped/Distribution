package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemPermission extends ChromeOSOnlyPermissions {
  /**
    * @enum {string}
    * @requires(CrOS) 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[
    chromeDashAppsLib.chromeDashAppsLibStrings.write | chromeDashAppsLib.chromeDashAppsLibStrings.retainEntries | chromeDashAppsLib.chromeDashAppsLibStrings.directory | chromeDashAppsLib.chromeDashAppsLibStrings.requestFileSystem
  ]
}

object FileSystemPermission {
  @scala.inline
  def apply(
    fileSystem: js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.write | chromeDashAppsLib.chromeDashAppsLibStrings.retainEntries | chromeDashAppsLib.chromeDashAppsLibStrings.directory | chromeDashAppsLib.chromeDashAppsLibStrings.requestFileSystem
    ]
  ): FileSystemPermission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileSystem")(fileSystem)
    __obj.asInstanceOf[FileSystemPermission]
  }
}

