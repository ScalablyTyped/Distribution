package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ShadowLight")
@js.native
abstract class ShadowLight () extends IShadowLight {
  var _direction: Vector3 = js.native
  var _needProjectionMatrixCompute: js.Any = js.native
  var _position: Vector3 = js.native
  var _shadowMaxZ: Double = js.native
  var _shadowMinZ: Double = js.native
  /* protected */ def _setDefaultShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
  /* protected */ def _setDirection(value: Vector3): Unit = js.native
  /* protected */ def _setPosition(value: Vector3): Unit = js.native
  /**
    * In 2d mode (needCube being false), gets the direction used to cast the shadow.
    * Also use as the light direction on spot and directional lights.
    */
  @JSName("direction")
  def direction_MShadowLight(): Vector3 = js.native
  /**
    * In 2d mode (needCube being false), sets the direction used to cast the shadow.
    * Also use as the light direction on spot and directional lights.
    */
  @JSName("direction")
  def direction_MShadowLight(value: Vector3): js.Any = js.native
  /**
    * Returns the light rotation in euler definition.
    * @returns the x y z rotation in local space.
    */
  def getRotation(): Vector3 = js.native
  /**
    * Sets the position the shadow will be casted from. Also use as the light position for both
    * point and spot lights.
    */
  @JSName("position")
  def position_MShadowLight(): Vector3 = js.native
  /**
    * Sets the position the shadow will be casted from. Also use as the light position for both
    * point and spot lights.
    */
  @JSName("position")
  def position_MShadowLight(value: Vector3): js.Any = js.native
  /**
    * Sets the ShadowLight direction toward the passed target.
    * @param target The point to target in local space
    * @returns the updated ShadowLight direction
    */
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
  /**
    * Sets the shadow projection clipping maximum z value.
    */
  @JSName("shadowMaxZ")
  def shadowMaxZ_MShadowLight(): Double = js.native
  /**
    * Gets the shadow projection clipping maximum z value.
    */
  @JSName("shadowMaxZ")
  def shadowMaxZ_MShadowLight(value: Double): js.Any = js.native
  /**
    * Gets the shadow projection clipping minimum z value.
    */
  @JSName("shadowMinZ")
  def shadowMinZ_MShadowLight(): Double = js.native
  /**
    * Sets the shadow projection clipping minimum z value.
    */
  @JSName("shadowMinZ")
  def shadowMinZ_MShadowLight(value: Double): js.Any = js.native
}

