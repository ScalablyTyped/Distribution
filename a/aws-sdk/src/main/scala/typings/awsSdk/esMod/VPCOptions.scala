package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCOptions extends StObject {
  
  /**
    * Specifies the security groups for VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the subnets for VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
}
object VPCOptions {
  
  @scala.inline
  def apply(): VPCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCOptions]
  }
  
  @scala.inline
  implicit class VPCOptionsMutableBuilder[Self <: VPCOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: StringList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
