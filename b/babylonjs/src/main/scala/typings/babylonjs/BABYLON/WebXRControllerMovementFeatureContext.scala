package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRControllerMovementFeatureContext extends StObject {
  
  var movementEnabled: Boolean
  
  var movementOrientationFollowsViewerPose: Boolean
  
  var movementSpeed: Double
  
  var movementThreshold: Double
  
  var rotationEnabled: Boolean
  
  var rotationSpeed: Double
  
  var rotationThreshold: Double
}
object WebXRControllerMovementFeatureContext {
  
  inline def apply(
    movementEnabled: Boolean,
    movementOrientationFollowsViewerPose: Boolean,
    movementSpeed: Double,
    movementThreshold: Double,
    rotationEnabled: Boolean,
    rotationSpeed: Double,
    rotationThreshold: Double
  ): WebXRControllerMovementFeatureContext = {
    val __obj = js.Dynamic.literal(movementEnabled = movementEnabled.asInstanceOf[js.Any], movementOrientationFollowsViewerPose = movementOrientationFollowsViewerPose.asInstanceOf[js.Any], movementSpeed = movementSpeed.asInstanceOf[js.Any], movementThreshold = movementThreshold.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationSpeed = rotationSpeed.asInstanceOf[js.Any], rotationThreshold = rotationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRControllerMovementFeatureContext]
  }
  
  extension [Self <: WebXRControllerMovementFeatureContext](x: Self) {
    
    inline def setMovementEnabled(value: Boolean): Self = StObject.set(x, "movementEnabled", value.asInstanceOf[js.Any])
    
    inline def setMovementOrientationFollowsViewerPose(value: Boolean): Self = StObject.set(x, "movementOrientationFollowsViewerPose", value.asInstanceOf[js.Any])
    
    inline def setMovementSpeed(value: Double): Self = StObject.set(x, "movementSpeed", value.asInstanceOf[js.Any])
    
    inline def setMovementThreshold(value: Double): Self = StObject.set(x, "movementThreshold", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationSpeed(value: Double): Self = StObject.set(x, "rotationSpeed", value.asInstanceOf[js.Any])
    
    inline def setRotationThreshold(value: Double): Self = StObject.set(x, "rotationThreshold", value.asInstanceOf[js.Any])
  }
}
