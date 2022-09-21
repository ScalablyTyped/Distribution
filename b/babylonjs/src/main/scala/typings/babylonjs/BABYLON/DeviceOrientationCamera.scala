package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceOrientationCamera
  extends StObject
     with FreeCamera {
  
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
