package typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileType extends js.Object

@JSImport("browserfs/dist/node/core/node_fs_stats", "FileType")
@js.native
object FileType extends js.Object {
  @js.native
  sealed trait DIRECTORY extends FileType
  
  @js.native
  sealed trait FILE extends FileType
  
  @js.native
  sealed trait SYMLINK extends FileType
  
  /* 16384 */ val DIRECTORY: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.DIRECTORY with Double = js.native
  /* 32768 */ val FILE: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.FILE with Double = js.native
  /* 40960 */ val SYMLINK: typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.FileType.SYMLINK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
}

