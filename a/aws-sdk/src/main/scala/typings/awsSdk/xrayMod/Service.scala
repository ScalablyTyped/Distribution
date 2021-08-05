package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * Identifier of the AWS account in which the service runs.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * A histogram that maps the spread of service durations.
    */
  var DurationHistogram: js.UndefOr[Histogram] = js.undefined
  
  /**
    * Connections to downstream services.
    */
  var Edges: js.UndefOr[EdgeList] = js.undefined
  
  /**
    * The end time of the last segment that the service generated.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The canonical name of the service.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of names for the service, including the canonical name.
    */
  var Names: js.UndefOr[ServiceNames] = js.undefined
  
  /**
    * Identifier for the service. Unique within the service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * A histogram that maps the spread of service response times.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
  
  /**
    * Indicates that the service was the first service to process a request.
    */
  var Root: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The start time of the first segment that the service generated.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The service's state.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * Aggregated statistics for the service.
    */
  var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
  
  /**
    * The type of service.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for an application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.   AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    client - Represents the clients that sent requests to a root service.    remote - A downstream service of indeterminate type.  
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
    
    inline def setDurationHistogram(value: Histogram): Self = StObject.set(x, "DurationHistogram", value.asInstanceOf[js.Any])
    
    inline def setDurationHistogramUndefined: Self = StObject.set(x, "DurationHistogram", js.undefined)
    
    inline def setDurationHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "DurationHistogram", js.Array(value :_*))
    
    inline def setEdges(value: EdgeList): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value :_*))
    
    inline def setEndTime(value: Timestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNames(value: ServiceNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    inline def setReferenceId(value: NullableInteger): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "ReferenceId", js.undefined)
    
    inline def setResponseTimeHistogram(value: Histogram): Self = StObject.set(x, "ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeHistogramUndefined: Self = StObject.set(x, "ResponseTimeHistogram", js.undefined)
    
    inline def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = StObject.set(x, "ResponseTimeHistogram", js.Array(value :_*))
    
    inline def setRoot(value: NullableBoolean): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    
    inline def setStartTime(value: Timestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setSummaryStatistics(value: ServiceStatistics): Self = StObject.set(x, "SummaryStatistics", value.asInstanceOf[js.Any])
    
    inline def setSummaryStatisticsUndefined: Self = StObject.set(x, "SummaryStatistics", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
