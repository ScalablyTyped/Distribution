package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideMimeType extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
}
object OverrideMimeType {
  
  inline def apply(): OverrideMimeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideMimeType]
  }
  
  extension [Self <: OverrideMimeType](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
