package typings.babylonjs.babylonjsMod

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/index", "DeviceOrientationCamera")
@js.native
class DeviceOrientationCamera protected ()
  extends typings.babylonjs.deviceOrientationCameraMod.DeviceOrientationCamera {
  /**
    * Creates a new device orientation camera
    * @param name The name of the camera
    * @param position The start position camera
    * @param scene The scene the camera belongs to
    */
  def this(name: String, position: Vector3, scene: Scene) = this()
}
