package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceSecurityGroup extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkInterfaceSecurityGroup {
  
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceSecurityGroup]
  }
  
  @scala.inline
  implicit class AwsEc2NetworkInterfaceSecurityGroupMutableBuilder[Self <: AwsEc2NetworkInterfaceSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: NonEmptyString): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
