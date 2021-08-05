package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficPolicyVersionResponse extends StObject {
  
  /**
    * A unique URL that represents a new traffic policy version.
    */
  var Location: ResourceURI
  
  /**
    * A complex type that contains settings for the new version of the traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy
}
object CreateTrafficPolicyVersionResponse {
  
  inline def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyVersionResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyVersionResponse]
  }
  
  extension [Self <: CreateTrafficPolicyVersionResponse](x: Self) {
    
    inline def setLocation(value: ResourceURI): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicy(value: TrafficPolicy): Self = StObject.set(x, "TrafficPolicy", value.asInstanceOf[js.Any])
  }
}
