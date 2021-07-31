package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicalConnectionRequirements extends StObject {
  
  /**
    * The connection's Availability Zone. This field is redundant because the specified subnet implies the Availability Zone to be used. Currently the field must be populated, but it will be deprecated in the future.
    */
  var AvailabilityZone: js.UndefOr[NameString] = js.undefined
  
  /**
    * The security group ID list used by the connection.
    */
  var SecurityGroupIdList: js.UndefOr[typings.awsSdk.glueMod.SecurityGroupIdList] = js.undefined
  
  /**
    * The subnet ID used by the connection.
    */
  var SubnetId: js.UndefOr[NameString] = js.undefined
}
object PhysicalConnectionRequirements {
  
  @scala.inline
  def apply(): PhysicalConnectionRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalConnectionRequirements]
  }
  
  @scala.inline
  implicit class PhysicalConnectionRequirementsMutableBuilder[Self <: PhysicalConnectionRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: NameString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdList(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdListUndefined: Self = StObject.set(x, "SecurityGroupIdList", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdListVarargs(value: NameString*): Self = StObject.set(x, "SecurityGroupIdList", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: NameString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
