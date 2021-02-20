package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTrafficPolicyInstanceRequest extends StObject {
  
  /**
    * The ID of the traffic policy instance that you want to update.
    */
  var Id: TrafficPolicyInstanceId = js.native
  
  /**
    * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
    */
  var TTL: typings.awsSdk.route53Mod.TTL = js.native
  
  /**
    * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyId: typings.awsSdk.route53Mod.TrafficPolicyId = js.native
  
  /**
    * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyVersion: typings.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}
object UpdateTrafficPolicyInstanceRequest {
  
  @scala.inline
  def apply(
    Id: TrafficPolicyInstanceId,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): UpdateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateTrafficPolicyInstanceRequestMutableBuilder[Self <: UpdateTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: TrafficPolicyInstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTTL(value: TTL): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyId(value: TrafficPolicyId): Self = StObject.set(x, "TrafficPolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "TrafficPolicyVersion", value.asInstanceOf[js.Any])
  }
}
