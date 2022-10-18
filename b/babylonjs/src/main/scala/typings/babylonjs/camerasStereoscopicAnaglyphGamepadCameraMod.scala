package typings.babylonjs

import typings.babylonjs.camerasGamepadCameraMod.GamepadCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicAnaglyphGamepadCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphGamepadCamera", "AnaglyphGamepadCamera")
  @js.native
  open class AnaglyphGamepadCamera protected () extends GamepadCamera {
    /**
      * Creates a new AnaglyphGamepadCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
