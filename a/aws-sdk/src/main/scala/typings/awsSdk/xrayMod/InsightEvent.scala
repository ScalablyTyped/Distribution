package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightEvent extends js.Object {
  
  /**
    * The impact statistics of the client side service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var ClientRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.native
  
  /**
    * The time, in Unix seconds, at which the event was recorded.
    */
  var EventTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The impact statistics of the root cause service. This includes the number of requests to the client service and whether the requests were faults or okay.
    */
  var RootCauseServiceRequestImpactStatistics: js.UndefOr[RequestImpactStatistics] = js.native
  
  /**
    * A brief description of the event.
    */
  var Summary: js.UndefOr[EventSummaryText] = js.native
  
  /**
    * The service during the event that is most impacted by the incident.
    */
  var TopAnomalousServices: js.UndefOr[AnomalousServiceList] = js.native
}
object InsightEvent {
  
  @scala.inline
  def apply(): InsightEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsightEvent]
  }
  
  @scala.inline
  implicit class InsightEventOps[Self <: InsightEvent] (val x: Self) extends AnyVal {
    
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
    def setClientRequestImpactStatistics(value: RequestImpactStatistics): Self = this.set("ClientRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestImpactStatistics: Self = this.set("ClientRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setEventTime(value: Timestamp): Self = this.set("EventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("EventTime", js.undefined)
    
    @scala.inline
    def setRootCauseServiceRequestImpactStatistics(value: RequestImpactStatistics): Self = this.set("RootCauseServiceRequestImpactStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootCauseServiceRequestImpactStatistics: Self = this.set("RootCauseServiceRequestImpactStatistics", js.undefined)
    
    @scala.inline
    def setSummary(value: EventSummaryText): Self = this.set("Summary", value.asInstanceOf[js.Any])
    
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
