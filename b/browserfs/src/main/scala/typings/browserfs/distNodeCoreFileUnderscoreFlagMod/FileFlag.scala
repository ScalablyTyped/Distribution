package typings.browserfs.distNodeCoreFileUnderscoreFlagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/file_flag", "FileFlag")
@js.native
class FileFlag protected () extends js.Object {
  /**
    * This should never be called directly.
    * @param modeStr The string representing the mode
    * @throw when the mode string is invalid
    */
  def this(flagStr: String) = this()
  var flagStr: js.Any = js.native
  /**
    * Get the underlying flag string for this flag.
    */
  def getFlagString(): String = js.native
  /**
    * Returns true if the file is appendable.
    */
  def isAppendable(): Boolean = js.native
  /**
    * Returns true if the file is open in exclusive mode.
    */
  def isExclusive(): Boolean = js.native
  /**
    * Returns true if the file is readable.
    */
  def isReadable(): Boolean = js.native
  /**
    * Returns true if the file is open in synchronous mode.
    */
  def isSynchronous(): Boolean = js.native
  /**
    * Returns true if the file mode should truncate.
    */
  def isTruncating(): Boolean = js.native
  /**
    * Returns true if the file is writeable.
    */
  def isWriteable(): Boolean = js.native
  /**
    * Returns one of the static fields on this object that indicates the
    * appropriate response to the path existing.
    */
  def pathExistsAction(): ActionType = js.native
  /**
    * Returns one of the static fields on this object that indicates the
    * appropriate response to the path not existing.
    */
  def pathNotExistsAction(): ActionType = js.native
}

/* static members */
@JSImport("browserfs/dist/node/core/file_flag", "FileFlag")
@js.native
object FileFlag extends js.Object {
  var flagCache: js.Any = js.native
  var validFlagStrs: js.Any = js.native
  /**
    * Get an object representing the given file flag.
    * @param modeStr The string representing the flag
    * @return The FileFlag object representing the flag
    * @throw when the flag string is invalid
    */
  def getFileFlag(flagStr: String): FileFlag = js.native
}

