package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCostAllocationTagsRequest extends StObject {
  
  /**
    * The maximum number of objects that are returned for this request. By default, the request returns 100 results. 
    */
  var MaxResults: js.UndefOr[CostAllocationTagsMaxResults] = js.undefined
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.undefined
  
  /**
    * The status of cost allocation tag keys that are returned for this request. 
    */
  var Status: js.UndefOr[CostAllocationTagStatus] = js.undefined
  
  /**
    * The list of cost allocation tag keys that are returned for this request. 
    */
  var TagKeys: js.UndefOr[CostAllocationTagKeyList] = js.undefined
  
  /**
    * The type of CostAllocationTag object that are returned for this request. The AWSGenerated type tags are tags that Amazon Web Services defines and applies to support Amazon Web Services resources for cost allocation purposes. The UserDefined type tags are tags that you define, create, and apply to resources. 
    */
  var Type: js.UndefOr[CostAllocationTagType] = js.undefined
}
object ListCostAllocationTagsRequest {
  
  inline def apply(): ListCostAllocationTagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCostAllocationTagsRequest]
  }
  
  extension [Self <: ListCostAllocationTagsRequest](x: Self) {
    
    inline def setMaxResults(value: CostAllocationTagsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextPageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: CostAllocationTagStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTagKeys(value: CostAllocationTagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
    
    inline def setType(value: CostAllocationTagType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
