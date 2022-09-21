package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCompatibleVersionsResponse extends StObject {
  
  /**
    *  A map of compatible OpenSearch versions returned as part of the  GetCompatibleVersions  operation. 
    */
  var CompatibleVersions: js.UndefOr[CompatibleVersionsList] = js.undefined
}
object GetCompatibleVersionsResponse {
  
  inline def apply(): GetCompatibleVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCompatibleVersionsResponse]
  }
  
  extension [Self <: GetCompatibleVersionsResponse](x: Self) {
    
    inline def setCompatibleVersions(value: CompatibleVersionsList): Self = StObject.set(x, "CompatibleVersions", value.asInstanceOf[js.Any])
    
    inline def setCompatibleVersionsUndefined: Self = StObject.set(x, "CompatibleVersions", js.undefined)
    
    inline def setCompatibleVersionsVarargs(value: CompatibleVersionsMap*): Self = StObject.set(x, "CompatibleVersions", js.Array(value*))
  }
}
