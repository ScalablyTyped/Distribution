package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMotionControllerButtonMeshMap extends js.Object {
  /**
    * the mesh that defines the pressed value mesh position.
    * This is used to find the max-position of this button
    */
  var pressedMesh: AbstractMesh
  /**
    * the mesh that defines the unpressed value mesh position.
    * This is used to find the min (or initial) position of this button
    */
  var unpressedMesh: AbstractMesh
  /**
    * The mesh that will be changed when value changes
    */
  var valueMesh: AbstractMesh
}

object IMotionControllerButtonMeshMap {
  @scala.inline
  def apply(pressedMesh: AbstractMesh, unpressedMesh: AbstractMesh, valueMesh: AbstractMesh): IMotionControllerButtonMeshMap = {
    val __obj = js.Dynamic.literal(pressedMesh = pressedMesh.asInstanceOf[js.Any], unpressedMesh = unpressedMesh.asInstanceOf[js.Any], valueMesh = valueMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerButtonMeshMap]
  }
}

