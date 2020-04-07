package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DepthSortedParticle")
@js.native
class DepthSortedParticle protected () extends js.Object {
  /**
    * Creates a new sorted particle
    * @param materialIndex
    */
  def this(ind: Double, indLength: Double, materialIndex: Double) = this()
  /**
    * Index of the particle in the "indices" array
    */
  var ind: Double = js.native
  /**
    * Length of the particle shape in the "indices" array
    */
  var indicesLength: Double = js.native
  /**
    * Material index when used with MultiMaterials
    */
  var materialIndex: Double = js.native
  /**
    * Squared distance from the particle to the camera
    */
  var sqDistance: Double = js.native
}

