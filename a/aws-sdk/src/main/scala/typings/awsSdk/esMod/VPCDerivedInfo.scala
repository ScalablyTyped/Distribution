package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VPCDerivedInfo extends StObject {
  
  /**
    * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the security groups for VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * Specifies the subnets for VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var VPCId: js.UndefOr[String] = js.undefined
}
object VPCDerivedInfo {
  
  @scala.inline
  def apply(): VPCDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCDerivedInfo]
  }
  
  @scala.inline
  implicit class VPCDerivedInfoMutableBuilder[Self <: VPCDerivedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
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
    
    @scala.inline
    def setVPCId(value: String): Self = StObject.set(x, "VPCId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCIdUndefined: Self = StObject.set(x, "VPCId", js.undefined)
  }
}
