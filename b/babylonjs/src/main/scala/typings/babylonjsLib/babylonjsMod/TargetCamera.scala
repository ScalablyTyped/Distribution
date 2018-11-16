package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A target camera takes a mesh or position as a target and continues to look at it while it moves.
     * This is the base of the follow, arc rotate cameras and Free camera
     * @see http://doc.babylonjs.com/features/cameras
     */
@JSImport("babylonjs", "TargetCamera")
@js.native
class TargetCamera protected ()
  extends babylonjsLib.BABYLONNs.TargetCamera {
  /**
           * Instantiates a target camera that takes a meshor position as a target and continues to look at it while it moves.
           * This is the base of the follow, arc rotate cameras and Free camera
           * @see http://doc.babylonjs.com/features/cameras
           * @param name Defines the name of the camera in the scene
           * @param position Defines the start position of the camera in the scene
           * @param scene Defines the scene the camera belongs to
           * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates a target camera that takes a meshor position as a target and continues to look at it while it moves.
           * This is the base of the follow, arc rotate cameras and Free camera
           * @see http://doc.babylonjs.com/features/cameras
           * @param name Defines the name of the camera in the scene
           * @param position Defines the start position of the camera in the scene
           * @param scene Defines the scene the camera belongs to
           * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active if not other active cameras have been defined
           */
  def this(name: java.lang.String, position: babylonjsLib.BABYLONNs.Vector3, scene: babylonjsLib.BABYLONNs.Scene, setActiveOnSceneIfNoneActive: scala.Boolean) = this()
}

