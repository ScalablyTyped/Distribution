package typings.babylonjs

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchCameraMod {
  
  @JSImport("babylonjs/Cameras/touchCamera", "TouchCamera")
  @js.native
  open class TouchCamera protected () extends FreeCamera {
    /**
      * Instantiates a new touch camera.
      * This represents a FPS type of camera controlled by touch.
      * This is like a universal camera minus the Gamepad controls.
      * @see https://doc.babylonjs.com/features/cameras#universal-camera
      * @param name Define the name of the camera in the scene
      * @param position Define the start position of the camera in the scene
      * @param scene Define the scene the camera belongs to
      */
    def this(name: String, position: Vector3) = this()
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
