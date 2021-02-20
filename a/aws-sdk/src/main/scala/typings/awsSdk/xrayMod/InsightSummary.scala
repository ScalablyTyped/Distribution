package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightSummary extends StObject {
  
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
  implicit class InsightSummaryMutableBuilder[Self <: InsightSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: InsightCategoryList): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: InsightCategory*): Self = StObject.set(x, "Categories", js.Array(value :_*))
    
    @scala.inline
    def setClientRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "ClientRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestImpactStatisticsUndefined: Self = StObject.set(x, "ClientRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    @scala.inline
    def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    @scala.inline
    def setRootCauseServiceId(value: ServiceId): Self = StObject.set(x, "RootCauseServiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootCauseServiceIdUndefined: Self = StObject.set(x, "RootCauseServiceId", js.undefined)
    
    @scala.inline
    def setRootCauseServiceRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootCauseServiceRequestImpactStatisticsUndefined: Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: InsightState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSummary(value: InsightSummaryText): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
    
    @scala.inline
    def setTopAnomalousServices(value: AnomalousServiceList): Self = StObject.set(x, "TopAnomalousServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopAnomalousServicesUndefined: Self = StObject.set(x, "TopAnomalousServices", js.undefined)
    
    @scala.inline
    def setTopAnomalousServicesVarargs(value: AnomalousService*): Self = StObject.set(x, "TopAnomalousServices", js.Array(value :_*))
  }
}
