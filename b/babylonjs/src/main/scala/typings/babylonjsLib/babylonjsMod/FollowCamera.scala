package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A follow camera takes a mesh as a target and follows it as it moves. Both a free camera version followCamera and
     * an arc rotate version arcFollowCamera are available.
     * @see http://doc.babylonjs.com/features/cameras#follow-camera
     */
@JSImport("babylonjs", "FollowCamera")
@js.native
class FollowCamera protected ()
  extends babylonjsLib.BABYLONNs.FollowCamera {
  /**
           * Instantiates the follow camera.
           * @see http://doc.babylonjs.com/features/cameras#follow-camera
           * @param name Define the name of the camera in the scene
           * @param position Define the position of the camera
           * @param scene Define the scene the camera belong to
           * @param lockedTarget Define the target of the camera
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates the follow camera.
           * @see http://doc.babylonjs.com/features/cameras#follow-camera
           * @param name Define the name of the camera in the scene
           * @param position Define the position of the camera
           * @param scene Define the scene the camera belong to
           * @param lockedTarget Define the target of the camera
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, lockedTarget: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh]) = this()
}

