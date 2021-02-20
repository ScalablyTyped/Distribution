package typings.babylonjs.legacyMod

import typings.babylonjs.vrExperienceHelperMod.VRExperienceHelperOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "VRExperienceHelper")
@js.native
class VRExperienceHelper protected ()
  extends typings.babylonjs.indexMod.VRExperienceHelper {
  /**
    * Instantiates a VRExperienceHelper.
    * Helps to quickly add VR support to an existing scene.
    * @param scene The scene the VRExperienceHelper belongs to.
    * @param webVROptions Options to modify the vr experience helper's behavior.
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    /** Options to modify the vr experience helper's behavior. */
  webVROptions: VRExperienceHelperOptions
  ) = this()
}
/* static members */
object VRExperienceHelper {
  
  /**
    * Speed Constant Teleportation Mode
    */
  @JSImport("babylonjs/Legacy/legacy", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTSPEED")
  @js.native
  val TELEPORTATIONMODE_CONSTANTSPEED: Double = js.native
  
  /**
    * Time Constant Teleportation Mode
    */
  @JSImport("babylonjs/Legacy/legacy", "VRExperienceHelper.TELEPORTATIONMODE_CONSTANTTIME")
  @js.native
  val TELEPORTATIONMODE_CONSTANTTIME: Double = js.native
}
