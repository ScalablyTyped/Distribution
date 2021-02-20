package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrafficPolicyInstanceCountResponse extends StObject {
  
  /**
    * The number of traffic policy instances that are associated with the current AWS account.
    */
  var TrafficPolicyInstanceCount: typings.awsSdk.route53Mod.TrafficPolicyInstanceCount = js.native
}
object GetTrafficPolicyInstanceCountResponse {
  
  @scala.inline
  def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
  
  @scala.inline
  implicit class GetTrafficPolicyInstanceCountResponseMutableBuilder[Self <: GetTrafficPolicyInstanceCountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficPolicyInstanceCount(value: TrafficPolicyInstanceCount): Self = StObject.set(x, "TrafficPolicyInstanceCount", value.asInstanceOf[js.Any])
  }
}
