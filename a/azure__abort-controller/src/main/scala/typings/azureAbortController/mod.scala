package typings.azureAbortController

import typings.azureAbortController.abortSignalMod.AbortSignalLike
import typings.azureAbortController.abortSignalMod.AbortSignal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/abort-controller", "AbortController")
  @js.native
  /**
    * @param parentSignals - The AbortSignals that will signal aborted on the AbortSignal associated with this controller.
    */
  open class AbortController ()
    extends typings.azureAbortController.abortControllerMod.AbortController {
    /**
      * @param parentSignals - The AbortSignals that will signal aborted on the AbortSignal associated with this controller.
      */
    def this(parentSignals: AbortSignalLike*) = this()
    def this(parentSignals: js.Array[AbortSignalLike]) = this()
  }
  /* static members */
  object AbortController {
    
    @JSImport("@azure/abort-controller", "AbortController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AbortSignal instance that will abort after the provided ms.
      * @param ms - Elapsed time in milliseconds to trigger an abort.
      */
    inline def timeout(ms: Double): AbortSignal_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[AbortSignal_]
  }
  
  @JSImport("@azure/abort-controller", "AbortError")
  @js.native
  open class AbortError ()
    extends typings.azureAbortController.abortControllerMod.AbortError {
    def this(message: String) = this()
  }
  
  @JSImport("@azure/abort-controller", "AbortSignal")
  @js.native
  open class AbortSignal () extends AbortSignal_
}
