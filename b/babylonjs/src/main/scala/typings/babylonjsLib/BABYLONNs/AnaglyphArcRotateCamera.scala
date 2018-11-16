package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Camera used to simulate anaglyphic rendering (based on ArcRotateCamera)
     * @see http://doc.babylonjs.com/features/cameras#anaglyph-cameras
     */
@JSGlobal("BABYLON.AnaglyphArcRotateCamera")
@js.native
class AnaglyphArcRotateCamera protected () extends ArcRotateCamera {
  /**
           * Creates a new AnaglyphArcRotateCamera
           * @param name defines camera name
           * @param alpha defines alpha angle (in radians)
           * @param beta defines beta angle (in radians)
           * @param radius defines radius
           * @param target defines camera target
           * @param interaxialDistance defines distance between each color axis
           * @param scene defines the hosting scene
           */
  def this(name: java.lang.String, alpha: scala.Double, beta: scala.Double, radius: scala.Double, target: Vector3, interaxialDistance: scala.Double, scene: Scene) = this()
}

