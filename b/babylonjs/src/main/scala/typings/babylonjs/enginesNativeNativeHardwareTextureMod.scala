package typings.babylonjs

import typings.babylonjs.enginesNativeNativeInterfacesMod.INativeEngine
import typings.babylonjs.materialsTexturesHardwareTextureWrapperMod.HardwareTextureWrapper
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesNativeNativeHardwareTextureMod {
  
  @JSImport("babylonjs/Engines/Native/nativeHardwareTexture", "NativeHardwareTexture")
  @js.native
  open class NativeHardwareTexture protected ()
    extends StObject
       with HardwareTextureWrapper {
    def this(existingTexture: js.typedarray.Uint32Array, engine: INativeEngine) = this()
    
    /* private */ val _engine: Any = js.native
    
    /* private */ var _nativeTexture: Any = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    def set(hardwareTexture: js.typedarray.Uint32Array): Unit = js.native
    /* CompleteClass */
    override def set(hardwareTexture: Any): Unit = js.native
    
    def setUsage(): Unit = js.native
    /* CompleteClass */
    override def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    var underlyingResource: Any = js.native
    @JSName("underlyingResource")
    def underlyingResource_MNativeHardwareTexture: Nullable[js.typedarray.Uint32Array] = js.native
  }
}
