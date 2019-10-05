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
    angularDamping: Int | Double = null,
    angularVelocity: Vec3 = null,
    collisionFilterGroup: Int | Double = null,
    collisionFilterMask: Int | Double = null,
    fixedRotation: js.UndefOr[Boolean] = js.undefined,
    linearDamping: Int | Double = null,
    mass: Int | Double = null,
    material: Material = null,
    position: Vec3 = null,
    quaternion: Quaternion = null,
    shape: Shape = null,
    sleepSpeedLimit: Int | Double = null,
    sleepTimeLimit: Int | Double = null,
    `type`: Int | Double = null,
    velocity: Vec3 = null
  ): IBodyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSleep)) __obj.updateDynamic("allowSleep")(allowSleep)
    if (angularDamping != null) __obj.updateDynamic("angularDamping")(angularDamping.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity)
    if (collisionFilterGroup != null) __obj.updateDynamic("collisionFilterGroup")(collisionFilterGroup.asInstanceOf[js.Any])
    if (collisionFilterMask != null) __obj.updateDynamic("collisionFilterMask")(collisionFilterMask.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedRotation)) __obj.updateDynamic("fixedRotation")(fixedRotation)
    if (linearDamping != null) __obj.updateDynamic("linearDamping")(linearDamping.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    if (position != null) __obj.updateDynamic("position")(position)
    if (quaternion != null) __obj.updateDynamic("quaternion")(quaternion)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (sleepSpeedLimit != null) __obj.updateDynamic("sleepSpeedLimit")(sleepSpeedLimit.asInstanceOf[js.Any])
    if (sleepTimeLimit != null) __obj.updateDynamic("sleepTimeLimit")(sleepTimeLimit.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    __obj.asInstanceOf[IBodyOptions]
  }
}

