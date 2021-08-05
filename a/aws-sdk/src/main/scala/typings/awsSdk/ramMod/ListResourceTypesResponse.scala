package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceTypesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The shareable resource types supported by AWS RAM.
    */
  var resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList] = js.undefined
}
object ListResourceTypesResponse {
  
  inline def apply(): ListResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTypesResponse]
  }
  
  extension [Self <: ListResourceTypesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceTypes(value: ServiceNameAndResourceTypeList): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ServiceNameAndResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
  }
}
