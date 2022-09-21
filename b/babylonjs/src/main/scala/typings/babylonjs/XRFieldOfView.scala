package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRFieldOfView extends StObject {
  
  var angleDown: Double
  
  var angleLeft: Double
  
  var angleRight: Double
  
  var angleUp: Double
}
object XRFieldOfView {
  
  inline def apply(angleDown: Double, angleLeft: Double, angleRight: Double, angleUp: Double): XRFieldOfView = {
    val __obj = js.Dynamic.literal(angleDown = angleDown.asInstanceOf[js.Any], angleLeft = angleLeft.asInstanceOf[js.Any], angleRight = angleRight.asInstanceOf[js.Any], angleUp = angleUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFieldOfView]
  }
  
  extension [Self <: XRFieldOfView](x: Self) {
    
    inline def setAngleDown(value: Double): Self = StObject.set(x, "angleDown", value.asInstanceOf[js.Any])
    
    inline def setAngleLeft(value: Double): Self = StObject.set(x, "angleLeft", value.asInstanceOf[js.Any])
    
    inline def setAngleRight(value: Double): Self = StObject.set(x, "angleRight", value.asInstanceOf[js.Any])
    
    inline def setAngleUp(value: Double): Self = StObject.set(x, "angleUp", value.asInstanceOf[js.Any])
  }
}
