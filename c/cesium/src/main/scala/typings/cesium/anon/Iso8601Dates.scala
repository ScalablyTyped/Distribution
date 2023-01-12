package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iso8601Dates extends StObject {
  
  var dataCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var iso8601Dates: js.Array[String]
  
  var leadingInterval: js.UndefOr[Boolean] = js.undefined
  
  var trailingInterval: js.UndefOr[Boolean] = js.undefined
}
object Iso8601Dates {
  
  inline def apply(iso8601Dates: js.Array[String]): Iso8601Dates = {
    val __obj = js.Dynamic.literal(iso8601Dates = iso8601Dates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso8601Dates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iso8601Dates] (val x: Self) extends AnyVal {
    
    inline def setDataCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
    
    inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setIso8601Dates(value: js.Array[String]): Self = StObject.set(x, "iso8601Dates", value.asInstanceOf[js.Any])
    
    inline def setIso8601DatesVarargs(value: String*): Self = StObject.set(x, "iso8601Dates", js.Array(value*))
    
    inline def setLeadingInterval(value: Boolean): Self = StObject.set(x, "leadingInterval", value.asInstanceOf[js.Any])
    
    inline def setLeadingIntervalUndefined: Self = StObject.set(x, "leadingInterval", js.undefined)
    
    inline def setTrailingInterval(value: Boolean): Self = StObject.set(x, "trailingInterval", value.asInstanceOf[js.Any])
    
    inline def setTrailingIntervalUndefined: Self = StObject.set(x, "trailingInterval", js.undefined)
  }
}
