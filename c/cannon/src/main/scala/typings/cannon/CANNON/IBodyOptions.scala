package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyOptions extends js.Object {
  var allowSleep: js.UndefOr[Boolean] = js.undefined
  var angularDamping: js.UndefOr[Double] = js.undefined
  var angularVelocity: js.UndefOr[Vec3] = js.undefined
  var collisionFilterGroup: js.UndefOr[Double] = js.undefined
  var collisionFilterMask: js.UndefOr[Double] = js.undefined
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  var linearDamping: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var quaternion: js.UndefOr[Quaternion] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
  var sleepSpeedLimit: js.UndefOr[Double] = js.undefined
  var sleepTimeLimit: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Double] = js.undefined
  var velocity: js.UndefOr[Vec3] = js.undefined
}

object IBodyOptions {
  @scala.inline
  def apply(
    allowSleep: js.UndefOr[Boolean] = js.undefined,
    angularDamping: js.UndefOr[Double] = js.undefined,
    angularVelocity: Vec3 = null,
    collisionFilterGroup: js.UndefOr[Double] = js.undefined,
    collisionFilterMask: js.UndefOr[Double] = js.undefined,
    fixedRotation: js.UndefOr[Boolean] = js.undefined,
    linearDamping: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    material: Material = null,
    position: Vec3 = null,
    quaternion: Quaternion = null,
    shape: Shape = null,
    sleepSpeedLimit: js.UndefOr[Double] = js.undefined,
    sleepTimeLimit: js.UndefOr[Double] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined,
    velocity: Vec3 = null
  ): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSleep)) __obj.updateDynamic("allowSleep")(allowSleep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angularDamping)) __obj.updateDynamic("angularDamping")(angularDamping.get.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionFilterGroup)) __obj.updateDynamic("collisionFilterGroup")(collisionFilterGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collisionFilterMask)) __obj.updateDynamic("collisionFilterMask")(collisionFilterMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linearDamping)) __obj.updateDynamic("linearDamping")(linearDamping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (quaternion != null) __obj.updateDynamic("quaternion")(quaternion.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepSpeedLimit)) __obj.updateDynamic("sleepSpeedLimit")(sleepSpeedLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sleepTimeLimit)) __obj.updateDynamic("sleepTimeLimit")(sleepTimeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyOptions]
  }
}

