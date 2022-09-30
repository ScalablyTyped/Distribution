package typings.bizcharts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X1
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var x1: js.UndefOr[Double] = js.undefined
  
  var x2: js.UndefOr[Double] = js.undefined
  
  var y1: js.UndefOr[Double] = js.undefined
  
  var y2: js.UndefOr[Double] = js.undefined
}
object X1 {
  
  inline def apply(): X1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X1]
  }
  
  extension [Self <: X1](x: Self) {
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
  }
}
