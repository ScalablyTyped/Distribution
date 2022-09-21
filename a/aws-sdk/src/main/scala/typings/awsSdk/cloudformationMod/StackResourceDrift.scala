package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackResourceDrift extends StObject {
  
  /**
    * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present.
    */
  var ActualProperties: js.UndefOr[Properties] = js.undefined
  
  /**
    * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present.
    */
  var ExpectedProperties: js.UndefOr[Properties] = js.undefined
  
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typings.awsSdk.cloudformationMod.LogicalResourceId
  
  /**
    * Contains information about the module from which the resource was created, if the resource was created from a module included in the stack template.
    */
  var ModuleInfo: js.UndefOr[typings.awsSdk.cloudformationMod.ModuleInfo] = js.undefined
  
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * Context information that enables CloudFormation to uniquely identify a resource. CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs aren't enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
    */
  var PhysicalResourceIdContext: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceIdContext] = js.undefined
  
  /**
    * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED.
    */
  var PropertyDifferences: js.UndefOr[typings.awsSdk.cloudformationMod.PropertyDifferences] = js.undefined
  
  /**
    * The type of the resource.
    */
  var ResourceType: typings.awsSdk.cloudformationMod.ResourceType
  
  /**
    * The ID of the stack.
    */
  var StackId: typings.awsSdk.cloudformationMod.StackId
  
  /**
    * Status of the resource's actual configuration compared to its expected configuration.    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resource's actual configuration matches its expected template configuration.    NOT_CHECKED: CloudFormation does not currently return this value.  
    */
  var StackResourceDriftStatus: typings.awsSdk.cloudformationMod.StackResourceDriftStatus
  
  /**
    * Time at which CloudFormation performed drift detection on the stack resource.
    */
  var Timestamp: js.Date
}
object StackResourceDrift {
  
  inline def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceType: ResourceType,
    StackId: StackId,
    StackResourceDriftStatus: StackResourceDriftStatus,
    Timestamp: js.Date
  ): StackResourceDrift = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], StackResourceDriftStatus = StackResourceDriftStatus.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResourceDrift]
  }
  
  extension [Self <: StackResourceDrift](x: Self) {
    
    inline def setActualProperties(value: Properties): Self = StObject.set(x, "ActualProperties", value.asInstanceOf[js.Any])
    
    inline def setActualPropertiesUndefined: Self = StObject.set(x, "ActualProperties", js.undefined)
    
    inline def setExpectedProperties(value: Properties): Self = StObject.set(x, "ExpectedProperties", value.asInstanceOf[js.Any])
    
    inline def setExpectedPropertiesUndefined: Self = StObject.set(x, "ExpectedProperties", js.undefined)
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setModuleInfo(value: ModuleInfo): Self = StObject.set(x, "ModuleInfo", value.asInstanceOf[js.Any])
    
    inline def setModuleInfoUndefined: Self = StObject.set(x, "ModuleInfo", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdContext(value: PhysicalResourceIdContext): Self = StObject.set(x, "PhysicalResourceIdContext", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdContextUndefined: Self = StObject.set(x, "PhysicalResourceIdContext", js.undefined)
    
    inline def setPhysicalResourceIdContextVarargs(value: PhysicalResourceIdContextKeyValuePair*): Self = StObject.set(x, "PhysicalResourceIdContext", js.Array(value*))
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setPropertyDifferences(value: PropertyDifferences): Self = StObject.set(x, "PropertyDifferences", value.asInstanceOf[js.Any])
    
    inline def setPropertyDifferencesUndefined: Self = StObject.set(x, "PropertyDifferences", js.undefined)
    
    inline def setPropertyDifferencesVarargs(value: PropertyDifference*): Self = StObject.set(x, "PropertyDifferences", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackResourceDriftStatus(value: StackResourceDriftStatus): Self = StObject.set(x, "StackResourceDriftStatus", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
