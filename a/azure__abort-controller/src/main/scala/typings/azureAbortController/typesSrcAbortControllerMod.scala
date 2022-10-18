package typings.azureAbortController

import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignal_
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcAbortControllerMod {
  
  @JSImport("@azure/abort-controller/types/src/AbortController", "AbortController")
  @js.native
  /**
    * @param parentSignals - The AbortSignals that will signal aborted on the AbortSignal associated with this controller.
    */
  open class AbortController () extends StObject {
    /**
      * @param parentSignals - The AbortSignals that will signal aborted on the AbortSignal associated with this controller.
      */
    def this(parentSignals: AbortSignalLike*) = this()
    def this(parentSignals: js.Array[AbortSignalLike]) = this()
    
    /* private */ var _signal: Any = js.native
    
    /**
      * Signal that any operations passed this controller's associated abort signal
      * to cancel any remaining work and throw an `AbortError`.
      */
    def abort(): Unit = js.native
    
    /**
      * The AbortSignal associated with this controller that will signal aborted
      * when the abort method is called on this controller.
      *
      * @readonly
      */
    def signal: AbortSignal_ = js.native
  }
  /* static members */
  object AbortController {
    
    @JSImport("@azure/abort-controller/types/src/AbortController", "AbortController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AbortSignal instance that will abort after the provided ms.
      * @param ms - Elapsed time in milliseconds to trigger an abort.
      */
    inline def timeout(ms: Double): AbortSignal_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(ms.asInstanceOf[js.Any]).asInstanceOf[AbortSignal_]
  }
  
  @JSImport("@azure/abort-controller/types/src/AbortController", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
