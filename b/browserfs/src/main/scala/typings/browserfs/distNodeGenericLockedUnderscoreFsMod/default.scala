package typings.browserfs.distNodeGenericLockedUnderscoreFsMod

import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/locked_fs", JSImport.Default)
@js.native
class default[T /* <: FileSystem */] protected () extends LockedFS[T] {
  def this(fs: T) = this()
}

