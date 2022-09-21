package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderMatchPattern extends StObject {
  
  /**
    * Inspect all headers. 
    */
  var All: js.UndefOr[typings.awsSdk.wafv2Mod.All] = js.undefined
  
  /**
    * Inspect only the headers whose keys don't match any of the strings specified here. 
    */
  var ExcludedHeaders: js.UndefOr[HeaderNames] = js.undefined
  
  /**
    * Inspect only the headers that have a key that matches one of the strings specified here. 
    */
  var IncludedHeaders: js.UndefOr[HeaderNames] = js.undefined
}
object HeaderMatchPattern {
  
  inline def apply(): HeaderMatchPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderMatchPattern]
  }
  
  extension [Self <: HeaderMatchPattern](x: Self) {
    
    inline def setAll(value: All): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    
    inline def setExcludedHeaders(value: HeaderNames): Self = StObject.set(x, "ExcludedHeaders", value.asInstanceOf[js.Any])
    
    inline def setExcludedHeadersUndefined: Self = StObject.set(x, "ExcludedHeaders", js.undefined)
    
    inline def setExcludedHeadersVarargs(value: FieldToMatchData*): Self = StObject.set(x, "ExcludedHeaders", js.Array(value*))
    
    inline def setIncludedHeaders(value: HeaderNames): Self = StObject.set(x, "IncludedHeaders", value.asInstanceOf[js.Any])
    
    inline def setIncludedHeadersUndefined: Self = StObject.set(x, "IncludedHeaders", js.undefined)
    
    inline def setIncludedHeadersVarargs(value: FieldToMatchData*): Self = StObject.set(x, "IncludedHeaders", js.Array(value*))
  }
}
