package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficPolicySummary extends StObject {
  
  /**
    * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
    */
  var Id: TrafficPolicyId
  
  /**
    * The version number of the latest version of the traffic policy.
    */
  var LatestVersion: TrafficPolicyVersion
  
  /**
    * The name that you specified for the traffic policy when you created it.
    */
  var Name: TrafficPolicyName
  
  /**
    * The number of traffic policies that are associated with the current Amazon Web Services account.
    */
  var TrafficPolicyCount: TrafficPolicyVersion
  
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType
}
object TrafficPolicySummary {
  
  inline def apply(
    Id: TrafficPolicyId,
    LatestVersion: TrafficPolicyVersion,
    Name: TrafficPolicyName,
    TrafficPolicyCount: TrafficPolicyVersion,
    Type: RRType
  ): TrafficPolicySummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LatestVersion = LatestVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TrafficPolicyCount = TrafficPolicyCount.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficPolicySummary]
  }
  
  extension [Self <: TrafficPolicySummary](x: Self) {
    
    inline def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLatestVersion(value: TrafficPolicyVersion): Self = StObject.set(x, "LatestVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: TrafficPolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyCount(value: TrafficPolicyVersion): Self = StObject.set(x, "TrafficPolicyCount", value.asInstanceOf[js.Any])
    
    inline def setType(value: RRType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
