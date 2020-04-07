package typings.babylonjs.physicsJointMod

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsJointData extends js.Object {
  /**
    * The collision of the joint
    */
  var collision: js.UndefOr[Boolean] = js.undefined
  /**
    * The connected axis of the joint
    */
  var connectedAxis: js.UndefOr[Vector3] = js.undefined
  /**
    * The connected pivot of the joint
    */
  var connectedPivot: js.UndefOr[Vector3] = js.undefined
  /**
    * The main axis of the joint
    */
  var mainAxis: js.UndefOr[Vector3] = js.undefined
  /**
    * The main pivot of the joint
    */
  var mainPivot: js.UndefOr[Vector3] = js.undefined
  /**
    * Native Oimo/Cannon/Energy data
    */
  var nativeParams: js.UndefOr[js.Any] = js.undefined
}

object PhysicsJointData {
  @scala.inline
  def apply(
    collision: js.UndefOr[Boolean] = js.undefined,
    connectedAxis: Vector3 = null,
    connectedPivot: Vector3 = null,
    mainAxis: Vector3 = null,
    mainPivot: Vector3 = null,
    nativeParams: js.Any = null
  ): PhysicsJointData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collision)) __obj.updateDynamic("collision")(collision.asInstanceOf[js.Any])
    if (connectedAxis != null) __obj.updateDynamic("connectedAxis")(connectedAxis.asInstanceOf[js.Any])
    if (connectedPivot != null) __obj.updateDynamic("connectedPivot")(connectedPivot.asInstanceOf[js.Any])
    if (mainAxis != null) __obj.updateDynamic("mainAxis")(mainAxis.asInstanceOf[js.Any])
    if (mainPivot != null) __obj.updateDynamic("mainPivot")(mainPivot.asInstanceOf[js.Any])
    if (nativeParams != null) __obj.updateDynamic("nativeParams")(nativeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsJointData]
  }
}

