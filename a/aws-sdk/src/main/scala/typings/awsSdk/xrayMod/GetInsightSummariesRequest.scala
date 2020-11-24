package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightSummariesRequest extends js.Object {
  
  /**
    * The end of the time frame in which the insights ended. The end time can't be more than 30 days old.
    */
  var EndTime: Timestamp = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the group. Required if the GroupName isn't provided.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The name of the group. Required if the GroupARN isn't provided.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  
  /**
    * The maximum number of results to display.
    */
  var MaxResults: js.UndefOr[GetInsightSummariesMaxResults] = js.native
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * The beginning of the time frame in which the insights started. The start time can't be more than 30 days old.
    */
  var StartTime: Timestamp = js.native
  
  /**
    * The list of insight states. 
    */
  var States: js.UndefOr[InsightStateList] = js.native
}
object GetInsightSummariesRequest {
  
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): GetInsightSummariesRequest = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightSummariesRequest]
  }
  
  @scala.inline
  implicit class GetInsightSummariesRequestOps[Self <: GetInsightSummariesRequest] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: GetInsightSummariesMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: InsightState*): Self = this.set("States", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: InsightStateList): Self = this.set("States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("States", js.undefined)
  }
}
