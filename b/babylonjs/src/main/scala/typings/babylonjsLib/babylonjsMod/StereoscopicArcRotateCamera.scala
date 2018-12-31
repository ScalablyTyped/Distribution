package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Camera used to simulate stereoscopic rendering (based on ArcRotateCamera)
  * @see http://doc.babylonjs.com/features/cameras
  */
@JSImport("babylonjs", "StereoscopicArcRotateCamera")
@js.native
class StereoscopicArcRotateCamera protected ()
  extends babylonjsLib.BABYLONNs.StereoscopicArcRotateCamera {
  /**
    * Creates a new StereoscopicArcRotateCamera
    * @param name defines camera name
    * @param alpha defines alpha angle (in radians)
    * @param beta defines beta angle (in radians)
    * @param radius defines radius
    * @param target defines camera target
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: babylonjsLib.BABYLONNs.Vector3, interaxialDistance: scala.Double, isStereoscopicSideBySide: scala.Boolean, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

