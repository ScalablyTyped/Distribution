package typings.browserfs

import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/generic/locked_fs", JSImport.Namespace)
@js.native
object distNodeGenericLockedUnderscoreFsMod extends js.Object {
  @js.native
  trait LockedFS[T /* <: FileSystem */] extends FileSystem {
    var _fs: js.Any = js.native
    var _mu: js.Any = js.native
    def appendFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    def appendFileSync(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
    def getFSUnlocked(): T = js.native
    def initialize(cb: BFSOneArgCallback): Unit = js.native
    def writeFileSync(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  }
  
  @js.native
  class default[T /* <: FileSystem */] protected () extends LockedFS[T] {
    def this(fs: T) = this()
  }
  
}

