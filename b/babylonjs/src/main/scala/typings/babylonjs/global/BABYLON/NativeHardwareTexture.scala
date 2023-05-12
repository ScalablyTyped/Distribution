package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.INativeEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeHardwareTexture")
@js.native
open class NativeHardwareTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.NativeHardwareTexture {
  def this(existingTexture: js.typedarray.Uint32Array, engine: INativeEngine) = this()
  
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(hardwareTexture: Any): Unit = js.native
  
  /* CompleteClass */
  override def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit = js.native
  
  /* CompleteClass */
  var underlyingResource: Any = js.native
}
