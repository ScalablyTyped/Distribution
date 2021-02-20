package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChangeSetResponse extends StObject {
  
  /**
    * An array of ChangeSummary objects.
    */
  var ChangeSet: js.UndefOr[ChangeSetDescription] = js.native
  
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.native
  
  /**
    * Required. The unique identifier for the change set referenced in this request.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The optional name provided in the StartChangeSet request. If you do not provide a name, one is set by default.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetName] = js.native
  
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The change cannot transition to a different state. Null if the request is not in a terminal state. 
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.native
  
  /**
    * Returned if the change set is in FAILED status. Can be either CLIENT_ERROR, which means that there are issues with the request (see the ErrorDetailList), or SERVER_FAULT, which means that there is a problem in the system, and you should retry your request.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.marketplacecatalogMod.FailureCode] = js.native
  
  /**
    * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the request.
    */
  var FailureDescription: js.UndefOr[StringValue] = js.native
  
  /**
    * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started. 
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.native
  
  /**
    * The status of the change request.
    */
  var Status: js.UndefOr[ChangeStatus] = js.native
}
object DescribeChangeSetResponse {
  
  @scala.inline
  def apply(): DescribeChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChangeSetResponse]
  }
  
  @scala.inline
  implicit class DescribeChangeSetResponseMutableBuilder[Self <: DescribeChangeSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSet(value: ChangeSetDescription): Self = StObject.set(x, "ChangeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetArn(value: ARN): Self = StObject.set(x, "ChangeSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetArnUndefined: Self = StObject.set(x, "ChangeSetArn", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    @scala.inline
    def setChangeSetUndefined: Self = StObject.set(x, "ChangeSet", js.undefined)
    
    @scala.inline
    def setChangeSetVarargs(value: ChangeSummary*): Self = StObject.set(x, "ChangeSet", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: DateTimeISO8601): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureDescription(value: StringValue): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTimeISO8601): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ChangeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
