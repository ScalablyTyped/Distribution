package typings.cesium.anon

import typings.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCallback extends StObject {
  
  var dataCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var julianDates: js.Array[JulianDate]
  
  var leadingInterval: js.UndefOr[Boolean] = js.undefined
  
  var trailingInterval: js.UndefOr[Boolean] = js.undefined
}
object DataCallback {
  
  inline def apply(julianDates: js.Array[JulianDate]): DataCallback = {
    val __obj = js.Dynamic.literal(julianDates = julianDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCallback]
  }
  
  extension [Self <: DataCallback](x: Self) {
    
    inline def setDataCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
    
    inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setJulianDates(value: js.Array[JulianDate]): Self = StObject.set(x, "julianDates", value.asInstanceOf[js.Any])
    
    inline def setJulianDatesVarargs(value: JulianDate*): Self = StObject.set(x, "julianDates", js.Array(value*))
    
    inline def setLeadingInterval(value: Boolean): Self = StObject.set(x, "leadingInterval", value.asInstanceOf[js.Any])
    
    inline def setLeadingIntervalUndefined: Self = StObject.set(x, "leadingInterval", js.undefined)
    
    inline def setTrailingInterval(value: Boolean): Self = StObject.set(x, "trailingInterval", value.asInstanceOf[js.Any])
    
    inline def setTrailingIntervalUndefined: Self = StObject.set(x, "trailingInterval", js.undefined)
  }
}
