package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowCameraPointersInput extends BaseCameraPointersInput {
  
  var _warning: js.Any = js.native
  
  var _warningCounter: js.Any = js.native
  
  /**
    * Defines the pointer angular sensibility along the X axis or how fast is
    * the camera rotating.
    * A negative number will reverse the axis direction.
    */
  var angularSensibilityX: Double = js.native
  
  /**
    * Defines the pointer angular sensibility along the Y axis or how fast is
    * the camera rotating.
    * A negative number will reverse the axis direction.
    */
  var angularSensibilityY: Double = js.native
  
  /**
    * Pinch controls height. (Pinch modifies camera.heightOffset value.)
    */
  var axisPinchControlHeight: Boolean = js.native
  
  /**
    * Pinch controls zoom. (Pinch modifies camera.radius value.)
    */
  var axisPinchControlRadius: Boolean = js.native
  
  /**
    * Pinch controls angle. (Pinch modifies camera.rotationOffset value.)
    */
  var axisPinchControlRotation: Boolean = js.native
  
  /**
    * Pointer X axis controls height. (X axis modifies camera.heightOffset value.)
    */
  var axisXControlHeight: Boolean = js.native
  
  /**
    * Pointer X axis controls zoom. (X axis modifies camera.radius value.)
    */
  var axisXControlRadius: Boolean = js.native
  
  /**
    * Pointer X axis controls angle. (X axis modifies camera.rotationOffset value.)
    */
  var axisXControlRotation: Boolean = js.native
  
  /**
    * Pointer Y axis controls height. (Y axis modifies camera.heightOffset value.)
    */
  var axisYControlHeight: Boolean = js.native
  
  /**
    * Pointer Y axis controls zoom. (Y axis modifies camera.radius value.)
    */
  var axisYControlRadius: Boolean = js.native
  
  /**
    * Pointer Y axis controls angle. (Y axis modifies camera.rotationOffset value.)
    */
  var axisYControlRotation: Boolean = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FollowCameraPointersInput: FollowCamera = js.native
  
  /**
    * pinchDeltaPercentage will be used instead of pinchPrecision if different
    * from 0.
    * It defines the percentage of current camera.radius to use as delta when
    * pinch zoom is used.
    */
  var pinchDeltaPercentage: Double = js.native
  
  /**
    * Defines the pointer pinch precision or how fast is the camera zooming.
    * A negative number will reverse the axis direction.
    */
  var pinchPrecision: Double = js.native
  
  /**
    * Log error messages if basic misconfiguration has occurred.
    */
  var warningEnable: Boolean = js.native
}
