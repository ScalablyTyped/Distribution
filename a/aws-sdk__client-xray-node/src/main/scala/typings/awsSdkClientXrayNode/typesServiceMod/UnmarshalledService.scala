package typings.awsSdkClientXrayNode.typesServiceMod

import typings.awsSdkClientXrayNode.typesEdgeMod.UnmarshalledEdge
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typings.awsSdkClientXrayNode.typesServiceStatisticsMod.UnmarshalledServiceStatistics
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledService extends Service {
  
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  @JSName("DurationHistogram")
  var DurationHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  
  /**
    * <p>Connections to downstream services.</p>
    */
  @JSName("Edges")
  var Edges_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledEdge]] = js.native
  
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  @JSName("EndTime")
  var EndTime_UnmarshalledService: js.UndefOr[Date] = js.native
  
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  @JSName("Names")
  var Names_UnmarshalledService: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  @JSName("StartTime")
  var StartTime_UnmarshalledService: js.UndefOr[Date] = js.native
  
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics_UnmarshalledService: js.UndefOr[UnmarshalledServiceStatistics] = js.native
}
object UnmarshalledService {
  
  @scala.inline
  def apply(): UnmarshalledService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledService]
  }
  
  @scala.inline
  implicit class UnmarshalledServiceOps[Self <: UnmarshalledService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDurationHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = this.set("DurationHistogram", js.Array(value :_*))
    
    @scala.inline
    def setDurationHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = this.set("DurationHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationHistogram: Self = this.set("DurationHistogram", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: UnmarshalledEdge*): Self = this.set("Edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[UnmarshalledEdge]): Self = this.set("Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("Edges", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setSummaryStatistics(value: UnmarshalledServiceStatistics): Self = this.set("SummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryStatistics: Self = this.set("SummaryStatistics", js.undefined)
  }
}
