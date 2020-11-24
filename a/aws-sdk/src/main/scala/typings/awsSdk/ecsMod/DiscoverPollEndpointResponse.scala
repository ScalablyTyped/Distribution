package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverPollEndpointResponse extends js.Object {
  
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.native
  
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.native
}
object DiscoverPollEndpointResponse {
  
  @scala.inline
  def apply(): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
  
  @scala.inline
  implicit class DiscoverPollEndpointResponseOps[Self <: DiscoverPollEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setTelemetryEndpoint(value: String): Self = this.set("telemetryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetryEndpoint: Self = this.set("telemetryEndpoint", js.undefined)
  }
}
