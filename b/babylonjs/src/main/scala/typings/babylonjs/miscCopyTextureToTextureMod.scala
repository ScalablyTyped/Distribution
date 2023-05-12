package typings.babylonjs

import typings.babylonjs.enginesRenderTargetWrapperMod.IRenderTargetTexture
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesThinTextureMod.ThinTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscCopyTextureToTextureMod {
  
  @js.native
  sealed trait ConversionMode extends StObject
  @JSImport("babylonjs/Misc/copyTextureToTexture", "ConversionMode")
  @js.native
  object ConversionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConversionMode & Double] = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with ConversionMode
    /* 0 */ val None: typings.babylonjs.miscCopyTextureToTextureMod.ConversionMode.None & Double = js.native
    
    @js.native
    sealed trait ToGammaSpace
      extends StObject
         with ConversionMode
    /* 2 */ val ToGammaSpace: typings.babylonjs.miscCopyTextureToTextureMod.ConversionMode.ToGammaSpace & Double = js.native
    
    @js.native
    sealed trait ToLinearSpace
      extends StObject
         with ConversionMode
    /* 1 */ val ToLinearSpace: typings.babylonjs.miscCopyTextureToTextureMod.ConversionMode.ToLinearSpace & Double = js.native
  }
  
  @JSImport("babylonjs/Misc/copyTextureToTexture", "CopyTextureToTexture")
  @js.native
  open class CopyTextureToTexture protected () extends StObject {
    /**
      * Constructs a new instance of the class
      * @param engine The engine to use for the copy
      * @param isDepthTexture True means that we should write (using gl_FragDepth) into the depth texture attached to the destination (default: false)
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, isDepthTexture: Boolean) = this()
    
    /* private */ var _conversion: Any = js.native
    
    /* private */ var _effectWrapper: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _isDepthTexture: Any = js.native
    
    /* private */ var _renderer: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _textureIsInternal: Any = js.native
    
    def copy(source: InternalTexture, destination: IRenderTargetTexture): Boolean = js.native
    def copy(source: InternalTexture, destination: IRenderTargetTexture, conversion: ConversionMode): Boolean = js.native
    /**
      * Copy one texture into another
      * @param source The source texture
      * @param destination The destination texture
      * @param conversion The conversion mode that should be applied when copying
      * @returns
      */
    def copy(source: InternalTexture, destination: RenderTargetWrapper): Boolean = js.native
    def copy(source: InternalTexture, destination: RenderTargetWrapper, conversion: ConversionMode): Boolean = js.native
    def copy(source: ThinTexture, destination: IRenderTargetTexture): Boolean = js.native
    def copy(source: ThinTexture, destination: IRenderTargetTexture, conversion: ConversionMode): Boolean = js.native
    def copy(source: ThinTexture, destination: RenderTargetWrapper): Boolean = js.native
    def copy(source: ThinTexture, destination: RenderTargetWrapper, conversion: ConversionMode): Boolean = js.native
    
    /**
      * Releases all the resources used by the class
      */
    def dispose(): Unit = js.native
    
    /**
      * Indicates if the effect is ready to be used for the copy
      * @returns true if "copy" can be called without delay, else false
      */
    def isReady(): Boolean = js.native
  }
}
