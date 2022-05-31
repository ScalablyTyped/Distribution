package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickValues extends StObject {
  
  /**
    * The x component of the control stick
    */
  var x: Double
  
  /**
    * The y component of the control stick
    */
  var y: Double
}
object StickValues {
  
  inline def apply(x: Double, y: Double): StickValues = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickValues]
  }
  
  extension [Self <: StickValues](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
