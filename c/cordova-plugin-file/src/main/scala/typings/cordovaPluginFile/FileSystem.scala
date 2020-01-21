package typings.cordovaPluginFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface represents a file system. */
trait FileSystem extends js.Object {
  /* The name of the file system, unique across the list of exposed file systems. */
  var name: String
  /** The root directory of the file system. */
  var root: DirectoryEntry
}

object FileSystem {
  @scala.inline
  def apply(name: String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystem]
  }
}

