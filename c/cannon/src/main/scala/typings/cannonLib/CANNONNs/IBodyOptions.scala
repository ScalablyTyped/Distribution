package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyOptions extends js.Object {
  var allowSleep: js.UndefOr[scala.Boolean] = js.undefined
  var angularDamping: js.UndefOr[scala.Double] = js.undefined
  var angularVelocity: js.UndefOr[Vec3] = js.undefined
  var collisionFilterGroup: js.UndefOr[scala.Double] = js.undefined
  var collisionFilterMask: js.UndefOr[scala.Double] = js.undefined
  var fixedRotation: js.UndefOr[scala.Boolean] = js.undefined
  var linearDamping: js.UndefOr[scala.Double] = js.undefined
  var mass: js.UndefOr[scala.Double] = js.undefined
  var material: js.UndefOr[Material] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var quaternion: js.UndefOr[Quaternion] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
  var sleepSpeedLimit: js.UndefOr[scala.Double] = js.undefined
  var sleepTimeLimit: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[scala.Double] = js.undefined
  var velocity: js.UndefOr[Vec3] = js.undefined
}

object IBodyOptions {
  @scala.inline
  def apply(
    allowSleep: js.UndefOr[scala.Boolean] = js.undefined,
    angularDamping: scala.Int | scala.Double = null,
    angularVelocity: Vec3 = null,
    collisionFilterGroup: scala.Int | scala.Double = null,
    collisionFilterMask: scala.Int | scala.Double = null,
    fixedRotation: js.UndefOr[scala.Boolean] = js.undefined,
    linearDamping: scala.Int | scala.Double = null,
    mass: scala.Int | scala.Double = null,
    material: Material = null,
    position: Vec3 = null,
    quaternion: Quaternion = null,
    shape: Shape = null,
    sleepSpeedLimit: scala.Int | scala.Double = null,
    sleepTimeLimit: scala.Int | scala.Double = null,
    `type`: scala.Int | scala.Double = null,
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

