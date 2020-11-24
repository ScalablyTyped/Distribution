package typings.browserfs.nodeFsStatsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileType extends js.Object
@JSImport("browserfs/dist/node/core/node_fs_stats", "FileType")
@js.native
object FileType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileType with Double] = js.native
  
  @js.native
  sealed trait DIRECTORY extends FileType
  /* 16384 */ @js.native
  object DIRECTORY extends TopLevel[DIRECTORY with Double]
  
  @js.native
  sealed trait FILE extends FileType
  /* 32768 */ @js.native
  object FILE extends TopLevel[FILE with Double]
  
  @js.native
  sealed trait SYMLINK extends FileType
  /* 40960 */ @js.native
  object SYMLINK extends TopLevel[SYMLINK with Double]
}
