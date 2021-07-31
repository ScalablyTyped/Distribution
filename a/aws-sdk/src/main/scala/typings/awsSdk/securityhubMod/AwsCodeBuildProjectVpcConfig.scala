package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectVpcConfig extends StObject {
  
  /**
    * A list of one or more security group IDs in your Amazon VPC.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * A list of one or more subnet IDs in your Amazon VPC.
    */
  var Subnets: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectVpcConfig {
  
  @scala.inline
  def apply(): AwsCodeBuildProjectVpcConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectVpcConfig]
  }
  
  @scala.inline
  implicit class AwsCodeBuildProjectVpcConfigMutableBuilder[Self <: AwsCodeBuildProjectVpcConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupIds(value: NonEmptyStringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: NonEmptyStringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "Subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Subnets", js.Array(value :_*))
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
