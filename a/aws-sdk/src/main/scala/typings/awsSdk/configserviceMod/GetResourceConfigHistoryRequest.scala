package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceConfigHistoryRequest extends js.Object {
  
  /**
    * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
    */
  var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.native
  
  /**
    * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
    */
  var earlierTime: js.UndefOr[EarlierTime] = js.native
  
  /**
    * The time stamp that indicates a later time. If not specified, current time is taken.
    */
  var laterTime: js.UndefOr[LaterTime] = js.native
  
  /**
    * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: ResourceId = js.native
  
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}
object GetResourceConfigHistoryRequest {
  
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): GetResourceConfigHistoryRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryRequest]
  }
  
  @scala.inline
  implicit class GetResourceConfigHistoryRequestOps[Self <: GetResourceConfigHistoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChronologicalOrder(value: ChronologicalOrder): Self = this.set("chronologicalOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChronologicalOrder: Self = this.set("chronologicalOrder", js.undefined)
    
    @scala.inline
    def setEarlierTime(value: EarlierTime): Self = this.set("earlierTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlierTime: Self = this.set("earlierTime", js.undefined)
    
    @scala.inline
    def setLaterTime(value: LaterTime): Self = this.set("laterTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaterTime: Self = this.set("laterTime", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
