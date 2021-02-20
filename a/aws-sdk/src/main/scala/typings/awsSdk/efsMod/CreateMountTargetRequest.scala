package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMountTargetRequest extends StObject {
  
  /**
    * The ID of the file system for which to create the mount target.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
  
  /**
    * Valid IPv4 address within the address range of the specified subnet.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.efsMod.IpAddress] = js.native
  
  /**
    * Up to five VPC security group IDs, of the form sg-xxxxxxxx. These must be for the same VPC as subnet specified.
    */
  var SecurityGroups: js.UndefOr[typings.awsSdk.efsMod.SecurityGroups] = js.native
  
  /**
    * The ID of the subnet to add the mount target in.
    */
  var SubnetId: typings.awsSdk.efsMod.SubnetId = js.native
}
object CreateMountTargetRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId, SubnetId: SubnetId): CreateMountTargetRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMountTargetRequest]
  }
  
  @scala.inline
  implicit class CreateMountTargetRequestMutableBuilder[Self <: CreateMountTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: SecurityGroups): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: SecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
