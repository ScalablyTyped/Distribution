package typings.browserfs.distNodeCoreFileUnderscoreSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemConstructor extends js.Object {
  /**
    * **Core**: Name to identify this particular file system.
    */
  var Name: String
  /**
    * **Core**: Describes all of the options available for this file system.
    */
  var Options: FileSystemOptions
  /**
    * **Core**: Creates a file system of this given type with the given
    * options.
    */
  def Create(options: js.Object, cb: BFSCallback[FileSystem]): Unit
  /**
    * **Core**: Returns 'true' if this filesystem is available in the current
    * environment. For example, a `localStorage`-backed filesystem will return
    * 'false' if the browser does not support that API.
    *
    * Defaults to 'false', as the FileSystem base class isn't usable alone.
    */
  def isAvailable(): Boolean
}

object FileSystemConstructor {
  @scala.inline
  def apply(
    Create: (js.Object, BFSCallback[FileSystem]) => Unit,
    Name: String,
    Options: FileSystemOptions,
    isAvailable: () => Boolean
  ): FileSystemConstructor = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction2(Create), Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], isAvailable = js.Any.fromFunction0(isAvailable))
  
    __obj.asInstanceOf[FileSystemConstructor]
  }
}

