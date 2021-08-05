package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyResponse extends StObject {
  
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy
}
object GetTrafficPolicyResponse {
  
  inline def apply(TrafficPolicy: TrafficPolicy): GetTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyResponse]
  }
  
  extension [Self <: GetTrafficPolicyResponse](x: Self) {
    
    inline def setTrafficPolicy(value: TrafficPolicy): Self = StObject.set(x, "TrafficPolicy", value.asInstanceOf[js.Any])
  }
}
