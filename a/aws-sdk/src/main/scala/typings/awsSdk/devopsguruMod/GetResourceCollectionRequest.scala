package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceCollectionRequest extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  The type of Amazon Web Services resource collections to return. The one valid value is CLOUD_FORMATION for Amazon Web Services CloudFormation stacks. 
    */
  var ResourceCollectionType: typings.awsSdk.devopsguruMod.ResourceCollectionType
}
object GetResourceCollectionRequest {
  
  inline def apply(ResourceCollectionType: ResourceCollectionType): GetResourceCollectionRequest = {
    val __obj = js.Dynamic.literal(ResourceCollectionType = ResourceCollectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceCollectionRequest]
  }
  
  extension [Self <: GetResourceCollectionRequest](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceCollectionType(value: ResourceCollectionType): Self = StObject.set(x, "ResourceCollectionType", value.asInstanceOf[js.Any])
  }
}
