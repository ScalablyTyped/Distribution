package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationOptions extends StObject {
  
  var numPois: js.UndefOr[Double] = js.undefined
  
  var poiRadius: js.UndefOr[Double] = js.undefined
}
object LocationOptions {
  
  inline def apply(): LocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationOptions] (val x: Self) extends AnyVal {
    
    inline def setNumPois(value: Double): Self = StObject.set(x, "numPois", value.asInstanceOf[js.Any])
    
    inline def setNumPoisUndefined: Self = StObject.set(x, "numPois", js.undefined)
    
    inline def setPoiRadius(value: Double): Self = StObject.set(x, "poiRadius", value.asInstanceOf[js.Any])
    
    inline def setPoiRadiusUndefined: Self = StObject.set(x, "poiRadius", js.undefined)
  }
}
