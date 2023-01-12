package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVector2Like extends StObject {
  
  var x: float
  
  var y: float
}
object IVector2Like {
  
  inline def apply(x: float, y: float): IVector2Like = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVector2Like]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVector2Like] (val x: Self) extends AnyVal {
    
    inline def setX(value: float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
