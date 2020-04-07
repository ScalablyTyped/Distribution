package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRTeleportationOptions extends js.Object {
  /**
    * The easing function used in the animation or null for Linear. (default CircleEase)
    */
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  /**
    * The name of the mesh which should be used as the teleportation floor. (default: null)
    */
  var floorMeshName: js.UndefOr[String] = js.undefined
  /**
    * A list of meshes to be used as the teleportation floor. (default: empty)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  /**
    * The teleportation mode. (default: TELEPORTATIONMODE_CONSTANTTIME)
    */
  var teleportationMode: js.UndefOr[Double] = js.undefined
  /**
    * The speed of the animation in distance/sec, apply when animationMode is TELEPORTATIONMODE_CONSTANTSPEED. (default 20 units / sec)
    */
  var teleportationSpeed: js.UndefOr[Double] = js.undefined
  /**
    * The duration of the animation in ms, apply when animationMode is TELEPORTATIONMODE_CONSTANTTIME. (default 122ms)
    */
  var teleportationTime: js.UndefOr[Double] = js.undefined
}

object VRTeleportationOptions {
  @scala.inline
  def apply(
    easingFunction: EasingFunction = null,
    floorMeshName: String = null,
    floorMeshes: js.Array[Mesh] = null,
    teleportationMode: Int | Double = null,
    teleportationSpeed: Int | Double = null,
    teleportationTime: Int | Double = null
  ): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (floorMeshName != null) __obj.updateDynamic("floorMeshName")(floorMeshName.asInstanceOf[js.Any])
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes.asInstanceOf[js.Any])
    if (teleportationMode != null) __obj.updateDynamic("teleportationMode")(teleportationMode.asInstanceOf[js.Any])
    if (teleportationSpeed != null) __obj.updateDynamic("teleportationSpeed")(teleportationSpeed.asInstanceOf[js.Any])
    if (teleportationTime != null) __obj.updateDynamic("teleportationTime")(teleportationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRTeleportationOptions]
  }
}

