package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsStopIncluded extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var isStartIncluded: js.UndefOr[Boolean] = js.undefined
  
  var isStopIncluded: js.UndefOr[Boolean] = js.undefined
  
  var iso8601: String
}
object IsStopIncluded {
  
  inline def apply(iso8601: String): IsStopIncluded = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStopIncluded]
  }
  
  extension [Self <: IsStopIncluded](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    inline def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    inline def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    inline def setIso8601(value: String): Self = StObject.set(x, "iso8601", value.asInstanceOf[js.Any])
  }
}
