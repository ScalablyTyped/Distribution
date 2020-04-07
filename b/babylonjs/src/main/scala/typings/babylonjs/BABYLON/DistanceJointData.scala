package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceJointData extends PhysicsJointData {
  /**
    * Max distance the 2 joint objects can be apart
    */
  var maxDistance: Double
}

object DistanceJointData {
  @scala.inline
  def apply(
    maxDistance: Double,
    collision: js.UndefOr[Boolean] = js.undefined,
    connectedAxis: Vector3 = null,
    connectedPivot: Vector3 = null,
    mainAxis: Vector3 = null,
    mainPivot: Vector3 = null,
    nativeParams: js.Any = null
  ): DistanceJointData = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(collision)) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (connectedAxis != null) __obj.updateDynamic("connectedAxis")(connectedAxis.asInstanceOf[js.Any])
    if (connectedPivot != null) __obj.updateDynamic("connectedPivot")(connectedPivot.asInstanceOf[js.Any])
    if (mainAxis != null) __obj.updateDynamic("mainAxis")(mainAxis.asInstanceOf[js.Any])
    if (mainPivot != null) __obj.updateDynamic("mainPivot")(mainPivot.asInstanceOf[js.Any])
    if (nativeParams != null) __obj.updateDynamic("nativeParams")(nativeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceJointData]
  }
}

