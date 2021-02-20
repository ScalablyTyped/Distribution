package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectRendererMod {
  
  @JSImport("babylonjs/Materials/effectRenderer", "EffectRenderer")
  @js.native
  class EffectRenderer protected () extends StObject {
    /**
      * Creates an effect renderer
      * @param engine the engine to use for rendering
      * @param options defines the options of the effect renderer
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, options: IEffectRendererOptions) = this()
    
    var _fullscreenViewport: js.Any = js.native
    
    var _indexBuffer: js.Any = js.native
    
    var _vertexBuffers: js.Any = js.native
    
    /**
      * Sets the current effect wrapper to use during draw.
      * The effect needs to be ready before calling this api.
      * This also sets the default full screen position attribute.
      * @param effectWrapper Defines the effect to draw with
      */
    def applyEffectWrapper(effectWrapper: EffectWrapper): Unit = js.native
    
    /**
      * Binds the embedded attributes buffer to the effect.
      * @param effect Defines the effect to bind the attributes for
      */
    def bindBuffers(effect: Effect): Unit = js.native
    
    /**
      * Disposes of the effect renderer
      */
    def dispose(): Unit = js.native
    
    /**
      * Draws a full screen quad.
      */
    def draw(): Unit = js.native
    
    var engine: js.Any = js.native
    
    var isRenderTargetTexture: js.Any = js.native
    
    /**
      * renders one or more effects to a specified texture
      * @param effectWrapper the effect to renderer
      * @param outputTexture texture to draw to, if null it will render to the screen.
      */
    def render(effectWrapper: EffectWrapper): Unit = js.native
    def render(effectWrapper: EffectWrapper, outputTexture: Nullable[InternalTexture | RenderTargetTexture]): Unit = js.native
    
    /**
      * Restores engine states
      */
    def restoreStates(): Unit = js.native
    
    /**
      * Sets the current viewport in normalized coordinates 0-1
      * @param viewport Defines the viewport to set (defaults to 0 0 1 1)
      */
    def setViewport(): Unit = js.native
    def setViewport(viewport: Viewport): Unit = js.native
  }
  /* static members */
  object EffectRenderer {
    
    @JSImport("babylonjs/Materials/effectRenderer", "EffectRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Materials/effectRenderer", "EffectRenderer._DefaultOptions")
    @js.native
    def _DefaultOptions: js.Any = js.native
    @scala.inline
    def _DefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Materials/effectRenderer", "EffectWrapper")
  @js.native
  class EffectWrapper protected () extends StObject {
    /**
      * Creates an effect to be renderer
      * @param creationOptions options to create the effect
      */
    def this(creationOptions: EffectWrapperCreationOptions) = this()
    
    /**
      * Disposes of the effect wrapper
      */
    def dispose(): Unit = js.native
    
    /**
      * The underlying effect
      */
    var effect: Effect = js.native
    
    /**
      * Event that is fired right before the effect is drawn (should be used to update uniforms)
      */
    var onApplyObservable: Observable[js.Object] = js.native
  }
  
  /**
    * Options to create an EffectWrapper
    */
  @js.native
  trait EffectWrapperCreationOptions extends StObject {
    
    /**
      * Attributes to use in the shader
      */
    var attributeNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Defines to use in the shader
      */
    var defines: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Engine to use to create the effect
      */
    var engine: ThinEngine = js.native
    
    /**
      * Fragment shader for the effect
      */
    var fragmentShader: String = js.native
    
    /**
      * The friendly name of the effect displayed in Spector.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Callback when effect is compiled
      */
    var onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]] = js.native
    
    /**
      * Texture sampler names to use in the shader
      */
    var samplerNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Uniforms to use in the shader
      */
    var uniformNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Use the shader store instead of direct source code
      */
    var useShaderStore: js.UndefOr[Boolean] = js.native
    
    /**
      * Vertex shader for the effect
      */
    var vertexShader: js.UndefOr[String] = js.native
  }
  object EffectWrapperCreationOptions {
    
    @scala.inline
    def apply(engine: ThinEngine, fragmentShader: String): EffectWrapperCreationOptions = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], fragmentShader = fragmentShader.asInstanceOf[js.Any])
      __obj.asInstanceOf[EffectWrapperCreationOptions]
    }
    
    @scala.inline
    implicit class EffectWrapperCreationOptionsMutableBuilder[Self <: EffectWrapperCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeNames(value: js.Array[String]): Self = StObject.set(x, "attributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNamesUndefined: Self = StObject.set(x, "attributeNames", js.undefined)
      
      @scala.inline
      def setAttributeNamesVarargs(value: String*): Self = StObject.set(x, "attributeNames", js.Array(value :_*))
      
      @scala.inline
      def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
      
      @scala.inline
      def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: ThinEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
      
      @scala.inline
      def setOnCompiledUndefined: Self = StObject.set(x, "onCompiled", js.undefined)
      
      @scala.inline
      def setSamplerNames(value: js.Array[String]): Self = StObject.set(x, "samplerNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplerNamesUndefined: Self = StObject.set(x, "samplerNames", js.undefined)
      
      @scala.inline
      def setSamplerNamesVarargs(value: String*): Self = StObject.set(x, "samplerNames", js.Array(value :_*))
      
      @scala.inline
      def setUniformNames(value: js.Array[String]): Self = StObject.set(x, "uniformNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformNamesUndefined: Self = StObject.set(x, "uniformNames", js.undefined)
      
      @scala.inline
      def setUniformNamesVarargs(value: String*): Self = StObject.set(x, "uniformNames", js.Array(value :_*))
      
      @scala.inline
      def setUseShaderStore(value: Boolean): Self = StObject.set(x, "useShaderStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseShaderStoreUndefined: Self = StObject.set(x, "useShaderStore", js.undefined)
      
      @scala.inline
      def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  @js.native
  trait IEffectRendererOptions extends StObject {
    
    /**
      * Defines the indices.
      */
    var indices: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * Defines the vertices positions.
      */
    var positions: js.UndefOr[js.Array[Double]] = js.native
  }
  object IEffectRendererOptions {
    
    @scala.inline
    def apply(): IEffectRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEffectRendererOptions]
    }
    
    @scala.inline
    implicit class IEffectRendererOptionsMutableBuilder[Self <: IEffectRendererOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      @scala.inline
      def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
      
      @scala.inline
      def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      @scala.inline
      def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value :_*))
    }
  }
}
