package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Camera used to simulate stereoscopic rendering (based on UniversalCamera)
     * @see http://doc.babylonjs.com/features/cameras
     */
@JSGlobal("BABYLON.StereoscopicUniversalCamera")
@js.native
class StereoscopicUniversalCamera protected () extends UniversalCamera {
  /**
           * Creates a new StereoscopicUniversalCamera
           * @param name defines camera name
           * @param position defines initial position
           * @param interaxialDistance defines distance between each color axis
           * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
           * @param scene defines the hosting scene
           */
  def this(name: java.lang.String, position: Vector3, interaxialDistance: scala.Double, isStereoscopicSideBySide: scala.Boolean, scene: Scene) = this()
}

