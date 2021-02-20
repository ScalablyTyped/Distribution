package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackResourceDetail extends StObject {
  
  /**
    * User defined description associated with the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.native
  
  /**
    * Time the status was updated.
    */
  var LastUpdatedTimestamp: Timestamp = js.native
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  
  /**
    * The content of the Metadata attribute declared for the resource. For more information, see Metadata Attribute in the AWS CloudFormation User Guide.
    */
  var Metadata: js.UndefOr[typings.awsSdk.cloudformationMod.Metadata] = js.native
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typings.awsSdk.cloudformationMod.ResourceStatus = js.native
  
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceStatusReason] = js.native
  
  /**
    * Type of resource. ((For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType = js.native
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.native
  
  /**
    * The name associated with the stack.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.native
}
object StackResourceDetail {
  
  @scala.inline
  def apply(
    LastUpdatedTimestamp: Timestamp,
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType
  ): StackResourceDetail = {
    val __obj = js.Dynamic.literal(LastUpdatedTimestamp = LastUpdatedTimestamp.asInstanceOf[js.Any], LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDetail]
  }
  
  @scala.inline
  implicit class StackResourceDetailMutableBuilder[Self <: StackResourceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDriftInformation(value: StackResourceDriftInformation): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    @scala.inline
    def setResourceStatus(value: ResourceStatus): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatusReason(value: ResourceStatusReason): Self = StObject.set(x, "ResourceStatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatusReasonUndefined: Self = StObject.set(x, "ResourceStatusReason", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
