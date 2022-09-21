package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRControllerMovementOptions extends StObject {
  
  /**
    * Override default behaviour and provide your own movement controls
    */
  var customRegistrationConfigurations: js.UndefOr[js.Array[WebXRControllerMovementRegistrationConfiguration]] = js.undefined
  
  /**
    * Is movement enabled
    */
  var movementEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Camera direction follows view pose and movement by default will move independently of the viewer's pose.
    */
  var movementOrientationFollowsViewerPose: Boolean
  
  /**
    * Movement speed factor (default is 1.0)
    */
  var movementSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum threshold the controller's thumbstick/touchpad must pass before being recognized for movement (avoids jitter/unintentional movement)
    */
  var movementThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Is rotation enabled
    */
  var rotationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Movement speed factor (default is 1.0)
    */
  var rotationSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum threshold the controller's thumstick/touchpad must pass before being recognized for rotation (avoids jitter/unintentional rotation)
    */
  var rotationThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Babylon XR Input class for controller
    */
  var xrInput: WebXRInput
}
object IWebXRControllerMovementOptions {
  
  inline def apply(movementOrientationFollowsViewerPose: Boolean, xrInput: WebXRInput): IWebXRControllerMovementOptions = {
    val __obj = js.Dynamic.literal(movementOrientationFollowsViewerPose = movementOrientationFollowsViewerPose.asInstanceOf[js.Any], xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRControllerMovementOptions]
  }
  
  extension [Self <: IWebXRControllerMovementOptions](x: Self) {
    
    inline def setCustomRegistrationConfigurations(value: js.Array[WebXRControllerMovementRegistrationConfiguration]): Self = StObject.set(x, "customRegistrationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setCustomRegistrationConfigurationsUndefined: Self = StObject.set(x, "customRegistrationConfigurations", js.undefined)
    
    inline def setCustomRegistrationConfigurationsVarargs(value: WebXRControllerMovementRegistrationConfiguration*): Self = StObject.set(x, "customRegistrationConfigurations", js.Array(value*))
    
    inline def setMovementEnabled(value: Boolean): Self = StObject.set(x, "movementEnabled", value.asInstanceOf[js.Any])
    
    inline def setMovementEnabledUndefined: Self = StObject.set(x, "movementEnabled", js.undefined)
    
    inline def setMovementOrientationFollowsViewerPose(value: Boolean): Self = StObject.set(x, "movementOrientationFollowsViewerPose", value.asInstanceOf[js.Any])
    
    inline def setMovementSpeed(value: Double): Self = StObject.set(x, "movementSpeed", value.asInstanceOf[js.Any])
    
    inline def setMovementSpeedUndefined: Self = StObject.set(x, "movementSpeed", js.undefined)
    
    inline def setMovementThreshold(value: Double): Self = StObject.set(x, "movementThreshold", value.asInstanceOf[js.Any])
    
    inline def setMovementThresholdUndefined: Self = StObject.set(x, "movementThreshold", js.undefined)
    
    inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
    
    inline def setRotationSpeed(value: Double): Self = StObject.set(x, "rotationSpeed", value.asInstanceOf[js.Any])
    
    inline def setRotationSpeedUndefined: Self = StObject.set(x, "rotationSpeed", js.undefined)
    
    inline def setRotationThreshold(value: Double): Self = StObject.set(x, "rotationThreshold", value.asInstanceOf[js.Any])
    
    inline def setRotationThresholdUndefined: Self = StObject.set(x, "rotationThreshold", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
