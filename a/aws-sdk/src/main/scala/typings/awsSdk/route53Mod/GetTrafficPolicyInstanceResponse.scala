package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyInstanceResponse extends StObject {
  
  /**
    * A complex type that contains settings for the traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsSdk.route53Mod.TrafficPolicyInstance
}
object GetTrafficPolicyInstanceResponse {
  
  inline def apply(TrafficPolicyInstance: TrafficPolicyInstance): GetTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
  }
  
  extension [Self <: GetTrafficPolicyInstanceResponse](x: Self) {
    
    inline def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = StObject.set(x, "TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
}
