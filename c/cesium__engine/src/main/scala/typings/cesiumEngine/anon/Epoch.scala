package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Epoch extends StObject {
  
  var dataCallback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var epoch: JulianDate
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var iso8601Durations: String
  
  var leadingInterval: js.UndefOr[Boolean] = js.undefined
  
  var relativeToPrevious: js.UndefOr[Boolean] = js.undefined
  
  var trailingInterval: js.UndefOr[Boolean] = js.undefined
}
object Epoch {
  
  inline def apply(epoch: JulianDate, iso8601Durations: String): Epoch = {
    val __obj = js.Dynamic.literal(epoch = epoch.asInstanceOf[js.Any], iso8601Durations = iso8601Durations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Epoch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Epoch] (val x: Self) extends AnyVal {
    
    inline def setDataCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "dataCallback", js.Any.fromFunction1(value))
    
    inline def setDataCallbackUndefined: Self = StObject.set(x, "dataCallback", js.undefined)
    
    inline def setEpoch(value: JulianDate): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setIso8601Durations(value: String): Self = StObject.set(x, "iso8601Durations", value.asInstanceOf[js.Any])
    
    inline def setLeadingInterval(value: Boolean): Self = StObject.set(x, "leadingInterval", value.asInstanceOf[js.Any])
    
    inline def setLeadingIntervalUndefined: Self = StObject.set(x, "leadingInterval", js.undefined)
    
    inline def setRelativeToPrevious(value: Boolean): Self = StObject.set(x, "relativeToPrevious", value.asInstanceOf[js.Any])
    
    inline def setRelativeToPreviousUndefined: Self = StObject.set(x, "relativeToPrevious", js.undefined)
    
    inline def setTrailingInterval(value: Boolean): Self = StObject.set(x, "trailingInterval", value.asInstanceOf[js.Any])
    
    inline def setTrailingIntervalUndefined: Self = StObject.set(x, "trailingInterval", js.undefined)
  }
}
