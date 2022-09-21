package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iso8601 extends StObject {
  
  var dataCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var iso8601: String
  
  var leadingInterval: js.UndefOr[Boolean] = js.undefined
  
  var trailingInterval: js.UndefOr[Boolean] = js.undefined
}
object Iso8601 {
  
  inline def apply(iso8601: String): Iso8601 = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso8601]
  }
  
  extension [Self <: Iso8601](x: Self) {
    
    inline def setDataCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
    
    inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setIso8601(value: String): Self = StObject.set(x, "iso8601", value.asInstanceOf[js.Any])
    
    inline def setLeadingInterval(value: Boolean): Self = StObject.set(x, "leadingInterval", value.asInstanceOf[js.Any])
    
    inline def setLeadingIntervalUndefined: Self = StObject.set(x, "leadingInterval", js.undefined)
    
    inline def setTrailingInterval(value: Boolean): Self = StObject.set(x, "trailingInterval", value.asInstanceOf[js.Any])
    
    inline def setTrailingIntervalUndefined: Self = StObject.set(x, "trailingInterval", js.undefined)
  }
}
