package typings.babylonjs.camerasIndexMod

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "StereoscopicGamepadCamera")
@js.native
open class StereoscopicGamepadCamera protected ()
  extends typings.babylonjs.camerasStereoscopicIndexMod.StereoscopicGamepadCamera {
  /**
    * Creates a new StereoscopicGamepadCamera
    * @param name defines camera name
    * @param position defines initial position
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean) = this()
  def this(
    name: String,
    position: Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: Scene
  ) = this()
}
