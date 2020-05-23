package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.VRExperienceHelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VRExperienceHelper")
@js.native
class VRExperienceHelper protected ()
  extends typings.babylonjs.BABYLON.VRExperienceHelper {
  /**
    * Instantiates a VRExperienceHelper.
    * Helps to quickly add VR support to an existing scene.
    * @param scene The scene the VRExperienceHelper belongs to.
    * @param webVROptions Options to modify the vr experience helper's behavior.
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    /** Options to modify the vr experience helper's behavior. */
  webVROptions: VRExperienceHelperOptions
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.VRExperienceHelper")
@js.native
object VRExperienceHelper extends js.Object {
  /**
    * Speed Constant Teleportation Mode
    */
  val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
  /**
    * Time Constant Teleportation Mode
    */
  val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
}

