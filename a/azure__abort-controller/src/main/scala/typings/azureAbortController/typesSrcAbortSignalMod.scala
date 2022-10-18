package typings.azureAbortController

import typings.azureAbortController.azureAbortControllerStrings.abort
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcAbortSignalMod {
  
  @JSImport("@azure/abort-controller/types/src/AbortSignal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/abort-controller/types/src/AbortSignal", "AbortSignal")
  @js.native
  open class AbortSignal_ ()
    extends StObject
       with AbortSignalLike {
    
    /**
      * Status of whether aborted or not.
      *
      * @readonly
      */
    @JSName("aborted")
    def aborted_MAbortSignal_ : Boolean = js.native
    
    /**
      * Dispatches a synthetic event to the AbortSignal.
      */
    def dispatchEvent(_event: Event): Boolean = js.native
    
    /**
      * onabort event listener.
      */
    var onabort: (js.Function1[/* ev */ js.UndefOr[Event], Any]) | Null = js.native
  }
  
  inline def abortSignal(signal: AbortSignal_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abortSignal")(signal.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait AbortSignalLike extends StObject {
    
    /**
      * Indicates if the signal has already been aborted.
      */
    val aborted: Boolean = js.native
    
    /**
      * Add new "abort" event listener, only support "abort" event.
      */
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Any, Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Any, Any], options: Any): Unit = js.native
    
    /**
      * Remove "abort" event listener, only support "abort" event.
      */
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Any, Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Any, Any], options: Any): Unit = js.native
  }
}
