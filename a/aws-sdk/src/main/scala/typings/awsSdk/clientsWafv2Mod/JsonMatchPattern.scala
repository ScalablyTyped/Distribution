package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonMatchPattern extends StObject {
  
  /**
    * Match all of the elements. See also MatchScope in JsonBody.  You must specify either this setting or the IncludedPaths setting, but not both.
    */
  var All: js.UndefOr[typings.awsSdk.clientsWafv2Mod.All] = js.undefined
  
  /**
    * Match only the specified include paths. See also MatchScope in JsonBody.  Provide the include paths using JSON Pointer syntax. For example, "IncludedPaths": ["/dogs/0/name", "/dogs/1/name"]. For information about this syntax, see the Internet Engineering Task Force (IETF) documentation JavaScript Object Notation (JSON) Pointer.  You must specify either this setting or the All setting, but not both.  Don't use this option to include all paths. Instead, use the All setting.  
    */
  var IncludedPaths: js.UndefOr[JsonPointerPaths] = js.undefined
}
object JsonMatchPattern {
  
  inline def apply(): JsonMatchPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonMatchPattern]
  }
  
  extension [Self <: JsonMatchPattern](x: Self) {
    
    inline def setAll(value: All): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    
    inline def setIncludedPaths(value: JsonPointerPaths): Self = StObject.set(x, "IncludedPaths", value.asInstanceOf[js.Any])
    
    inline def setIncludedPathsUndefined: Self = StObject.set(x, "IncludedPaths", js.undefined)
    
    inline def setIncludedPathsVarargs(value: JsonPointerPath*): Self = StObject.set(x, "IncludedPaths", js.Array(value*))
  }
}
