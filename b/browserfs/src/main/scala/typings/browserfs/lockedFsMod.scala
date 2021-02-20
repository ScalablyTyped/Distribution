package typings.browserfs

import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockedFsMod {
  
  @JSImport("browserfs/dist/node/generic/locked_fs", JSImport.Default)
  @js.native
  class default[T /* <: FileSystem */] protected () extends LockedFS[T] {
    def this(fs: T) = this()
  }
  
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
}
