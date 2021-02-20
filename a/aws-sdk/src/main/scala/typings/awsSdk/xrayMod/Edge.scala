package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends StObject {
  
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
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: AliasList): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogram(value: Histogram): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
  }
}
