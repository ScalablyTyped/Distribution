package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricsOutput extends StObject {
  
  /**
    * The metrics that match your request. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.cloudwatchMod.Metrics] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object ListMetricsOutput {
  
  inline def apply(): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsOutput]
  }
  
  extension [Self <: ListMetricsOutput](x: Self) {
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
