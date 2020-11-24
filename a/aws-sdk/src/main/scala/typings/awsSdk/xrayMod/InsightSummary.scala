package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightSummary extends js.Object {
  
  /**
    *  Categories The categories that label and describe the type of insight.
    */
  var Categories: js.UndefOr[InsightCategoryList] = js.native
  
  /**
    * The impact statistics of the client side service. This includes the number of requests to the client service and whether the requests were faults or okay. 
    */
  var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.native
  
  /**
    * The time, in Unix seconds, at which the insight ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the group that the insight belongs to.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.native
  
  /**
    * The name of the group that the insight belongs to.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.native
  
  /**
    * The insights unique identifier. 
    */
  var InsightId: js.UndefOr[typings.awsSdk.xrayMod.InsightId] = js.native
  
  /**
    * The time, in Unix seconds, that the insight was last updated.
    */
  var LastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  var RootCauseServiceId: js.UndefOr[ServiceId] = js.native
  
  /**
    * The impact statistics of the root cause service. This includes the number of requests to the client service and whether the requests were faults or okay. 
    */
  var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.native
  
  /**
    * The time, in Unix seconds, at which the insight began.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The current state of the insight.
    */
  var State: js.UndefOr[InsightState] = js.native
  
  /**
    * A brief description of the insight.
    */
  var Summary: js.UndefOr[InsightSummaryText] = js.native
  
  /**
    * The service within the insight that is most impacted by the incident.
    */
  var TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.native
}
object InsightSummary {
  
  @scala.inline
  def apply(): InsightSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightSummary]
  }
  
  @scala.inline
  implicit class InsightSummaryOps[Self <: InsightSummary] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: InsightCategory*): Self = this.set("Categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: InsightCategoryList): Self = this.set("Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("Categories", js.undefined)
    
    @scala.inline
    def setClientRequestImpactStatistics(value: RequestImpactStatistics): Self = this.set("ClientRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestImpactStatistics: Self = this.set("ClientRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = this.set("GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupARN: Self = this.set("GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    
    @scala.inline
    def setInsightId(value: InsightId): Self = this.set("InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsightId: Self = this.set("InsightId", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
    
    @scala.inline
    def setRootCauseServiceId(value: ServiceId): Self = this.set("RootCauseServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCauseServiceId: Self = this.set("RootCauseServiceId", js.undefined)
    
    @scala.inline
    def setRootCauseServiceRequestImpactStatistics(value: RequestImpactStatistics): Self = this.set("RootCauseServiceRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCauseServiceRequestImpactStatistics: Self = this.set("RootCauseServiceRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: InsightState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setSummary(value: InsightSummaryText): Self = this.set("Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("Summary", js.undefined)
    
    @scala.inline
    def setTopAnomalousServicesVarargs(value: AnomalousService*): Self = this.set("TopAnomalousServices", js.Array(value :_*))
    
    @scala.inline
    def setTopAnomalousServices(value: AnomalousServiceList): Self = this.set("TopAnomalousServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopAnomalousServices: Self = this.set("TopAnomalousServices", js.undefined)
  }
}
