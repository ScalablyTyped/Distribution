package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSampledRequestsResponse extends StObject {
  
  /**
    * The total number of requests from which GetSampledRequests got a sample of MaxItems requests. If PopulationSize is less than MaxItems, the sample includes every request that your AWS resource received during the specified time range.
    */
  var PopulationSize: js.UndefOr[typings.awsSdk.wafv2Mod.PopulationSize] = js.native
  
  /**
    * A complex type that contains detailed information about each of the requests in the sample.
    */
  var SampledRequests: js.UndefOr[SampledHTTPRequests] = js.native
  
  /**
    * Usually, TimeWindow is the time range that you specified in the GetSampledRequests request. However, if your AWS resource received more than 5,000 requests during the time range that you specified in the request, GetSampledRequests returns the time range for the first 5,000 requests. Times are in Coordinated Universal Time (UTC) format.
    */
  var TimeWindow: js.UndefOr[typings.awsSdk.wafv2Mod.TimeWindow] = js.native
}
object GetSampledRequestsResponse {
  
  @scala.inline
  def apply(): GetSampledRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampledRequestsResponse]
  }
  
  @scala.inline
  implicit class GetSampledRequestsResponseMutableBuilder[Self <: GetSampledRequestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopulationSize(value: PopulationSize): Self = StObject.set(x, "PopulationSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopulationSizeUndefined: Self = StObject.set(x, "PopulationSize", js.undefined)
    
    @scala.inline
    def setSampledRequests(value: SampledHTTPRequests): Self = StObject.set(x, "SampledRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampledRequestsUndefined: Self = StObject.set(x, "SampledRequests", js.undefined)
    
    @scala.inline
    def setSampledRequestsVarargs(value: SampledHTTPRequest*): Self = StObject.set(x, "SampledRequests", js.Array(value :_*))
    
    @scala.inline
    def setTimeWindow(value: TimeWindow): Self = StObject.set(x, "TimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeWindowUndefined: Self = StObject.set(x, "TimeWindow", js.undefined)
  }
}
