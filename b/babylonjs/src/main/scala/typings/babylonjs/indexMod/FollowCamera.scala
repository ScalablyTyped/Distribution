package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "FollowCamera")
@js.native
open class FollowCamera protected ()
  extends typings.babylonjs.camerasIndexMod.FollowCamera {
  /**
    * Instantiates the follow camera.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/camera_introduction#followcamera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
    */
  def this(name: String, position: typings.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    lockedTarget: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    lockedTarget: Nullable[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh]
  ) = this()
}
