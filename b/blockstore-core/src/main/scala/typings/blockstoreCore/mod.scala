package typings.blockstoreCore

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
    
    inline def abortedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error]
    inline def abortedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def closeFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("closeFailedError")().asInstanceOf[js.Error]
    inline def closeFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("closeFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def deleteFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFailedError")().asInstanceOf[js.Error]
    inline def deleteFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def getFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getFailedError")().asInstanceOf[js.Error]
    inline def getFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def hasFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFailedError")().asInstanceOf[js.Error]
    inline def hasFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def notFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error]
    inline def notFoundError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def openFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("openFailedError")().asInstanceOf[js.Error]
    inline def openFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("openFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    
    inline def putFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("putFailedError")().asInstanceOf[js.Error]
    inline def putFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("putFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  }
  
  @JSImport("blockstore-core", "MemoryBlockstore")
  @js.native
  open class MemoryBlockstore ()
    extends typings.blockstoreCore.distSrcMemoryMod.MemoryBlockstore
}
