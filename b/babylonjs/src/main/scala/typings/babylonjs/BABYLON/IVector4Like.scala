package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVector4Like extends StObject {
  
  var w: float
  
  var x: float
  
  var y: float
  
  var z: float
}
object IVector4Like {
  
  inline def apply(w: float, x: float, y: float, z: float): IVector4Like = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector4Like]
  }
  
  extension [Self <: IVector4Like](x: Self) {
    
    inline def setW(value: float): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
