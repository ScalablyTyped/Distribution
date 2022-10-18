package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FreeCamera")
@js.native
open class FreeCamera protected ()
  extends typings.babylonjs.legacyLegacyMod.FreeCamera {
  /**
    * Instantiates a Free Camera.
    * This represents a free type of camera. It can be useful in First Person Shooter game for instance.
    * Please consider using the new UniversalCamera instead as it adds more functionality like touch to this camera.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
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
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
