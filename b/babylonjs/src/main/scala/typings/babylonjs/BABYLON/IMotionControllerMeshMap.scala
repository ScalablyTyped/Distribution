package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMotionControllerMeshMap extends js.Object {
  /**
    * the mesh that defines the maximum value mesh position.
    */
  var maxMesh: js.UndefOr[AbstractMesh] = js.undefined
  /**
    * the mesh that defines the minimum value mesh position.
    */
  var minMesh: js.UndefOr[AbstractMesh] = js.undefined
  /**
    * The mesh that will be changed when axis value changes
    */
  var valueMesh: AbstractMesh
}

object IMotionControllerMeshMap {
  @scala.inline
  def apply(valueMesh: AbstractMesh, maxMesh: AbstractMesh = null, minMesh: AbstractMesh = null): IMotionControllerMeshMap = {
    val __obj = js.Dynamic.literal(valueMesh = valueMesh.asInstanceOf[js.Any])
    if (maxMesh != null) __obj.updateDynamic("maxMesh")(maxMesh.asInstanceOf[js.Any])
    if (minMesh != null) __obj.updateDynamic("minMesh")(minMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerMeshMap]
  }
}

