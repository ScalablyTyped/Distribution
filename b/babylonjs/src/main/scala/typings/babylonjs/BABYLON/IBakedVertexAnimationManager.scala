package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBakedVertexAnimationManager extends StObject {
  
  /**
    * The animation parameters for the mesh. See setAnimationParameters()
    */
  var animationParameters: Vector4 = js.native
  
  /**
    * Binds to the effect.
    * @param effect The effect to bind to.
    * @param useInstances True when it's an instance.
    */
  def bind(effect: Effect, useInstances: Boolean): Unit = js.native
  
  /**
    * Disposes the resources of the manager.
    * @param forceDisposeTextures - Forces the disposal of all textures.
    */
  def dispose(): Unit = js.native
  def dispose(forceDisposeTextures: Boolean): Unit = js.native
  
  /**
    * Get the current class name useful for serialization or dynamic coding.
    * @returns "BakedVertexAnimationManager"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Sets animation parameters.
    * @param startFrame The first frame of the animation.
    * @param endFrame The last frame of the animation.
    * @param offset The offset when starting the animation.
    * @param speedFramesPerSecond The frame rate.
    */
  def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Double, speedFramesPerSecond: Double): Unit = js.native
  
  /**
    * The vertex animation texture
    */
  var texture: Nullable[BaseTexture] = js.native
  
  /**
    * The time counter, to pick the correct animation frame.
    */
  var time: Double = js.native
}
