package typings.blockstoreCore

import typings.errCode.mod.Extensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blockstore-core", "BaseBlockstore")
  @js.native
  open class BaseBlockstore ()
    extends typings.blockstoreCore.distSrcBaseMod.BaseBlockstore
  
  object Errors {
    
    @JSImport("blockstore-core", "Errors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortedError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error & Extensions]
    inline def abortedError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
    
    inline def notFoundError(): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error & Extensions]
    inline def notFoundError(err: js.Error): js.Error & Extensions = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error & Extensions]
  }
  
  @JSImport("blockstore-core", "MemoryBlockstore")
  @js.native
  open class MemoryBlockstore ()
    extends typings.blockstoreCore.distSrcMemoryMod.MemoryBlockstore
}
