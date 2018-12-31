package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a free type of camera. It can be usefull in First Person Shooter game for instance.
  * Please consider using the new UniversalCamera instead as it adds more functionality like the gamepad.
  * @see http://doc.babylonjs.com/features/cameras#universal-camera
  */
@JSImport("babylonjs", "FreeCamera")
@js.native
class FreeCamera protected ()
  extends babylonjsLib.BABYLONNs.FreeCamera {
  /**
    * Instantiates a Free Camera.
    * This represents a free type of camera. It can be usefull in First Person Shooter game for instance.
    * Please consider using the new UniversalCamera instead as it adds more functionality like touch to this camera.
    * @see http://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
    */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
}

