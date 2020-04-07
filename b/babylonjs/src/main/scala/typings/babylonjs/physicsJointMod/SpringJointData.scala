package typings.babylonjs.physicsJointMod

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringJointData extends PhysicsJointData {
  /**
    * Damping of the spring
    */
  var damping: Double
  /**
    * Length of the spring
    */
  var length: Double
  /**
    * Stiffness of the spring
    */
  var stiffness: Double
  /** this callback will be called when applying the force to the impostors. */
  def forceApplicationCallback(): Unit
}

object SpringJointData {
  @scala.inline
  def apply(
    damping: Double,
    forceApplicationCallback: () => Unit,
    length: Double,
    stiffness: Double,
    collision: js.UndefOr[Boolean] = js.undefined,
    connectedAxis: Vector3 = null,
    connectedPivot: Vector3 = null,
    mainAxis: Vector3 = null,
    mainPivot: Vector3 = null,
    nativeParams: js.Any = null
  ): SpringJointData = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], forceApplicationCallback = js.Any.fromFunction0(forceApplicationCallback), length = length.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    if (!js.isUndefined(collision)) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (connectedAxis != null) __obj.updateDynamic("connectedAxis")(connectedAxis.asInstanceOf[js.Any])
    if (connectedPivot != null) __obj.updateDynamic("connectedPivot")(connectedPivot.asInstanceOf[js.Any])
    if (mainAxis != null) __obj.updateDynamic("mainAxis")(mainAxis.asInstanceOf[js.Any])
    if (mainPivot != null) __obj.updateDynamic("mainPivot")(mainPivot.asInstanceOf[js.Any])
    if (nativeParams != null) __obj.updateDynamic("nativeParams")(nativeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringJointData]
  }
}

