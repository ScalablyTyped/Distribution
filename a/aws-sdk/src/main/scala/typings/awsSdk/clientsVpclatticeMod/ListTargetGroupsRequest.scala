package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetGroupsRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The target group type.
    */
  var targetGroupType: js.UndefOr[TargetGroupType] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var vpcIdentifier: js.UndefOr[VpcId] = js.undefined
}
object ListTargetGroupsRequest {
  
  inline def apply(): ListTargetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTargetGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTargetGroupType(value: TargetGroupType): Self = StObject.set(x, "targetGroupType", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupTypeUndefined: Self = StObject.set(x, "targetGroupType", js.undefined)
    
    inline def setVpcIdentifier(value: VpcId): Self = StObject.set(x, "vpcIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVpcIdentifierUndefined: Self = StObject.set(x, "vpcIdentifier", js.undefined)
  }
}
