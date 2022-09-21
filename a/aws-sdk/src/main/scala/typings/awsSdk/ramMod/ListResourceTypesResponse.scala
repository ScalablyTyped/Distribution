package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceTypesResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that contain information about the resource types that can be shared using RAM.
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
    
    inline def setResourceTypesVarargs(value: ServiceNameAndResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
