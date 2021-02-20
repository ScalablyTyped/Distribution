package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverPollEndpointResponse extends StObject {
  
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
  implicit class DiscoverPollEndpointResponseMutableBuilder[Self <: DiscoverPollEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setTelemetryEndpoint(value: String): Self = StObject.set(x, "telemetryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryEndpointUndefined: Self = StObject.set(x, "telemetryEndpoint", js.undefined)
  }
}
