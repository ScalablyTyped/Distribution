package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcRotateCameraMouseWheelInput
  extends StObject
     with ICameraInput[ArcRotateCamera] {
  
  /* protected */ def _computeDeltaFromMouseWheelLegacyEvent(mouseWheelDelta: Double, radius: Double): Double = js.native
  
  /* private */ var _getPosition: Any = js.native
  
  /* private */ var _hitPlane: Any = js.native
  
  /* private */ var _inertialPanning: Any = js.native
  
  /* private */ var _observer: Any = js.native
  
  /* private */ var _updateHitPlane: Any = js.native
  
  /* private */ var _wheel: Any = js.native
  
  /* private */ var _zeroIfClose: Any = js.native
  
  /* private */ var _zoomToMouse: Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraMouseWheelInput: ArcRotateCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraMouseWheelInput(): Unit = js.native
  
  /**
    * If set, this function will be used to set the radius delta that will be added to the current camera radius
    */
  var customComputeDeltaFromMouseWheel: Nullable[
    js.Function3[/* wheelDelta */ Double, /* input */ this.type, /* event */ IWheelEvent, Double]
  ] = js.native
  
  /**
    * wheelDeltaPercentage will be used instead of wheelPrecision if different from 0.
    * It defines the percentage of current camera.radius to use as delta when wheel is used.
    */
  var wheelDeltaPercentage: Double = js.native
  
  /**
    * Gets or Set the mouse wheel precision or how fast is the camera zooming.
    */
  var wheelPrecision: Double = js.native
  
  /**
    * Gets or Set the boolean value that controls whether or not the mouse wheel
    * zooms to the location of the mouse pointer or not.  The default is false.
    */
  var zoomToMouseLocation: Boolean = js.native
}
