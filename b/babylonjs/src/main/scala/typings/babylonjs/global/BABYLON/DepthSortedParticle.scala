package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DepthSortedParticle")
@js.native
class DepthSortedParticle protected ()
  extends typings.babylonjs.BABYLON.DepthSortedParticle {
  /**
    * Creates a new sorted particle
    * @param materialIndex
    */
  def this(ind: Double, indLength: Double, materialIndex: Double) = this()
  /**
    * Index of the particle in the "indices" array
    */
  /* CompleteClass */
  override var ind: Double = js.native
  /**
    * Length of the particle shape in the "indices" array
    */
  /* CompleteClass */
  override var indicesLength: Double = js.native
  /**
    * Material index when used with MultiMaterials
    */
  /* CompleteClass */
  override var materialIndex: Double = js.native
  /**
    * Squared distance from the particle to the camera
    */
  /* CompleteClass */
  override var sqDistance: Double = js.native
}

