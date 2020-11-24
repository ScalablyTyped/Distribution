package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationMetrics extends js.Object {
  
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
  implicit class ApplicationMetricsOps[Self <: ApplicationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: NullableInteger): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setLatency(value: Latency): Self = this.set("Latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("Latency", js.undefined)
    
    @scala.inline
    def setRequestCount(value: RequestCount): Self = this.set("RequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestCount: Self = this.set("RequestCount", js.undefined)
    
    @scala.inline
    def setStatusCodes(value: StatusCodes): Self = this.set("StatusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("StatusCodes", js.undefined)
  }
}
