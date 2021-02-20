package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationMetrics extends StObject {
  
  /**
    * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (request_count) within the most recent time slice of 10 seconds (duration).
    */
  var Duration: js.UndefOr[NullableInteger] = js.native
  
  /**
    * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in seconds with one millisecond resolution.
    */
  var Latency: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Latency] = js.native
  
  /**
    * Average number of requests handled by the web server per second over the last 10 seconds.
    */
  var RequestCount: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RequestCount] = js.native
  
  /**
    * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
    */
  var StatusCodes: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.StatusCodes] = js.native
}
object ApplicationMetrics {
  
  @scala.inline
  def apply(): ApplicationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationMetrics]
  }
  
  @scala.inline
  implicit class ApplicationMetricsMutableBuilder[Self <: ApplicationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: NullableInteger): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setLatency(value: Latency): Self = StObject.set(x, "Latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "Latency", js.undefined)
    
    @scala.inline
    def setRequestCount(value: RequestCount): Self = StObject.set(x, "RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCountUndefined: Self = StObject.set(x, "RequestCount", js.undefined)
    
    @scala.inline
    def setStatusCodes(value: StatusCodes): Self = StObject.set(x, "StatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodesUndefined: Self = StObject.set(x, "StatusCodes", js.undefined)
  }
}
