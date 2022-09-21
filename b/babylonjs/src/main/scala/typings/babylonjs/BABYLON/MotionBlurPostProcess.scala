package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionBlurPostProcess
  extends StObject
     with PostProcess {
  
  /**
    * Called on the mode changed (object based or screen based).
    */
  /* private */ var _applyMode: Any = js.native
  
  /* private */ var _forceGeometryBuffer: Any = js.native
  
  /* private */ def _geometryBufferRenderer: Any = js.native
  
  /* private */ var _invViewProjection: Any = js.native
  
  /* private */ var _isObjectBased: Any = js.native
  
  /* private */ var _motionBlurSamples: Any = js.native
  
  /**
    * Called on the effect is applied when the motion blur post-process is in object based mode.
    * @param effect
    */
  /* private */ var _onApplyObjectBased: Any = js.native
  
  /**
    * Called on the effect is applied when the motion blur post-process is in screen based mode.
    * @param effect
    */
  /* private */ var _onApplyScreenBased: Any = js.native
  
  /* private */ def _prePassRenderer: Any = js.native
  
  /* private */ var _previousViewProjection: Any = js.native
  
  /**
    * Called on the effect must be updated (changed mode, samples count, etc.).
    */
  /* private */ var _updateEffect: Any = js.native
  
  /**
    * Excludes the given skinned mesh from computing bones velocities.
    * Computing bones velocities can have a cost and that cost. The cost can be saved by calling this function and by passing the skinned mesh reference to ignore.
    * @param skinnedMesh The mesh containing the skeleton to ignore when computing the velocity map.
    */
  def excludeSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
  
  /**
    * Gets whether or not the motion blur post-process is in object based mode.
    */
  def isObjectBased: Boolean = js.native
  /**
    * Sets whether or not the motion blur post-process is in object based mode.
    */
  def isObjectBased_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the number of iterations are used for motion blur quality. Default value is equal to 32
    */
  def motionBlurSamples: Double = js.native
  /**
    * Sets the number of iterations to be used for motion blur quality
    */
  def motionBlurSamples_=(samples: Double): Unit = js.native
  
  /**
    * Defines how much the image is blurred by the movement. Default value is equal to 1
    */
  var motionStrength: Double = js.native
  
  /**
    * Removes the given skinned mesh from the excluded meshes to integrate bones velocities while rendering the velocity map.
    * @param skinnedMesh The mesh containing the skeleton that has been ignored previously.
    * @see excludeSkinnedMesh to exclude a skinned mesh from bones velocity computation.
    */
  def removeExcludedSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
}
