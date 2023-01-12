package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawingLimitOptions extends StObject {
  
  var area: js.UndefOr[Double] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
}
object DrawingLimitOptions {
  
  inline def apply(): DrawingLimitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingLimitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawingLimitOptions] (val x: Self) extends AnyVal {
    
    inline def setArea(value: Double): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
