package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceConfigHistoryRequest extends StObject {
  
  /**
    * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
    */
  var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined
  
  /**
    * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
    */
  var earlierTime: js.UndefOr[EarlierTime] = js.undefined
  
  /**
    * The time stamp that indicates a later time. If not specified, current time is taken.
    */
  var laterTime: js.UndefOr[LaterTime] = js.undefined
  
  /**
    * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: ResourceId
  
  /**
    * The resource type.
    */
  var resourceType: ResourceType
}
object GetResourceConfigHistoryRequest {
  
  inline def apply(resourceId: ResourceId, resourceType: ResourceType): GetResourceConfigHistoryRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryRequest]
  }
  
  extension [Self <: GetResourceConfigHistoryRequest](x: Self) {
    
    inline def setChronologicalOrder(value: ChronologicalOrder): Self = StObject.set(x, "chronologicalOrder", value.asInstanceOf[js.Any])
    
    inline def setChronologicalOrderUndefined: Self = StObject.set(x, "chronologicalOrder", js.undefined)
    
    inline def setEarlierTime(value: EarlierTime): Self = StObject.set(x, "earlierTime", value.asInstanceOf[js.Any])
    
    inline def setEarlierTimeUndefined: Self = StObject.set(x, "earlierTime", js.undefined)
    
    inline def setLaterTime(value: LaterTime): Self = StObject.set(x, "laterTime", value.asInstanceOf[js.Any])
    
    inline def setLaterTimeUndefined: Self = StObject.set(x, "laterTime", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
