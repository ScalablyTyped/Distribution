package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedGroupsRequest extends StObject {
  
  /**
    * Specify this parameter to limit how many groups are returned each time you use the ListAssociatedGroups operation. If you omit this parameter, the default of 20 is used.
    */
  var MaxResults: js.UndefOr[MaxGroupResults] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ARN of the canary that you want to view groups for.
    */
  var ResourceArn: CanaryArn
}
object ListAssociatedGroupsRequest {
  
  inline def apply(ResourceArn: CanaryArn): ListAssociatedGroupsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxGroupResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArn(value: CanaryArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
