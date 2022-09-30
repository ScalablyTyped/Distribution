package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.externalTextureMod.ExternalTexture
import typings.babylonjs.imaterialcontextMod.IMaterialContext
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuMaterialContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuMaterialContext", "WebGPUMaterialContext")
  @js.native
  open class WebGPUMaterialContext ()
    extends StObject
       with IMaterialContext {
    
    /* protected */ var _numExternalTextures: Double = js.native
    
    /* protected */ var _numFloatTextures: Double = js.native
    
    def forceBindGroupCreation: Boolean = js.native
    
    def hasFloatTextures: Boolean = js.native
    
    var isDirty: Boolean = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    var samplers: StringDictionary[Nullable[IWebGPUMaterialContextSamplerCache]] = js.native
    
    def setSampler(name: String, sampler: Nullable[TextureSampler]): Unit = js.native
    
    def setTexture(name: String, texture: Nullable[InternalTexture | ExternalTexture]): Unit = js.native
    
    var textures: StringDictionary[Nullable[IWebGPUMaterialContextTextureCache]] = js.native
    
    /* CompleteClass */
    var uniqueId: Double = js.native
    
    var updateId: Double = js.native
  }
  /* static members */
  object WebGPUMaterialContext {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuMaterialContext", "WebGPUMaterialContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuMaterialContext", "WebGPUMaterialContext._Counter")
    @js.native
    def _Counter: Any = js.native
    inline def _Counter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
  }
  
  /** @internal */
  trait IWebGPUMaterialContextSamplerCache extends StObject {
    
    @JSName("hashCode")
    var hashCode_FIWebGPUMaterialContextSamplerCache: Double
    
    var sampler: Nullable[TextureSampler]
  }
  object IWebGPUMaterialContextSamplerCache {
    
    inline def apply(hashCode_ : Double): IWebGPUMaterialContextSamplerCache = {
      val __obj = js.Dynamic.literal(sampler = null)
      __obj.updateDynamic("hashCode")(hashCode_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebGPUMaterialContextSamplerCache]
    }
    
    extension [Self <: IWebGPUMaterialContextSamplerCache](x: Self) {
      
      inline def setHashCode_(value: Double): Self = StObject.set(x, "hashCode", value.asInstanceOf[js.Any])
      
      inline def setSampler(value: Nullable[TextureSampler]): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setSamplerNull: Self = StObject.set(x, "sampler", null)
    }
  }
  
  /** @internal */
  trait IWebGPUMaterialContextTextureCache extends StObject {
    
    var isExternalTexture: Boolean
    
    var isFloatTexture: Boolean
    
    var texture: Nullable[InternalTexture | ExternalTexture]
  }
  object IWebGPUMaterialContextTextureCache {
    
    inline def apply(isExternalTexture: Boolean, isFloatTexture: Boolean): IWebGPUMaterialContextTextureCache = {
      val __obj = js.Dynamic.literal(isExternalTexture = isExternalTexture.asInstanceOf[js.Any], isFloatTexture = isFloatTexture.asInstanceOf[js.Any], texture = null)
      __obj.asInstanceOf[IWebGPUMaterialContextTextureCache]
    }
    
    extension [Self <: IWebGPUMaterialContextTextureCache](x: Self) {
      
      inline def setIsExternalTexture(value: Boolean): Self = StObject.set(x, "isExternalTexture", value.asInstanceOf[js.Any])
      
      inline def setIsFloatTexture(value: Boolean): Self = StObject.set(x, "isFloatTexture", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: Nullable[InternalTexture | ExternalTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureNull: Self = StObject.set(x, "texture", null)
    }
  }
}
