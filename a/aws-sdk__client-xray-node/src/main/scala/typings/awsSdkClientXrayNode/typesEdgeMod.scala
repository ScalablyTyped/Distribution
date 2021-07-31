package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesAliasMod.Alias
import typings.awsSdkClientXrayNode.typesAliasMod.UnmarshalledAlias
import typings.awsSdkClientXrayNode.typesEdgeStatisticsMod.EdgeStatistics
import typings.awsSdkClientXrayNode.typesEdgeStatisticsMod.UnmarshalledEdgeStatistics
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEdgeMod {
  
  trait Edge extends StObject {
    
    /**
      * <p>Aliases for the edge.</p>
      */
    var Aliases: js.UndefOr[js.Array[Alias] | Iterable[Alias]] = js.undefined
    
    /**
      * <p>The end time of the last segment on the edge.</p>
      */
    var EndTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>Identifier of the edge. Unique within a service map.</p>
      */
    var ReferenceId: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A histogram that maps the spread of client response times on an edge.</p>
      */
    var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
    
    /**
      * <p>The start time of the first segment on the edge.</p>
      */
    var StartTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>Response statistics for segments on the edge.</p>
      */
    var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
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
      def setAliases(value: js.Array[Alias] | Iterable[Alias]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: Alias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setReferenceId(value: Double): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogram(value: js.Array[HistogramEntry] | Iterable[HistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setSummaryStatistics(value: EdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
  
  trait UnmarshalledEdge
    extends StObject
       with Edge {
    
    /**
      * <p>Aliases for the edge.</p>
      */
    @JSName("Aliases")
    var Aliases_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledAlias]] = js.undefined
    
    /**
      * <p>The end time of the last segment on the edge.</p>
      */
    @JSName("EndTime")
    var EndTime_UnmarshalledEdge: js.UndefOr[Date] = js.undefined
    
    /**
      * <p>A histogram that maps the spread of client response times on an edge.</p>
      */
    @JSName("ResponseTimeHistogram")
    var ResponseTimeHistogram_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.undefined
    
    /**
      * <p>The start time of the first segment on the edge.</p>
      */
    @JSName("StartTime")
    var StartTime_UnmarshalledEdge: js.UndefOr[Date] = js.undefined
    
    /**
      * <p>Response statistics for segments on the edge.</p>
      */
    @JSName("SummaryStatistics")
    var SummaryStatistics_UnmarshalledEdge: js.UndefOr[UnmarshalledEdgeStatistics] = js.undefined
  }
  object UnmarshalledEdge {
    
    @scala.inline
    def apply(): UnmarshalledEdge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEdge]
    }
    
    @scala.inline
    implicit class UnmarshalledEdgeMutableBuilder[Self <: UnmarshalledEdge] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: js.Array[UnmarshalledAlias]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
      
      @scala.inline
      def setAliasesVarargs(value: UnmarshalledAlias*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      @scala.inline
      def setResponseTimeHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      @scala.inline
      def setSummaryStatistics(value: UnmarshalledEdgeStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
}
