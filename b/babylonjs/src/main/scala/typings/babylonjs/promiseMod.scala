package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("babylonjs/Misc/promise", "PromisePolyfill")
  @js.native
  class PromisePolyfill () extends StObject
  /* static members */
  object PromisePolyfill {
    
    /**
      * Static function used to check if the polyfill is required
      * If this is the case then the function will inject the polyfill to window.Promise
      * @param force defines a boolean used to force the injection (mostly for testing purposes)
      */
    @JSImport("babylonjs/Misc/promise", "PromisePolyfill.Apply")
    @js.native
    def Apply(): Unit = js.native
    @JSImport("babylonjs/Misc/promise", "PromisePolyfill.Apply")
    @js.native
    def Apply(force: Boolean): Unit = js.native
  }
}
