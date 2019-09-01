package typings.browserfs.distNodeGenericPreloadUnderscoreFileMod

import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/preload_file", JSImport.Default)
@js.native
class default[T /* <: FileSystem */] protected () extends PreloadFile[T] {
  /**
    * Creates a file with the given path and, optionally, the given contents. Note
    * that, if contents is specified, it will be mutated by the file!
    * @param _fs The file system that created the file.
    * @param _path
    * @param _mode The mode that the file was opened using.
    *   Dictates permissions and where the file pointer starts.
    * @param _stat The stats object for the given file.
    *   PreloadFile will mutate this object. Note that this object must contain
    *   the appropriate mode that the file was opened as.
    * @param contents A buffer containing the entire
    *   contents of the file. PreloadFile will mutate this buffer. If not
    *   specified, we assume it is a new file.
    */
  def this(
    _fs: T,
    _path: String,
    _flag: FileFlag,
    _stat: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default
  ) = this()
  def this(
    _fs: T,
    _path: String,
    _flag: FileFlag,
    _stat: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default,
    contents: Buffer
  ) = this()
}

