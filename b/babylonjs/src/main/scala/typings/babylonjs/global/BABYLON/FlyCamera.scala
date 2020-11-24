package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FlyCamera")
@js.native
class FlyCamera protected ()
  extends typings.babylonjs.BABYLON.FlyCamera {
  /**
    * Instantiates a FlyCamera.
    * This is a flying camera, designed for 3D movement and rotation in all directions,
    * such as in a 3D Space Shooter or a Flight Simulator.
    * @param name Define the name of the camera in the scene.
    * @param position Define the starting position of the camera in the scene.
    * @param scene Define the scene the camera belongs to.
    * @param setActiveOnSceneIfNoneActive Defines wheter the camera should be marked as active, if no other camera has been defined as active.
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
