package typings.babylonjs

import typings.babylonjs.enginesNativeEngineMod.NativeEngine
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesNativeNativeRenderTargetWrapperMod {
  
  @JSImport("babylonjs/Engines/Native/nativeRenderTargetWrapper", "NativeRenderTargetWrapper")
  @js.native
  open class NativeRenderTargetWrapper protected () extends RenderTargetWrapper {
    def this(isMulti: Boolean, isCube: Boolean, size: TextureSize, engine: NativeEngine) = this()
    
    /* private */ var __framebuffer: Any = js.native
    
    /* private */ var __framebufferDepthStencil: Any = js.native
    
    @JSName("_engine")
    val _engine_NativeRenderTargetWrapper: NativeEngine = js.native
    
    def _framebuffer: Nullable[js.typedarray.Uint32Array] = js.native
    
    def _framebufferDepthStencil: Nullable[js.typedarray.Uint32Array] = js.native
    def _framebufferDepthStencil_=(framebufferDepthStencil: Nullable[js.typedarray.Uint32Array]): Unit = js.native
    
    def _framebuffer_=(framebuffer: Nullable[js.typedarray.Uint32Array]): Unit = js.native
  }
}
