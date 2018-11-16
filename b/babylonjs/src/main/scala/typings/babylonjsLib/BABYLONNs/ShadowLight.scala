package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Base implementation IShadowLight
     * It groups all the common behaviour in order to reduce dupplication and better follow the DRY pattern.
     */
@JSGlobal("BABYLON.ShadowLight")
@js.native
abstract class ShadowLight () extends IShadowLight {
  var _direction: Vector3 = js.native
  var _needProjectionMatrixCompute: js.Any = js.native
  var _position: Vector3 = js.native
  var _shadowMaxZ: js.Any = js.native
  var _shadowMinZ: js.Any = js.native
  /* protected */ def _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): scala.Unit = js.native
  /* protected */ def _setDirection(value: Vector3): scala.Unit = js.native
  /* protected */ def _setPosition(value: Vector3): scala.Unit = js.native
  /**
           * Returns the light rotation in euler definition.
           * @returns the x y z rotation in local space.
           */
  def getRotation(): Vector3 = js.native
  /**
           * Sets the ShadowLight direction toward the passed target.
           * @param target The point tot target in local space
           * @returns the updated ShadowLight direction
           */
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
}

