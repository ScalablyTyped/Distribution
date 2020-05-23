package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepthSortedParticle extends js.Object {
  /**
    * Index of the particle in the "indices" array
    */
  var ind: Double
  /**
    * Length of the particle shape in the "indices" array
    */
  var indicesLength: Double
  /**
    * Material index when used with MultiMaterials
    */
  var materialIndex: Double
  /**
    * Squared distance from the particle to the camera
    */
  var sqDistance: Double
}

object DepthSortedParticle {
  @scala.inline
  def apply(ind: Double, indicesLength: Double, materialIndex: Double, sqDistance: Double): DepthSortedParticle = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthSortedParticle]
  }
}

