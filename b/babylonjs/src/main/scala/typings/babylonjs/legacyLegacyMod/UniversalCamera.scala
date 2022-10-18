package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "UniversalCamera")
@js.native
open class UniversalCamera protected ()
  extends typings.babylonjs.indexMod.UniversalCamera {
  /**
    * The Universal Camera is the one to choose for first person shooter type games, and works with all the keyboard, mouse, touch and gamepads. This replaces the earlier Free Camera,
    * which still works and will still be found in many Playgrounds.
    * @see https://doc.babylonjs.com/features/cameras#universal-camera
    * @param name Define the name of the camera in the scene
    * @param position Define the start position of the camera in the scene
    * @param scene Define the scene the camera belongs to
    */
  def this(name: String, position: typings.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    name: String,
    position: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
