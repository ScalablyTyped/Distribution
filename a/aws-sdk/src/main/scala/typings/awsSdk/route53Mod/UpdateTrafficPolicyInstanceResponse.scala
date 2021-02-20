package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrafficPolicyInstanceResponse extends StObject {
  
  /**
    * A complex type that contains settings for the updated traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}
object UpdateTrafficPolicyInstanceResponse {
  
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): UpdateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceResponse]
  }
  
  @scala.inline
  implicit class UpdateTrafficPolicyInstanceResponseMutableBuilder[Self <: UpdateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = StObject.set(x, "TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
}
