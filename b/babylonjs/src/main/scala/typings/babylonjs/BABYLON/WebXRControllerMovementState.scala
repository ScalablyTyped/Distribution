package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXRControllerMovementState extends StObject {
  
  var moveX: Double
  
  var moveY: Double
  
  var rotateX: Double
  
  var rotateY: Double
}
object WebXRControllerMovementState {
  
  inline def apply(moveX: Double, moveY: Double, rotateX: Double, rotateY: Double): WebXRControllerMovementState = {
    val __obj = js.Dynamic.literal(moveX = moveX.asInstanceOf[js.Any], moveY = moveY.asInstanceOf[js.Any], rotateX = rotateX.asInstanceOf[js.Any], rotateY = rotateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRControllerMovementState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebXRControllerMovementState] (val x: Self) extends AnyVal {
    
    inline def setMoveX(value: Double): Self = StObject.set(x, "moveX", value.asInstanceOf[js.Any])
    
    inline def setMoveY(value: Double): Self = StObject.set(x, "moveY", value.asInstanceOf[js.Any])
    
    inline def setRotateX(value: Double): Self = StObject.set(x, "rotateX", value.asInstanceOf[js.Any])
    
    inline def setRotateY(value: Double): Self = StObject.set(x, "rotateY", value.asInstanceOf[js.Any])
  }
}
