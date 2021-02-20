package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackResourceDrift extends StObject {
  
  /**
    * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ActualProperties: js.UndefOr[Properties] = js.native
  
  /**
    * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters.  For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
    */
  var ExpectedProperties: js.UndefOr[Properties] = js.native
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId = js.native
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. 
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  
  /**
    * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
    */
  var PhysicalResourceIdContext: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceIdContext] = js.native
  
  /**
    * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED. 
    */
  var PropertyDifferences: js.UndefOr[typings.awsSdk.cloudformationMod.PropertyDifferences] = js.native
  
  /**
    * The type of the resource.
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType = js.native
  
  /**
    * The ID of the stack.
    */
  var StackId: typings.awsSdk.cloudformationMod.StackId = js.native
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus = js.native
  
  /**
    * Time at which AWS CloudFormation performed drift detection on the stack resource.
    */
  var Timestamp: typings.awsSdk.cloudformationMod.Timestamp = js.native
}
object StackResourceDrift {
  
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceType: ResourceType,
    StackId: StackId,
    StackResourceDriftStatus: StackResourceDriftStatus,
    Timestamp: Timestamp
  ): StackResourceDrift = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDrift]
  }
  
  @scala.inline
  implicit class StackResourceDriftMutableBuilder[Self <: StackResourceDrift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualProperties(value: Properties): Self = StObject.set(x, "ActualProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualPropertiesUndefined: Self = StObject.set(x, "ActualProperties", js.undefined)
    
    @scala.inline
    def setExpectedProperties(value: Properties): Self = StObject.set(x, "ExpectedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPropertiesUndefined: Self = StObject.set(x, "ExpectedProperties", js.undefined)
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceIdContext(value: PhysicalResourceIdContext): Self = StObject.set(x, "PhysicalResourceIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceIdContextUndefined: Self = StObject.set(x, "PhysicalResourceIdContext", js.undefined)
    
    @scala.inline
    def setPhysicalResourceIdContextVarargs(value: PhysicalResourceIdContextKeyValuePair*): Self = StObject.set(x, "PhysicalResourceIdContext", js.Array(value :_*))
    
    @scala.inline
    def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    @scala.inline
    def setPropertyDifferences(value: PropertyDifferences): Self = StObject.set(x, "PropertyDifferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyDifferencesUndefined: Self = StObject.set(x, "PropertyDifferences", js.undefined)
    
    @scala.inline
    def setPropertyDifferencesVarargs(value: PropertyDifference*): Self = StObject.set(x, "PropertyDifferences", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = StObject.set(x, "StackResourceDriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
