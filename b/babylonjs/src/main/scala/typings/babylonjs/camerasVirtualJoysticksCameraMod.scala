package typings.babylonjs

import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasVirtualJoysticksCameraMod {
  
  @JSImport("babylonjs/Cameras/virtualJoysticksCamera", "VirtualJoysticksCamera")
  @js.native
  open class VirtualJoysticksCamera protected () extends FreeCamera {
    /**
      * Instantiates a VirtualJoysticksCamera. It can be useful in First Person Shooter game for instance.
      * It is identical to the Free Camera and simply adds by default a virtual joystick.
      * Virtual Joysticks are on-screen 2D graphics that are used to control the camera or other scene items.
      * @see https://doc.babylonjs.com/features/cameras#virtual-joysticks-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
  }
}
