package typings.babylonjs.vrExperienceHelperMod

import typings.babylonjs.easingMod.EasingFunction
import typings.babylonjs.meshMod.Mesh
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
    teleportationMode: js.UndefOr[Double] = js.undefined,
    teleportationSpeed: js.UndefOr[Double] = js.undefined,
    teleportationTime: js.UndefOr[Double] = js.undefined
  ): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    if (easingFunction != null) __obj.updateDynamic("easingFunction")(easingFunction.asInstanceOf[js.Any])
    if (floorMeshName != null) __obj.updateDynamic("floorMeshName")(floorMeshName.asInstanceOf[js.Any])
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes.asInstanceOf[js.Any])
    if (!js.isUndefined(teleportationMode)) __obj.updateDynamic("teleportationMode")(teleportationMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(teleportationSpeed)) __obj.updateDynamic("teleportationSpeed")(teleportationSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(teleportationTime)) __obj.updateDynamic("teleportationTime")(teleportationTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRTeleportationOptions]
  }
}

