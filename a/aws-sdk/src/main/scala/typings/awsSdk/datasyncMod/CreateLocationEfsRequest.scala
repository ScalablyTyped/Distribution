package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationEfsRequest extends StObject {
  
  /**
    * The subnet and security group that the Amazon EFS file system uses. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified. The exact relationship between security group M (of the mount target) and security group S (which you provide for DataSync to use at this stage) is as follows:     Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address (CIDR range) or security group.    Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS port on one of the file system’s mount targets. You can enable outbound connections either by IP address (CIDR range) or security group. For information about security groups and mount targets, see Security Groups for Amazon EC2 Instances and Mount Targets in the Amazon EFS User Guide.   
    */
  var Ec2Config: typings.awsSdk.datasyncMod.Ec2Config
  
  /**
    * The Amazon Resource Name (ARN) for the Amazon EFS file system.
    */
  var EfsFilesystemArn: typings.awsSdk.datasyncMod.EfsFilesystemArn
  
  /**
    * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.   Subdirectory must be specified with forward slashes. For example, /path/to/folder. 
    */
  var Subdirectory: js.UndefOr[EfsSubdirectory] = js.undefined
  
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationEfsRequest {
  
  @scala.inline
  def apply(Ec2Config: Ec2Config, EfsFilesystemArn: EfsFilesystemArn): CreateLocationEfsRequest = {
    val __obj = js.Dynamic.literal(Ec2Config = Ec2Config.asInstanceOf[js.Any], EfsFilesystemArn = EfsFilesystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationEfsRequest]
  }
  
  @scala.inline
  implicit class CreateLocationEfsRequestMutableBuilder[Self <: CreateLocationEfsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEc2Config(value: Ec2Config): Self = StObject.set(x, "Ec2Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEfsFilesystemArn(value: EfsFilesystemArn): Self = StObject.set(x, "EfsFilesystemArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectory(value: EfsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    @scala.inline
    def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
