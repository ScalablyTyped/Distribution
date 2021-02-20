package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTargetWithMaintenanceWindowRequest extends StObject {
  
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.ssmMod.ClientToken] = js.native
  
  /**
    * An optional description for the target.
    */
  var Description: js.UndefOr[MaintenanceWindowDescription] = js.native
  
  /**
    * An optional name for the target.
    */
  var Name: js.UndefOr[MaintenanceWindowName] = js.native
  
  /**
    * User-provided value that will be included in any CloudWatch events raised while running tasks for these targets in this maintenance window.
    */
  var OwnerInformation: js.UndefOr[typings.awsSdk.ssmMod.OwnerInformation] = js.native
  
  /**
    * The type of target being registered with the maintenance window.
    */
  var ResourceType: MaintenanceWindowResourceType = js.native
  
  /**
    * The targets to register with the maintenance window. In other words, the instances to run commands on when the maintenance window runs. You can specify targets using instance IDs, resource group names, or tags that have been applied to instances.  Example 1: Specify instance IDs  Key=InstanceIds,Values=instance-id-1,instance-id-2,instance-id-3    Example 2: Use tag key-pairs applied to instances  Key=tag:my-tag-key,Values=my-tag-value-1,my-tag-value-2    Example 3: Use tag-keys applied to instances  Key=tag-key,Values=my-tag-key-1,my-tag-key-2    Example 4: Use resource group names  Key=resource-groups:Name,Values=resource-group-name    Example 5: Use filters for resource group types  Key=resource-groups:ResourceTypeFilters,Values=resource-type-1,resource-type-2    For Key=resource-groups:ResourceTypeFilters, specify resource types in the following format  Key=resource-groups:ResourceTypeFilters,Values=AWS::EC2::INSTANCE,AWS::EC2::VPC    For more information about these examples formats, including the best use case for each one, see Examples: Register targets with a maintenance window in the AWS Systems Manager User Guide.
    */
  var Targets: typings.awsSdk.ssmMod.Targets = js.native
  
  /**
    * The ID of the maintenance window the target should be registered with.
    */
  var WindowId: MaintenanceWindowId = js.native
}
object RegisterTargetWithMaintenanceWindowRequest {
  
  @scala.inline
  def apply(ResourceType: MaintenanceWindowResourceType, Targets: Targets, WindowId: MaintenanceWindowId): RegisterTargetWithMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit class RegisterTargetWithMaintenanceWindowRequestMutableBuilder[Self <: RegisterTargetWithMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: MaintenanceWindowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: MaintenanceWindowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerInformation(value: OwnerInformation): Self = StObject.set(x, "OwnerInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerInformationUndefined: Self = StObject.set(x, "OwnerInformation", js.undefined)
    
    @scala.inline
    def setResourceType(value: MaintenanceWindowResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
