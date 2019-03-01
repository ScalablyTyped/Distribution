package typings
package cordovaDashPluginDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface represents a file system. */
trait FileSystem extends js.Object {
  /* The name of the file system, unique across the list of exposed file systems. */
  var name: java.lang.String
  /** The root directory of the file system. */
  var root: DirectoryEntry
}

object FileSystem {
  @scala.inline
  def apply(name: java.lang.String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[FileSystem]
  }
}

