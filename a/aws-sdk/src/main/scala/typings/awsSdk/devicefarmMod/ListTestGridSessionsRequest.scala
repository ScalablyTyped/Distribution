package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionsRequest extends js.Object {
  
  /**
    * Return only sessions created after this time.
    */
  var creationTimeAfter: js.UndefOr[DateTime] = js.native
  
  /**
    * Return only sessions created before this time.
    */
  var creationTimeBefore: js.UndefOr[DateTime] = js.native
  
  /**
    * Return only sessions that ended after this time.
    */
  var endTimeAfter: js.UndefOr[DateTime] = js.native
  
  /**
    * Return only sessions that ended before this time.
    */
  var endTimeBefore: js.UndefOr[DateTime] = js.native
  
  /**
    * Return only this many results at a time.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * ARN of a TestGridProject.
    */
  var projectArn: DeviceFarmArn = js.native
  
  /**
    * Return only sessions in this state.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.native
}
object ListTestGridSessionsRequest {
  
  @scala.inline
  def apply(projectArn: DeviceFarmArn): ListTestGridSessionsRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionsRequest]
  }
  
  @scala.inline
  implicit class ListTestGridSessionsRequestOps[Self <: ListTestGridSessionsRequest] (val x: Self) extends AnyVal {
    
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
    def setProjectArn(value: DeviceFarmArn): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfter(value: DateTime): Self = this.set("creationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeAfter: Self = this.set("creationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: DateTime): Self = this.set("creationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimeBefore: Self = this.set("creationTimeBefore", js.undefined)
    
    @scala.inline
    def setEndTimeAfter(value: DateTime): Self = this.set("endTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeAfter: Self = this.set("endTimeAfter", js.undefined)
    
    @scala.inline
    def setEndTimeBefore(value: DateTime): Self = this.set("endTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeBefore: Self = this.set("endTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = this.set("maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResult: Self = this.set("maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TestGridSessionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
