package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeHardwareTexture
  extends StObject
     with HardwareTextureWrapper {
  
  /* private */ val _engine: Any = js.native
  
  /* private */ var _nativeTexture: Any = js.native
  
  def set(hardwareTexture: js.typedarray.Uint32Array): Unit = js.native
  
  def setUsage(): Unit = js.native
  
  @JSName("underlyingResource")
  def underlyingResource_MNativeHardwareTexture: Nullable[js.typedarray.Uint32Array] = js.native
}
