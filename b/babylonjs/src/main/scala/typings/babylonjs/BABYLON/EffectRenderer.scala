package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EffectRenderer")
@js.native
class EffectRenderer protected () extends js.Object {
  /**
    * Creates an effect renderer
    * @param engine the engine to use for rendering
    * @param options defines the options of the effect renderer
    */
  def this(engine: ThinEngine) = this()
  def this(engine: ThinEngine, options: IEffectRendererOptions) = this()
  var _fullscreenViewport: js.Any = js.native
  var _getNextFrameBuffer: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _ringBufferIndex: js.Any = js.native
  var _ringScreenBuffer: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  var engine: js.Any = js.native
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
  /**
    * renders one or more effects to a specified texture
    * @param effectWrappers list of effects to renderer
    * @param outputTexture texture to draw to, if null it will render to the screen
    */
  def render(effectWrappers: js.Array[EffectWrapper]): Unit = js.native
  def render(effectWrappers: js.Array[EffectWrapper], outputTexture: Nullable[Texture]): Unit = js.native
  def render(effectWrappers: EffectWrapper): Unit = js.native
  def render(effectWrappers: EffectWrapper, outputTexture: Nullable[Texture]): Unit = js.native
  /**
    * Sets the current viewport in normalized coordinates 0-1
    * @param viewport Defines the viewport to set (defaults to 0 0 1 1)
    */
  def setViewport(): Unit = js.native
  def setViewport(viewport: Viewport): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.EffectRenderer")
@js.native
object EffectRenderer extends js.Object {
  var _DefaultOptions: js.Any = js.native
}

