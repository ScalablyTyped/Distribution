package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Joint data for a Distance-Joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait DistanceJointData extends PhysicsJointData {
  /**
    * Max distance the 2 joint objects can be apart
    */
  var maxDistance: scala.Double
}

object DistanceJointData {
  @scala.inline
  def apply(
    maxDistance: scala.Double,
    collision: js.UndefOr[scala.Boolean] = js.undefined,
    connectedAxis: Vector3 = null,
    connectedPivot: Vector3 = null,
    mainAxis: Vector3 = null,
    mainPivot: Vector3 = null,
    nativeParams: js.Any = null
  ): DistanceJointData = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance)
    if (!js.isUndefined(collision)) __obj.updateDynamic("collision")(collision)
    if (connectedAxis != null) __obj.updateDynamic("connectedAxis")(connectedAxis)
    if (connectedPivot != null) __obj.updateDynamic("connectedPivot")(connectedPivot)
    if (mainAxis != null) __obj.updateDynamic("mainAxis")(mainAxis)
    if (mainPivot != null) __obj.updateDynamic("mainPivot")(mainPivot)
    if (nativeParams != null) __obj.updateDynamic("nativeParams")(nativeParams)
    __obj.asInstanceOf[DistanceJointData]
  }
}

