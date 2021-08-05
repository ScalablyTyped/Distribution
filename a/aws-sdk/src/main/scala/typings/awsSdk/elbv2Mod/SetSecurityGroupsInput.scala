package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSecurityGroupsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn
  
  /**
    * The IDs of the security groups.
    */
  var SecurityGroups: typings.awsSdk.elbv2Mod.SecurityGroups
}
object SetSecurityGroupsInput {
  
  inline def apply(LoadBalancerArn: LoadBalancerArn, SecurityGroups: SecurityGroups): SetSecurityGroupsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSecurityGroupsInput]
  }
  
  extension [Self <: SetSecurityGroupsInput](x: Self) {
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
  }
}
