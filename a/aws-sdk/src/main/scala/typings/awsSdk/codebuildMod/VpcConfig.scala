package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfig extends StObject {
  
  /**
    * A list of one or more security groups IDs in your Amazon VPC.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * A list of one or more subnet IDs in your Amazon VPC.
    */
  var subnets: js.UndefOr[Subnets] = js.undefined
  
  /**
    * The ID of the Amazon VPC.
    */
  var vpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object VpcConfig {
  
  @scala.inline
  def apply(): VpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConfig]
  }
  
  @scala.inline
  implicit class VpcConfigMutableBuilder[Self <: VpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: Subnets): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
