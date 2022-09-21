package typings.browserfsH4gEcI12

import typings.browserfsH4gEcI12.fileFlagDTsMod.FileFlag
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSOneArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lockedFsDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/generic/locked_fs.d.ts", JSImport.Default)
  @js.native
  open class default[T /* <: FileSystem */] protected ()
    extends StObject
       with LockedFS[T] {
    def this(fs: T) = this()
  }
  
  @js.native
  trait LockedFS[T /* <: FileSystem */]
    extends StObject
       with FileSystem {
    
    /* private */ var _fs: Any = js.native
    
    /* private */ var _mu: Any = js.native
    
    def appendFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    def appendFileSync(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
    
    def getFSUnlocked(): T = js.native
    
    def initialize(cb: BFSOneArgCallback): Unit = js.native
    
    def writeFileSync(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double): Unit = js.native
  }
}
