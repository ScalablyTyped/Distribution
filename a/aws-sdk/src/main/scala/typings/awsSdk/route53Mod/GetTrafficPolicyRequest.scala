package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrafficPolicyRequest extends StObject {
  
  /**
    * The ID of the traffic policy that you want to get information about.
    */
  var Id: TrafficPolicyId
  
  /**
    * The version number of the traffic policy that you want to get information about.
    */
  var Version: TrafficPolicyVersion
}
object GetTrafficPolicyRequest {
  
  inline def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): GetTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyRequest]
  }
  
  extension [Self <: GetTrafficPolicyRequest](x: Self) {
    
    inline def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
