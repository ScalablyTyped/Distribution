package typings.bezierJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BBox extends StObject {
  
  var x: MinMax
  
  var y: MinMax
  
  var z: js.UndefOr[MinMax] = js.undefined
}
object BBox {
  
  inline def apply(x: MinMax, y: MinMax): BBox = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBox]
  }
  
  extension [Self <: BBox](x: Self) {
    
    inline def setX(value: MinMax): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: MinMax): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: MinMax): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
