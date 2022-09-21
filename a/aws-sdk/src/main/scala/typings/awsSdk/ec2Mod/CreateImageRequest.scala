package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageRequest extends StObject {
  
  /**
    * The block device mappings. This parameter cannot be used to modify the encryption status of existing volumes or snapshots. To create an AMI with encrypted snapshots, use the CopyImage action.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined
  
  /**
    * A description for the new image.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId
  
  /**
    * A name for the new image. Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
    */
  var Name: String
  
  /**
    * By default, when Amazon EC2 creates the new AMI, it reboots the instance so that it can take snapshots of the attached volumes while data is at rest, in order to ensure a consistent state. You can set the NoReboot parameter to true in the API request, or use the --no-reboot option in the CLI to prevent Amazon EC2 from shutting down and rebooting the instance.  If you choose to bypass the shutdown and reboot process by setting the NoReboot parameter to true in the API request, or by using the --no-reboot option in the CLI, we can't guarantee the file system integrity of the created image.  Default: false (follow standard reboot process)
    */
  var NoReboot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags to apply to the AMI and snapshots on creation. You can tag the AMI, the snapshots, or both.   To tag the AMI, the value for ResourceType must be image.   To tag the snapshots that are created of the root volume and of other Amazon EBS volumes that are attached to the instance, the value for ResourceType must be snapshot. The same tag is applied to all of the snapshots that are created.   If you specify other values for ResourceType, the request fails. To tag an AMI or snapshot after it has been created, see CreateTags. 
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateImageRequest {
  
  inline def apply(InstanceId: InstanceId, Name: String): CreateImageRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
  
  extension [Self <: CreateImageRequest](x: Self) {
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingRequestList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNoReboot(value: Boolean): Self = StObject.set(x, "NoReboot", value.asInstanceOf[js.Any])
    
    inline def setNoRebootUndefined: Self = StObject.set(x, "NoReboot", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
