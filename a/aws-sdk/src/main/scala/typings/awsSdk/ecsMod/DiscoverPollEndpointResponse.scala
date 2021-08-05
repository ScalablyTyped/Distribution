package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverPollEndpointResponse extends StObject {
  
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.undefined
}
object DiscoverPollEndpointResponse {
  
  inline def apply(): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
  
  extension [Self <: DiscoverPollEndpointResponse](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setTelemetryEndpoint(value: String): Self = StObject.set(x, "telemetryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setTelemetryEndpointUndefined: Self = StObject.set(x, "telemetryEndpoint", js.undefined)
  }
}
