package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
  /**
    * Aliases for the edge.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  
  /**
    * The end time of the last segment on the edge.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.native
  
  /**
    * A histogram that maps the spread of client response times on an edge.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  
  /**
    * The start time of the first segment on the edge.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Response statistics for segments on the edge.
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
}
object Edge {
  
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: Alias*): Self = this.set("Aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: AliasList): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("ReferenceId", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeHistogram(value: Histogram): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setSummaryStatistics(value: EdgeStatistics): Self = this.set("SummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryStatistics: Self = this.set("SummaryStatistics", js.undefined)
  }
}
