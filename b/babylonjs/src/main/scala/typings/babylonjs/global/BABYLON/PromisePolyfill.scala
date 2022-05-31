package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PromisePolyfill")
@js.native
class PromisePolyfill ()
  extends StObject
     with typings.babylonjs.BABYLON.PromisePolyfill
/* static members */
object PromisePolyfill {
  
  @JSGlobal("BABYLON.PromisePolyfill")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static function used to check if the polyfill is required
    * If this is the case then the function will inject the polyfill to window.Promise
    * @param force defines a boolean used to force the injection (mostly for testing purposes)
    */
  inline def Apply(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Apply")().asInstanceOf[Unit]
  inline def Apply(force: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Apply")(force.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
