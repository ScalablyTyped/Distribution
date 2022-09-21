package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insight extends StObject {
  
  /**
    * The categories that label and describe the type of insight.
    */
  var Categories: js.UndefOr[InsightCategoryList] = js.undefined
  
  /**
    * The impact statistics of the client side service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the insight ended.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the group that the insight belongs to.
    */
  var GroupARN: js.UndefOr[typings.awsSdk.xrayMod.GroupARN] = js.undefined
  
  /**
    * The name of the group that the insight belongs to.
    */
  var GroupName: js.UndefOr[typings.awsSdk.xrayMod.GroupName] = js.undefined
  
  /**
    * The insights unique identifier. 
    */
  var InsightId: js.UndefOr[typings.awsSdk.xrayMod.InsightId] = js.undefined
  
  var RootCauseServiceId: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The impact statistics of the root cause service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.undefined
  
  /**
    * The time, in Unix seconds, at which the insight began.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the insight.
    */
  var State: js.UndefOr[InsightState] = js.undefined
  
  /**
    * A brief description of the insight.
    */
  var Summary: js.UndefOr[InsightSummaryText] = js.undefined
  
  /**
    * The service within the insight that is most impacted by the incident.
    */
  var TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.undefined
}
object Insight {
  
  inline def apply(): Insight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insight]
  }
  
  extension [Self <: Insight](x: Self) {
    
    inline def setCategories(value: InsightCategoryList): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "Categories", js.undefined)
    
    inline def setCategoriesVarargs(value: InsightCategory*): Self = StObject.set(x, "Categories", js.Array(value*))
    
    inline def setClientRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "ClientRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    inline def setClientRequestImpactStatisticsUndefined: Self = StObject.set(x, "ClientRequestImpactStatistics", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setGroupARN(value: GroupARN): Self = StObject.set(x, "GroupARN", value.asInstanceOf[js.Any])
    
    inline def setGroupARNUndefined: Self = StObject.set(x, "GroupARN", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
    
    inline def setRootCauseServiceId(value: ServiceId): Self = StObject.set(x, "RootCauseServiceId", value.asInstanceOf[js.Any])
    
    inline def setRootCauseServiceIdUndefined: Self = StObject.set(x, "RootCauseServiceId", js.undefined)
    
    inline def setRootCauseServiceRequestImpactStatistics(value: RequestImpactStatistics): Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    inline def setRootCauseServiceRequestImpactStatisticsUndefined: Self = StObject.set(x, "RootCauseServiceRequestImpactStatistics", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: InsightState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSummary(value: InsightSummaryText): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "Summary", js.undefined)
    
    inline def setTopAnomalousServices(value: AnomalousServiceList): Self = StObject.set(x, "TopAnomalousServices", value.asInstanceOf[js.Any])
    
    inline def setTopAnomalousServicesUndefined: Self = StObject.set(x, "TopAnomalousServices", js.undefined)
    
    inline def setTopAnomalousServicesVarargs(value: AnomalousService*): Self = StObject.set(x, "TopAnomalousServices", js.Array(value*))
  }
}
