package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FollowCamera")
@js.native
class FollowCamera protected ()
  extends typings.babylonjs.BABYLON.FollowCamera {
  /**
    * Instantiates the follow camera.
    * @see https://doc.babylonjs.com/features/cameras#follow-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the position of the camera
    * @param scene Define the scene the camera belong to
    * @param lockedTarget Define the target of the camera
    */
  def this(name: String, position: typings.babylonjs.BABYLON.Vector3, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    position: typings.babylonjs.BABYLON.Vector3,
    scene: typings.babylonjs.BABYLON.Scene,
    lockedTarget: Nullable[typings.babylonjs.BABYLON.AbstractMesh]
  ) = this()
}
