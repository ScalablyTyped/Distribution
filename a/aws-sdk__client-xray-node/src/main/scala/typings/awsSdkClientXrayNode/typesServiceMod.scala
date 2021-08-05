package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesEdgeMod.Edge
import typings.awsSdkClientXrayNode.typesEdgeMod.UnmarshalledEdge
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typings.awsSdkClientXrayNode.typesServiceStatisticsMod.ServiceStatistics
import typings.awsSdkClientXrayNode.typesServiceStatisticsMod.UnmarshalledServiceStatistics
import typings.std.Date
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesServiceMod {
  
  trait Service extends StObject {
    
    /**
      * <p>Identifier of the AWS account in which the service runs.</p>
      */
    var AccountId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A histogram that maps the spread of service durations.</p>
      */
    var DurationHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
    
    /**
      * <p>Connections to downstream services.</p>
      */
    var Edges: js.UndefOr[js.Array[Edge] | Iterable[Edge]] = js.undefined
    
    /**
      * <p>The end time of the last segment that the service generated.</p>
      */
    var EndTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The canonical name of the service.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>A list of names for the service, including the canonical name.</p>
      */
    var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
    
    /**
      * <p>Identifier for the service. Unique within the service map.</p>
      */
    var ReferenceId: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>A histogram that maps the spread of service response times.</p>
      */
    var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
    
    /**
      * <p>Indicates that the service was the first service to process a request.</p>
      */
    var Root: js.UndefOr[Boolean] = js.undefined
    
    /**
      * <p>The start time of the first segment that the service generated.</p>
      */
    var StartTime: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * <p>The service's state.</p>
      */
    var State: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Aggregated statistics for the service.</p>
      */
    var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
    
    /**
      * <p>The type of service.</p> <ul> <li> <p>AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application used.</p> </li> <li> <p>AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon DynamoDB that didn't target a specific table.</p> </li> <li> <p> <code>client</code> - Represents the clients that sent requests to a root service.</p> </li> <li> <p> <code>remote</code> - A downstream service of indeterminate type.</p> </li> </ul>
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object Service {
    
    inline def apply(): Service = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
      
      inline def setDurationHistogram(value: js.Array[HistogramEntry] | Iterable[HistogramEntry]): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
      
      inline def setDurationHistogramUndefined: Self = StObject.set(x, "DurationHistogram", js.undefined)
      
      inline def setDurationHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "DurationHistogram", js.Array(value :_*))
      
      inline def setEdges(value: js.Array[Edge] | Iterable[Edge]): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
      
      inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
      
      inline def setEndTime(value: Date | String | Double): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setNames(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
      
      inline def setReferenceId(value: Double): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
      
      inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
      
      inline def setResponseTimeHistogram(value: js.Array[HistogramEntry] | Iterable[HistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      inline def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartTime(value: Date | String | Double): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      inline def setSummaryStatistics(value: ServiceStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      inline def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait UnmarshalledService
    extends StObject
       with Service {
    
    /**
      * <p>A histogram that maps the spread of service durations.</p>
      */
    @JSName("DurationHistogram")
    var DurationHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.undefined
    
    /**
      * <p>Connections to downstream services.</p>
      */
    @JSName("Edges")
    var Edges_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledEdge]] = js.undefined
    
    /**
      * <p>The end time of the last segment that the service generated.</p>
      */
    @JSName("EndTime")
    var EndTime_UnmarshalledService: js.UndefOr[Date] = js.undefined
    
    /**
      * <p>A list of names for the service, including the canonical name.</p>
      */
    @JSName("Names")
    var Names_UnmarshalledService: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * <p>A histogram that maps the spread of service response times.</p>
      */
    @JSName("ResponseTimeHistogram")
    var ResponseTimeHistogram_UnmarshalledService: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.undefined
    
    /**
      * <p>The start time of the first segment that the service generated.</p>
      */
    @JSName("StartTime")
    var StartTime_UnmarshalledService: js.UndefOr[Date] = js.undefined
    
    /**
      * <p>Aggregated statistics for the service.</p>
      */
    @JSName("SummaryStatistics")
    var SummaryStatistics_UnmarshalledService: js.UndefOr[UnmarshalledServiceStatistics] = js.undefined
  }
  object UnmarshalledService {
    
    inline def apply(): UnmarshalledService = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledService]
    }
    
    extension [Self <: UnmarshalledService](x: Self) {
      
      inline def setDurationHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
      
      inline def setDurationHistogramUndefined: Self = StObject.set(x, "DurationHistogram", js.undefined)
      
      inline def setDurationHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = StObject.set(x, "DurationHistogram", js.Array(value :_*))
      
      inline def setEdges(value: js.Array[UnmarshalledEdge]): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
      
      inline def setEdgesVarargs(value: UnmarshalledEdge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
      
      inline def setEndTime(value: Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
      
      inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
      
      inline def setResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
      
      inline def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
      
      inline def setResponseTimeHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
      
      inline def setStartTime(value: Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
      
      inline def setSummaryStatistics(value: UnmarshalledServiceStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
      
      inline def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    }
  }
}
