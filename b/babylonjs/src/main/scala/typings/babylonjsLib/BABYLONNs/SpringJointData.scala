package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Joint data from a spring joint
  * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
  */
trait SpringJointData extends PhysicsJointData {
  /**
    * Damping of the spring
    */
  var damping: scala.Double
  /**
    * Length of the spring
    */
  var length: scala.Double
  /**
    * Stiffness of the spring
    */
  var stiffness: scala.Double
  /** this callback will be called when applying the force to the impostors. */
  def forceApplicationCallback(): scala.Unit
}

object SpringJointData {
  @scala.inline
  def apply(
    damping: scala.Double,
    forceApplicationCallback: js.Function0[scala.Unit],
    length: scala.Double,
    stiffness: scala.Double,
    collision: js.UndefOr[scala.Boolean] = js.undefined,
    connectedAxis: Vector3 = null,
    connectedPivot: Vector3 = null,
    mainAxis: Vector3 = null,
    mainPivot: Vector3 = null,
    nativeParams: js.Any = null
  ): SpringJointData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("damping")(damping)
    __obj.updateDynamic("forceApplicationCallback")(forceApplicationCallback)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("stiffness")(stiffness)
    if (!js.isUndefined(collision)) __obj.updateDynamic("collision")(collision)
    if (connectedAxis != null) __obj.updateDynamic("connectedAxis")(connectedAxis)
    if (connectedPivot != null) __obj.updateDynamic("connectedPivot")(connectedPivot)
    if (mainAxis != null) __obj.updateDynamic("mainAxis")(mainAxis)
    if (mainPivot != null) __obj.updateDynamic("mainPivot")(mainPivot)
    if (nativeParams != null) __obj.updateDynamic("nativeParams")(nativeParams)
    __obj.asInstanceOf[SpringJointData]
  }
}

