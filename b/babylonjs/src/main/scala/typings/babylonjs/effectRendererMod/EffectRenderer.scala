package typings.babylonjs.effectRendererMod

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathViewportMod.Viewport
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/effectRenderer", "EffectRenderer")
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
@JSImport("babylonjs/Materials/effectRenderer", "EffectRenderer")
@js.native
object EffectRenderer extends js.Object {
  
  var _DefaultOptions: js.Any = js.native
}
