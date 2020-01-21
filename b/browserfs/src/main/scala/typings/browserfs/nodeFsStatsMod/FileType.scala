package typings.browserfs.nodeFsStatsMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  /* 16384 */ @js.native
  object DIRECTORY extends TopLevel[DIRECTORY with Double]
  
  /* 32768 */ @js.native
  object FILE extends TopLevel[FILE with Double]
  
  /* 40960 */ @js.native
  object SYMLINK extends TopLevel[SYMLINK with Double]
  
}

