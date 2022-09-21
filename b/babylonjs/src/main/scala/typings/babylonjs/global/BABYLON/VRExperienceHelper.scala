package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.VRExperienceHelperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VRExperienceHelper")
@js.native
open class VRExperienceHelper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.VRExperienceHelper {
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
object VRExperienceHelper {
  
  /**
    * Speed Constant Teleportation Mode
    */
  @JSGlobal("BABYLON.VRExperienceHelper.TELEPORTATIONMODE_CONSTANTSPEED")
  @js.native
  val TELEPORTATIONMODE_CONSTANTSPEED: /* 1 */ Double = js.native
  
  /**
    * Time Constant Teleportation Mode
    */
  @JSGlobal("BABYLON.VRExperienceHelper.TELEPORTATIONMODE_CONSTANTTIME")
  @js.native
  val TELEPORTATIONMODE_CONSTANTTIME: /* 0 */ Double = js.native
}
