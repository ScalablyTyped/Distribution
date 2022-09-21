package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppVersionResourceMappingsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Mappings used to map logical resources from the template to physical resources. You can use the mapping type CFN_STACK if the application template uses a logical stack name. Or you can map individual resources by using the mapping type RESOURCE. We recommend using the mapping type CFN_STACK if the application is backed by a CloudFormation stack.
    */
  var resourceMappings: ResourceMappingList
}
object ListAppVersionResourceMappingsResponse {
  
  inline def apply(resourceMappings: ResourceMappingList): ListAppVersionResourceMappingsResponse = {
    val __obj = js.Dynamic.literal(resourceMappings = resourceMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppVersionResourceMappingsResponse]
  }
  
  extension [Self <: ListAppVersionResourceMappingsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceMappings(value: ResourceMappingList): Self = StObject.set(x, "resourceMappings", value.asInstanceOf[js.Any])
    
    inline def setResourceMappingsVarargs(value: ResourceMapping*): Self = StObject.set(x, "resourceMappings", js.Array(value*))
  }
}
