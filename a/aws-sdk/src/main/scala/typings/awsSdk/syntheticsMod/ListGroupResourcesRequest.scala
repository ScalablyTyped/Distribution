package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupResourcesRequest extends StObject {
  
  /**
    * Specifies the group to return information for. You can specify the group name, the ARN, or the group ID as the GroupIdentifier.
    */
  var GroupIdentifier: typings.awsSdk.syntheticsMod.GroupIdentifier
  
  /**
    * Specify this parameter to limit how many canary ARNs are returned each time you use the ListGroupResources operation. If you omit this parameter, the default of 20 is used.
    */
  var MaxResults: js.UndefOr[MaxGroupResults] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGroupResourcesRequest {
  
  inline def apply(GroupIdentifier: GroupIdentifier): ListGroupResourcesRequest = {
    val __obj = js.Dynamic.literal(GroupIdentifier = GroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupResourcesRequest]
  }
  
  extension [Self <: ListGroupResourcesRequest](x: Self) {
    
    inline def setGroupIdentifier(value: GroupIdentifier): Self = StObject.set(x, "GroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxGroupResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
