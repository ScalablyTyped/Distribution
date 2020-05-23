package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  var _createIndexBuffer: js.Any
  var _effect: js.Any
  var _indexBuffer: js.Any
  var _onAfterRenderObserver: js.Any
  var _onBeforeRenderObserver: js.Any
  var _onDisposeObserver: js.Any
  var _previousDefines: js.Any
  var _scene: js.Any
  var _vertexBuffers: js.Any
  /**
    * Define the alpha blending mode used in the layer in case the texture or color has an alpha.
    */
  var alphaBlendingMode: Double
  /**
    * Define if the layer should alpha test or alpha blend with the rest of the scene.
    * Alpha test will not mix with the background color in case of transparency.
    * It will either use the texture color or the background depending on the alpha value of the current pixel.
    */
  var alphaTest: Boolean
  /**
    * Define the color of the layer (instead of texture).
    */
  var color: Color4
  /**
    * Is the layer in background or foreground.
    */
  var isBackground: Boolean
  /**
    * Define a mask to restrict the layer to only some of the scene cameras.
    */
  var layerMask: Double
  /**
    * Define the name of the layer.
    */
  var name: String
  /**
    * Define an offset for the layer in order to shift the texture.
    */
  var offset: Vector2
  /**
    * An event triggered after rendering the scene
    */
  var onAfterRenderObservable: Observable[Layer]
  /**
    * An event triggered before rendering the scene
    */
  var onBeforeRenderObservable: Observable[Layer]
  /**
    * An event triggered when the layer is disposed.
    */
  var onDisposeObservable: Observable[Layer]
  /**
    * Define if the layer is only used in renderTarget or if it also
    * renders in the main frame buffer of the canvas.
    */
  var renderOnlyInRenderTargetTextures: Boolean
  /**
    * Define the list of render target the layer is visible into.
    */
  var renderTargetTextures: js.Array[RenderTargetTexture]
  /**
    * Define the scale of the layer in order to zoom in out of the texture.
    */
  var scale: Vector2
  /**
    * Define the texture the layer should display.
    */
  var texture: Nullable[Texture]
  /** @hidden */
  def _rebuild(): Unit
  /**
    * Disposes and releases the associated ressources.
    */
  def dispose(): Unit
  /**
    * Back compatibility with callback before the onAfterRenderObservable existed.
    * The set callback will be triggered just after rendering the layer.
    */
  def onAfterRender(callback: js.Function0[Unit]): js.Any
  /**
    * Back compatibility with callback before the onBeforeRenderObservable existed.
    * The set callback will be triggered just before rendering the layer.
    */
  def onBeforeRender(callback: js.Function0[Unit]): js.Any
  /**
    * Back compatibility with callback before the onDisposeObservable existed.
    * The set callback will be triggered when the layer has been disposed.
    */
  def onDispose(callback: js.Function0[Unit]): js.Any
  /**
    * Renders the layer in the scene.
    */
  def render(): Unit
}

object Layer {
  @scala.inline
  def apply(
    _createIndexBuffer: js.Any,
    _effect: js.Any,
    _indexBuffer: js.Any,
    _onAfterRenderObserver: js.Any,
    _onBeforeRenderObserver: js.Any,
    _onDisposeObserver: js.Any,
    _previousDefines: js.Any,
    _rebuild: () => Unit,
    _scene: js.Any,
    _vertexBuffers: js.Any,
    alphaBlendingMode: Double,
    alphaTest: Boolean,
    color: Color4,
    dispose: () => Unit,
    isBackground: Boolean,
    layerMask: Double,
    name: String,
    offset: Vector2,
    onAfterRender: js.Function0[Unit] => js.Any,
    onAfterRenderObservable: Observable[Layer],
    onBeforeRender: js.Function0[Unit] => js.Any,
    onBeforeRenderObservable: Observable[Layer],
    onDispose: js.Function0[Unit] => js.Any,
    onDisposeObservable: Observable[Layer],
    render: () => Unit,
    renderOnlyInRenderTargetTextures: Boolean,
    renderTargetTextures: js.Array[RenderTargetTexture],
    scale: Vector2,
    texture: Nullable[Texture] = null
  ): Layer = {
    val __obj = js.Dynamic.literal(_createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _effect = _effect.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _onAfterRenderObserver = _onAfterRenderObserver.asInstanceOf[js.Any], _onBeforeRenderObserver = _onBeforeRenderObserver.asInstanceOf[js.Any], _onDisposeObserver = _onDisposeObserver.asInstanceOf[js.Any], _previousDefines = _previousDefines.asInstanceOf[js.Any], _rebuild = js.Any.fromFunction0(_rebuild), _scene = _scene.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], alphaTest = alphaTest.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isBackground = isBackground.asInstanceOf[js.Any], layerMask = layerMask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction1(onAfterRender), onAfterRenderObservable = onAfterRenderObservable.asInstanceOf[js.Any], onBeforeRender = js.Any.fromFunction1(onBeforeRender), onBeforeRenderObservable = onBeforeRenderObservable.asInstanceOf[js.Any], onDispose = js.Any.fromFunction1(onDispose), onDisposeObservable = onDisposeObservable.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), renderOnlyInRenderTargetTextures = renderOnlyInRenderTargetTextures.asInstanceOf[js.Any], renderTargetTextures = renderTargetTextures.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

