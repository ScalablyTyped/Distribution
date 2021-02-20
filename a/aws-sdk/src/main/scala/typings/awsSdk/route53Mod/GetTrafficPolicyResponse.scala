package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTrafficPolicyResponse extends StObject {
  
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy = js.native
}
object GetTrafficPolicyResponse {
  
  @scala.inline
  def apply(TrafficPolicy: TrafficPolicy): GetTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyResponse]
  }
  
  @scala.inline
  implicit class GetTrafficPolicyResponseMutableBuilder[Self <: GetTrafficPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficPolicy(value: TrafficPolicy): Self = StObject.set(x, "TrafficPolicy", value.asInstanceOf[js.Any])
  }
}
