package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionsRequest extends StObject {
  
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
  implicit class ListTestGridSessionsRequestMutableBuilder[Self <: ListTestGridSessionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTimeAfter(value: DateTime): Self = StObject.set(x, "creationTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeAfterUndefined: Self = StObject.set(x, "creationTimeAfter", js.undefined)
    
    @scala.inline
    def setCreationTimeBefore(value: DateTime): Self = StObject.set(x, "creationTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeBeforeUndefined: Self = StObject.set(x, "creationTimeBefore", js.undefined)
    
    @scala.inline
    def setEndTimeAfter(value: DateTime): Self = StObject.set(x, "endTimeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeAfterUndefined: Self = StObject.set(x, "endTimeAfter", js.undefined)
    
    @scala.inline
    def setEndTimeBefore(value: DateTime): Self = StObject.set(x, "endTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeBeforeUndefined: Self = StObject.set(x, "endTimeBefore", js.undefined)
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjectArn(value: DeviceFarmArn): Self = StObject.set(x, "projectArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TestGridSessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
