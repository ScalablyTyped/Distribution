package typings.cfcsCore

import typings.cfcsCore.declarationReactiveObserverMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveComputedObserverMod {
  
  @JSImport("@cfcs/core/declaration/reactive/ComputedObserver", "ComputedObserver")
  @js.native
  open class ComputedObserver[T] protected () extends Observer[T] {
    /**
      * @description Creates a new computed observer from the values of other observers.
      * It is read-only and if you change the value of the observer used inside the callback, its value will be automatically updated.
      * @param _computedCallback A function for observers to be computed.
      */
    def this(_computedCallback: js.Function0[T]) = this()
    
    /* private */ var _computedCallback: Any = js.native
    
    /* private */ var _onCheckUpdate: Any = js.native
    
    /* private */ var _registered: Any = js.native
  }
}
