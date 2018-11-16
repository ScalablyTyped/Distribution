package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Camera used to simulate anaglyphic rendering (based on UniversalCamera)
     * @see http://doc.babylonjs.com/features/cameras#anaglyph-cameras
     */
@JSImport("babylonjs", "AnaglyphUniversalCamera")
@js.native
class AnaglyphUniversalCamera protected ()
  extends babylonjsLib.BABYLONNs.AnaglyphUniversalCamera {
  /**
           * Creates a new AnaglyphUniversalCamera
           * @param name defines camera name
           * @param position defines initial position
           * @param interaxialDistance defines distance between each color axis
           * @param scene defines the hosting scene
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, interaxialDistance: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

