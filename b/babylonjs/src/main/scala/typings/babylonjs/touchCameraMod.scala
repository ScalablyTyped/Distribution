package typings.babylonjs

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/touchCamera", JSImport.Namespace)
@js.native
object touchCameraMod extends js.Object {
  
  @js.native
  class TouchCamera protected () extends FreeCamera {
    /**
      * Instantiates a new touch camera.
      * This represents a FPS type of camera controlled by touch.
      * This is like a universal camera minus the Gamepad controls.
      * @see https://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    
    /**
      * Defines the touch sensibility for rotation.
      * The higher the faster.
      */
    def touchAngularSensibility: Double = js.native
    def touchAngularSensibility_=(value: Double): Unit = js.native
    
    /**
      * Defines the touch sensibility for move.
      * The higher the faster.
      */
    def touchMoveSensibility: Double = js.native
    def touchMoveSensibility_=(value: Double): Unit = js.native
  }
}
