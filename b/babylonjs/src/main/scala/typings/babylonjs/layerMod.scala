package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("babylonjs/Layers/layer", "Layer")
  @js.native
  open class Layer protected () extends StObject {
    /**
      * Instantiates a new layer.
      * This represents a full screen 2d layer.
      * This can be useful to display a picture in the  background of your scene for instance.
      * @see https://www.babylonjs-playground.com/#08A2BS#1
      * @param name Define the name of the layer in the scene
      * @param imgUrl Define the url of the texture to display in the layer
      * @param scene Define the scene the layer belongs to
      * @param isBackground Defines whether the layer is displayed in front or behind the scene
      * @param color Defines a color for the layer
      */
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene]
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Boolean
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Boolean,
      color: Color4
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Unit,
      color: Color4
    ) = this()
    
    /* private */ var _applyPostProcess: Any = js.native
    
    /* private */ var _createIndexBuffer: Any = js.native
    
    /* private */ var _drawWrapper: Any = js.native
    
    /* private */ var _indexBuffer: Any = js.native
    
    /* private */ var _onAfterRenderObserver: Any = js.native
    
    /* private */ var _onBeforeRenderObserver: Any = js.native
    
    /* private */ var _onDisposeObserver: Any = js.native
    
    /* private */ var _previousDefines: Any = js.native
    
    /** @internal */
    def _rebuild(): Unit = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _vertexBuffers: Any = js.native
    
    /**
      * Define the alpha blending mode used in the layer in case the texture or color has an alpha.
      */
    var alphaBlendingMode: Double = js.native
    
    /**
      * Define if the layer should alpha test or alpha blend with the rest of the scene.
      * Alpha test will not mix with the background color in case of transparency.
      * It will either use the texture color or the background depending on the alpha value of the current pixel.
      */
    var alphaTest: Boolean = js.native
    
    def applyPostProcess: Boolean = js.native
    /**
      * Determines if the layer is drawn before (true) or after (false) post-processing.
      * If the layer is background, it is always before.
      */
    def applyPostProcess_=(value: Boolean): Unit = js.native
    
    /**
      * Define the color of the layer (instead of texture).
      */
    var color: Color4 = js.native
    
    /**
      * Disposes and releases the associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Is the layer in background or foreground.
      */
    var isBackground: Boolean = js.native
    
    /**
      * Define if the layer is enabled (ie. should be displayed). Default: true
      */
    var isEnabled: Boolean = js.native
    
    /**
      * Define a mask to restrict the layer to only some of the scene cameras.
      */
    var layerMask: Double = js.native
    
    /**
      * Define the name of the layer.
      */
    var name: String = js.native
    
    /**
      * Define an offset for the layer in order to shift the texture.
      */
    var offset: Vector2 = js.native
    
    /**
      * An event triggered after rendering the scene
      */
    var onAfterRenderObservable: Observable[Layer] = js.native
    
    /**
      * Back compatibility with callback before the onAfterRenderObservable existed.
      * The set callback will be triggered just after rendering the layer.
      */
    def onAfterRender_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered before rendering the scene
      */
    var onBeforeRenderObservable: Observable[Layer] = js.native
    
    /**
      * Back compatibility with callback before the onBeforeRenderObservable existed.
      * The set callback will be triggered just before rendering the layer.
      */
    def onBeforeRender_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * An event triggered when the layer is disposed.
      */
    var onDisposeObservable: Observable[Layer] = js.native
    
    /**
      * Back compatibility with callback before the onDisposeObservable existed.
      * The set callback will be triggered when the layer has been disposed.
      */
    def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Renders the layer in the scene.
      */
    def render(): Unit = js.native
    
    /**
      * Define if the layer is only used in renderTarget or if it also
      * renders in the main frame buffer of the canvas.
      */
    var renderOnlyInRenderTargetTextures: Boolean = js.native
    
    /**
      * Define the list of render target the layer is visible into.
      */
    var renderTargetTextures: js.Array[RenderTargetTexture] = js.native
    
    /**
      * Define the scale of the layer in order to zoom in out of the texture.
      */
    var scale: Vector2 = js.native
    
    /**
      * Define the texture the layer should display.
      */
    var texture: Nullable[BaseTexture] = js.native
  }
}
