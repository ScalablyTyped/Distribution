package typings.babylonjs.camerasIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "FollowCamera")
@js.native
open class FollowCamera protected ()
  extends typings.babylonjs.camerasFollowCameraMod.FollowCamera {
  /**
    * Instantiates the follow camera.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/camera_introduction#followcamera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
    */
  def this(name: String, position: Vector3) = this()
  def this(name: String, position: Vector3, scene: Scene) = this()
  def this(name: String, position: Vector3, scene: Unit, lockedTarget: Nullable[AbstractMesh]) = this()
  def this(name: String, position: Vector3, scene: Scene, lockedTarget: Nullable[AbstractMesh]) = this()
}
