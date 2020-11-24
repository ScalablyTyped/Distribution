package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetHistoryResult extends js.Object {
  
  /**
    * The ID of the EC Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  
  /**
    * Information about the events in the history of the EC2 Fleet.
    */
  var HistoryRecords: js.UndefOr[HistoryRecordSet] = js.native
  
  /**
    * The last date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ). All records up to this time were retrieved. If nextToken indicates that there are more results, this value is not present.
    */
  var LastEvaluatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The start date and time for the events, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var StartTime: js.UndefOr[DateTime] = js.native
}
object DescribeFleetHistoryResult {
  
  @scala.inline
  def apply(): DescribeFleetHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetHistoryResult]
  }
  
  @scala.inline
  implicit class DescribeFleetHistoryResultOps[Self <: DescribeFleetHistoryResult] (val x: Self) extends AnyVal {
    
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
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setHistoryRecordsVarargs(value: HistoryRecordEntry*): Self = this.set("HistoryRecords", js.Array(value :_*))
    
    @scala.inline
    def setHistoryRecords(value: HistoryRecordSet): Self = this.set("HistoryRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryRecords: Self = this.set("HistoryRecords", js.undefined)
    
    @scala.inline
    def setLastEvaluatedTime(value: DateTime): Self = this.set("LastEvaluatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedTime: Self = this.set("LastEvaluatedTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
