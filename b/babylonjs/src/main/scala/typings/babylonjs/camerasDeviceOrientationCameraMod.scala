package typings.babylonjs

import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.mathsMathDotaxisMod.Axis
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasDeviceOrientationCameraMod {
  
  @JSImport("babylonjs/Cameras/deviceOrientationCamera", "DeviceOrientationCamera")
  @js.native
  open class DeviceOrientationCamera protected () extends FreeCamera {
    /**
      * Creates a new device orientation camera
      * @param name The name of the camera
      * @param position The start position camera
      * @param scene The scene the camera belongs to
      */
    def this(name: String, position: Vector3) = this()
    def this(name: String, position: Vector3, scene: Scene) = this()
    
    /* private */ var _disablePointerInputWhenUsingDeviceOrientation: Any = js.native
    
    /* private */ var _dragFactor: Any = js.native
    
    /* private */ var _initialQuaternion: Any = js.native
    
    /* private */ var _quaternionCache: Any = js.native
    
    /* private */ var _tmpDragQuaternion: Any = js.native
    
    /**
      * Gets or sets a boolean indicating that pointer input must be disabled on first orientation sensor update (Default: true)
      */
    def disablePointerInputWhenUsingDeviceOrientation: Boolean = js.native
    def disablePointerInputWhenUsingDeviceOrientation_=(value: Boolean): Unit = js.native
    
    /**
      * Enabled turning on the y axis when the orientation sensor is active
      * @param dragFactor the factor that controls the turn speed (default: 1/300)
      */
    def enableHorizontalDragging(): Unit = js.native
    def enableHorizontalDragging(dragFactor: Double): Unit = js.native
    
    /**
      * Reset the camera to its default orientation on the specified axis only.
      * @param axis The axis to reset
      */
    def resetToCurrentRotation(): Unit = js.native
    def resetToCurrentRotation(axis: Axis): Unit = js.native
  }
}
