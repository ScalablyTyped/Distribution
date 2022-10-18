package typings.babylonjs.mod

import typings.babylonjs.enginesNativeEngineMod.NativeEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "NativeEngine")
@js.native
open class NativeEngine ()
  extends typings.babylonjs.legacyLegacyMod.NativeEngine {
  def this(options: NativeEngineOptions) = this()
}
/* static members */
object NativeEngine {
  
  @JSImport("babylonjs", "NativeEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "NativeEngine.PROTOCOL_VERSION")
  @js.native
  val PROTOCOL_VERSION: Any = js.native
  
  /** @internal */
  inline def _createNativeDataStream(): typings.babylonjs.enginesNativeNativeDataStreamMod.NativeDataStream = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNativeDataStream")().asInstanceOf[typings.babylonjs.enginesNativeNativeDataStreamMod.NativeDataStream]
}
