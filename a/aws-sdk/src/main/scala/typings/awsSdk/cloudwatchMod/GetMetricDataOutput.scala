package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetricDataOutput extends StObject {
  
  /**
    * Contains a message about this GetMetricData operation, if the operation results in such a message. An example of a message that might be returned is Maximum number of allowed metrics exceeded. If there is a message, as much of the operation as possible is still executed. A message appears here only if it is related to the global GetMetricData operation. Any message about a specific metric returned by the operation appears in the MetricDataResult object returned for that metric.
    */
  var Messages: js.UndefOr[MetricDataResultMessages] = js.undefined
  
  /**
    * The metrics that are returned, including the metric name, namespace, and dimensions.
    */
  var MetricDataResults: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricDataResults] = js.undefined
  
  /**
    * A token that marks the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object GetMetricDataOutput {
  
  inline def apply(): GetMetricDataOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricDataOutput]
  }
  
  extension [Self <: GetMetricDataOutput](x: Self) {
    
    inline def setMessages(value: MetricDataResultMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: MessageData*): Self = StObject.set(x, "Messages", js.Array(value*))
    
    inline def setMetricDataResults(value: MetricDataResults): Self = StObject.set(x, "MetricDataResults", value.asInstanceOf[js.Any])
    
    inline def setMetricDataResultsUndefined: Self = StObject.set(x, "MetricDataResults", js.undefined)
    
    inline def setMetricDataResultsVarargs(value: MetricDataResult*): Self = StObject.set(x, "MetricDataResults", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
