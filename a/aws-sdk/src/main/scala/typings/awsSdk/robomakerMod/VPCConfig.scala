package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCConfig extends StObject {
  
  /**
    * A boolean indicating whether to assign a public IP address.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of one or more security groups IDs in your VPC.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
  
  /**
    * A list of one or more subnet IDs in your VPC.
    */
  var subnets: Subnets
}
object VPCConfig {
  
  @scala.inline
  def apply(subnets: Subnets): VPCConfig = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCConfig]
  }
  
  @scala.inline
  implicit class VPCConfigMutableBuilder[Self <: VPCConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignPublicIp(value: Boolean): Self = StObject.set(x, "assignPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignPublicIpUndefined: Self = StObject.set(x, "assignPublicIp", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "subnets", js.Array(value :_*))
  }
}
