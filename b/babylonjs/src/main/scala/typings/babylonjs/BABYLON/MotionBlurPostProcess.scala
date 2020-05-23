package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionBlurPostProcess extends PostProcess {
  var _geometryBufferRenderer: js.Any = js.native
  var _motionBlurSamples: js.Any = js.native
  /**
    * Defines how much the image is blurred by the movement. Default value is equal to 1
    */
  var motionStrength: Double = js.native
  /**
    * Excludes the given skinned mesh from computing bones velocities.
    * Computing bones velocities can have a cost and that cost. The cost can be saved by calling this function and by passing the skinned mesh reference to ignore.
    * @param skinnedMesh The mesh containing the skeleton to ignore when computing the velocity map.
    */
  def excludeSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
  /**
    * Gets the number of iterations are used for motion blur quality. Default value is equal to 32
    */
  def motionBlurSamples: Double = js.native
  /**
    * Sets the number of iterations to be used for motion blur quality
    */
  def motionBlurSamples(samples: Double): js.Any = js.native
  /**
    * Removes the given skinned mesh from the excluded meshes to integrate bones velocities while rendering the velocity map.
    * @param skinnedMesh The mesh containing the skeleton that has been ignored previously.
    * @see excludeSkinnedMesh to exclude a skinned mesh from bones velocity computation.
    */
  def removeExcludedSkinnedMesh(skinnedMesh: AbstractMesh): Unit = js.native
}

