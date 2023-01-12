package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  /**
    * Aliases for the edge.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  
  /**
    * Describes an asynchronous connection, with a value of link.
    */
  var EdgeType: js.UndefOr[String] = js.undefined
  
  /**
    * The end time of the last segment on the edge.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A histogram that maps the spread of event age when received by consumers. Age is calculated each time an event is received. Only populated when EdgeType is link.
    */
  var ReceivedEventAgeHistogram: js.UndefOr[Histogram] = js.undefined
  
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A histogram that maps the spread of client response times on an edge. Only populated for synchronous edges.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
  
  /**
    * The start time of the first segment on the edge.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Response statistics for segments on the edge.
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
}
object Edge {
  
  inline def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: AliasList): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value*))
    
    inline def setEdgeType(value: String): Self = StObject.set(x, "EdgeType", value.asInstanceOf[js.Any])
    
    inline def setEdgeTypeUndefined: Self = StObject.set(x, "EdgeType", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setReceivedEventAgeHistogram(value: Histogram): Self = StObject.set(x, "ReceivedEventAgeHistogram", value.asInstanceOf[js.Any])
    
    inline def setReceivedEventAgeHistogramUndefined: Self = StObject.set(x, "ReceivedEventAgeHistogram", js.undefined)
    
    inline def setReceivedEventAgeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ReceivedEventAgeHistogram", js.Array(value*))
    
    inline def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    inline def setResponseTimeHistogram(value: Histogram): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
    
    inline def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
    
    inline def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
  }
}
