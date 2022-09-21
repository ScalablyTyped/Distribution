package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceCollectionResponse extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  The requested list of Amazon Web Services resource collections. The two types of Amazon Web Services resource collections supported are Amazon Web Services CloudFormation stacks and Amazon Web Services resources that contain the same Amazon Web Services tag. DevOps Guru can be configured to analyze the Amazon Web Services resources that are defined in the stacks or that are tagged using the same tag key. You can specify up to 500 Amazon Web Services CloudFormation stacks. 
    */
  var ResourceCollection: js.UndefOr[ResourceCollectionFilter] = js.undefined
}
object GetResourceCollectionResponse {
  
  inline def apply(): GetResourceCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceCollectionResponse]
  }
  
  extension [Self <: GetResourceCollectionResponse](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceCollection(value: ResourceCollectionFilter): Self = StObject.set(x, "ResourceCollection", value.asInstanceOf[js.Any])
    
    inline def setResourceCollectionUndefined: Self = StObject.set(x, "ResourceCollection", js.undefined)
  }
}
