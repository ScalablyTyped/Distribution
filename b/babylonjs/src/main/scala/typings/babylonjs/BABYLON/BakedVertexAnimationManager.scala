package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BakedVertexAnimationManager
  extends StObject
     with IBakedVertexAnimationManager {
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @internal */
  def _markSubMeshesAsAttributesDirty(): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _texture: Any = js.native
  
  /**
    * Binds to the effect.
    * @param effect The effect to bind to.
    * @param useInstances True when it's an instance.
    */
  def bind(effect: Effect): Unit = js.native
  
  /**
    * Makes a duplicate of the current instance into another one.
    * @param vatMap define the instance where to copy the info
    */
  def copyTo(vatMap: BakedVertexAnimationManager): Unit = js.native
  
  /**
    * Parses a vertex animation setting from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Serializes this vertex animation instance
    * @returns - An object with the serialized instance.
    */
  def serialize(): Any = js.native
  
  /**
    * Sets animation parameters.
    * @param startFrame The first frame of the animation.
    * @param endFrame The last frame of the animation.
    * @param offset The offset when starting the animation.
    * @param speedFramesPerSecond The frame rate.
    */
  def setAnimationParameters(startFrame: Double, endFrame: Double): Unit = js.native
  def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Double): Unit = js.native
  def setAnimationParameters(startFrame: Double, endFrame: Double, offset: Unit, speedFramesPerSecond: Double): Unit = js.native
}
