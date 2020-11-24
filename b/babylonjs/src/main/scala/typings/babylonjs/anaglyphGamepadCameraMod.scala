package typings.babylonjs

import typings.babylonjs.gamepadCameraMod.GamepadCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Stereoscopic/anaglyphGamepadCamera", JSImport.Namespace)
@js.native
object anaglyphGamepadCameraMod extends js.Object {
  
  @js.native
  class AnaglyphGamepadCamera protected () extends GamepadCamera {
    /**
      * Creates a new AnaglyphGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
}
