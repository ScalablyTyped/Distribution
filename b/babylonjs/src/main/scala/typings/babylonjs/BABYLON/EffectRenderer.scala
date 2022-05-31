package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectRenderer extends StObject {
  
  /* private */ var _fullscreenViewport: js.Any = js.native
  
  /* private */ var _indexBuffer: js.Any = js.native
  
  /* private */ var _vertexBuffers: js.Any = js.native
  
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
  
  /* private */ var engine: js.Any = js.native
  
  /* private */ var isRenderTargetTexture: js.Any = js.native
  
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
