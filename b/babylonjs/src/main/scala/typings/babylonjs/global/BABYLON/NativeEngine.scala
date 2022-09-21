package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.NativeEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeEngine")
@js.native
open class NativeEngine ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeEngine {
  def this(options: NativeEngineOptions) = this()
}
/* static members */
object NativeEngine {
  
  @JSGlobal("BABYLON.NativeEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.NativeEngine.PROTOCOL_VERSION")
  @js.native
  val PROTOCOL_VERSION: Any = js.native
  
  /** @hidden */
  inline def _createNativeDataStream(): typings.babylonjs.BABYLON.NativeDataStream = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNativeDataStream")().asInstanceOf[typings.babylonjs.BABYLON.NativeDataStream]
}
