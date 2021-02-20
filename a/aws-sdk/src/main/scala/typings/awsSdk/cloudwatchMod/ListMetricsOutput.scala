package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMetricsOutput extends StObject {
  
  /**
    * The metrics that match your request. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.cloudwatchMod.Metrics] = js.native
  
  /**
    * The token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}
object ListMetricsOutput {
  
  @scala.inline
  def apply(): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricsOutput]
  }
  
  @scala.inline
  implicit class ListMetricsOutputMutableBuilder[Self <: ListMetricsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
