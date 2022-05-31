package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVector3Like extends StObject {
  
  var x: float
  
  var y: float
  
  var z: float
}
object IVector3Like {
  
  inline def apply(x: float, y: float, z: float): IVector3Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector3Like]
  }
  
  extension [Self <: IVector3Like](x: Self) {
    
    inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: float): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
