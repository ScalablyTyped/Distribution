package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSharesRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner
  
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * The status of the resource share.
    */
  var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined
  
  /**
    * One or more tag filters.
    */
  var tagFilters: js.UndefOr[TagFilters] = js.undefined
}
object GetResourceSharesRequest {
  
  inline def apply(resourceOwner: ResourceOwner): GetResourceSharesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSharesRequest]
  }
  
  extension [Self <: GetResourceSharesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value :_*))
    
    inline def setResourceShareStatus(value: ResourceShareStatus): Self = StObject.set(x, "resourceShareStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceShareStatusUndefined: Self = StObject.set(x, "resourceShareStatus", js.undefined)
    
    inline def setTagFilters(value: TagFilters): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    inline def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
  }
}
