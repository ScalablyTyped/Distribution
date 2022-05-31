package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColor3Like extends StObject {
  
  var b: float
  
  var g: float
  
  var r: float
}
object IColor3Like {
  
  inline def apply(b: float, g: float, r: float): IColor3Like = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor3Like]
  }
  
  extension [Self <: IColor3Like](x: Self) {
    
    inline def setB(value: float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: float): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: float): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
