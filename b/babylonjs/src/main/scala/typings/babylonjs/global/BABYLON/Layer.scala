package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Layer")
@js.native
class Layer protected ()
  extends typings.babylonjs.BABYLON.Layer {
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
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    isBackground: Boolean
  ) = this()
  def this(
    /**
    * Define the name of the layer.
    */
  name: String,
    imgUrl: Nullable[String],
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    isBackground: Boolean,
    color: typings.babylonjs.BABYLON.Color4
  ) = this()
  /* CompleteClass */
  override var _createIndexBuffer: js.Any = js.native
  /* CompleteClass */
  override var _effect: js.Any = js.native
  /* CompleteClass */
  override var _indexBuffer: js.Any = js.native
  /* CompleteClass */
  override var _onAfterRenderObserver: js.Any = js.native
  /* CompleteClass */
  override var _onBeforeRenderObserver: js.Any = js.native
  /* CompleteClass */
  override var _onDisposeObserver: js.Any = js.native
  /* CompleteClass */
  override var _previousDefines: js.Any = js.native
  /* CompleteClass */
  override var _scene: js.Any = js.native
  /* CompleteClass */
  override var _vertexBuffers: js.Any = js.native
  /**
    * Define the alpha blending mode used in the layer in case the texture or color has an alpha.
    */
  /* CompleteClass */
  override var alphaBlendingMode: Double = js.native
  /**
    * Define if the layer should alpha test or alpha blend with the rest of the scene.
    * Alpha test will not mix with the background color in case of transparency.
    * It will either use the texture color or the background depending on the alpha value of the current pixel.
    */
  /* CompleteClass */
  override var alphaTest: Boolean = js.native
  /**
    * Define the color of the layer (instead of texture).
    */
  /* CompleteClass */
  override var color: typings.babylonjs.BABYLON.Color4 = js.native
  /**
    * Is the layer in background or foreground.
    */
  /* CompleteClass */
  override var isBackground: Boolean = js.native
  /**
    * Define a mask to restrict the layer to only some of the scene cameras.
    */
  /* CompleteClass */
  override var layerMask: Double = js.native
  /**
    * Define the name of the layer.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Define an offset for the layer in order to shift the texture.
    */
  /* CompleteClass */
  override var offset: typings.babylonjs.BABYLON.Vector2 = js.native
  /**
    * An event triggered after rendering the scene
    */
  /* CompleteClass */
  override var onAfterRenderObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Layer] = js.native
  /**
    * An event triggered before rendering the scene
    */
  /* CompleteClass */
  override var onBeforeRenderObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Layer] = js.native
  /**
    * An event triggered when the layer is disposed.
    */
  /* CompleteClass */
  override var onDisposeObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Layer] = js.native
  /**
    * Define if the layer is only used in renderTarget or if it also
    * renders in the main frame buffer of the canvas.
    */
  /* CompleteClass */
  override var renderOnlyInRenderTargetTextures: Boolean = js.native
  /**
    * Define the list of render target the layer is visible into.
    */
  /* CompleteClass */
  override var renderTargetTextures: js.Array[typings.babylonjs.BABYLON.RenderTargetTexture] = js.native
  /**
    * Define the scale of the layer in order to zoom in out of the texture.
    */
  /* CompleteClass */
  override var scale: typings.babylonjs.BABYLON.Vector2 = js.native
  /**
    * Define the texture the layer should display.
    */
  /* CompleteClass */
  override var texture: Nullable[typings.babylonjs.BABYLON.Texture] = js.native
  /** @hidden */
  /* CompleteClass */
  override def _rebuild(): Unit = js.native
  /**
    * Disposes and releases the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Back compatibility with callback before the onAfterRenderObservable existed.
    * The set callback will be triggered just after rendering the layer.
    */
  /* CompleteClass */
  override def onAfterRender(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Back compatibility with callback before the onBeforeRenderObservable existed.
    * The set callback will be triggered just before rendering the layer.
    */
  /* CompleteClass */
  override def onBeforeRender(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Back compatibility with callback before the onDisposeObservable existed.
    * The set callback will be triggered when the layer has been disposed.
    */
  /* CompleteClass */
  override def onDispose(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Renders the layer in the scene.
    */
  /* CompleteClass */
  override def render(): Unit = js.native
}

