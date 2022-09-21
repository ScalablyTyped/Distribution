package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyInstanceCountResponse extends StObject {
  
  /**
    * The number of traffic policy instances that are associated with the current Amazon Web Services account.
    */
  var TrafficPolicyInstanceCount: typings.awsSdk.route53Mod.TrafficPolicyInstanceCount
}
object GetTrafficPolicyInstanceCountResponse {
  
  inline def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
  
  extension [Self <: GetTrafficPolicyInstanceCountResponse](x: Self) {
    
    inline def setTrafficPolicyInstanceCount(value: TrafficPolicyInstanceCount): Self = StObject.set(x, "TrafficPolicyInstanceCount", value.asInstanceOf[js.Any])
  }
}
