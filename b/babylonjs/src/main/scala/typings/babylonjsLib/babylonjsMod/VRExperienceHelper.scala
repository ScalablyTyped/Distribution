package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Helps to quickly add VR support to an existing scene.
     * See http://doc.babylonjs.com/how_to/webvr_helper
     */
@JSImport("babylonjs", "VRExperienceHelper")
@js.native
class VRExperienceHelper protected ()
  extends babylonjsLib.BABYLONNs.VRExperienceHelper {
  /**
           * Instantiates a VRExperienceHelper.
           * Helps to quickly add VR support to an existing scene.
           * @param scene The scene the VRExperienceHelper belongs to.
           * @param webVROptions Options to modify the vr experience helper's behavior.
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates a VRExperienceHelper.
           * Helps to quickly add VR support to an existing scene.
           * @param scene The scene the VRExperienceHelper belongs to.
           * @param webVROptions Options to modify the vr experience helper's behavior.
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, /** Options to modify the vr experience helper's behavior. */
  webVROptions: babylonjsLib.BABYLONNs.VRExperienceHelperOptions) = this()
}

