package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChange extends StObject {
  
  /**
    * The action that CloudFormation takes on the resource, such as Add (adds a new resource), Modify (changes a resource), Remove (deletes a resource), Import (imports a resource), or Dynamic (exact action for the resource can't be determined).
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * The change set ID of the nested change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.undefined
  
  /**
    * For the Modify action, a list of ResourceChangeDetail structures that describes the changes that CloudFormation will make to the resource.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
  
  /**
    * The resource's logical ID, which is defined in the stack's template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceId] = js.undefined
  
  /**
    * Contains information about the module from which the resource was created, if the resource was created from a module included in the stack template.
    */
  var ModuleInfo: js.UndefOr[typings.awsSdk.cloudformationMod.ModuleInfo] = js.undefined
  
  /**
    * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they haven't been created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * For the Modify action, indicates whether CloudFormation will replace the resource by creating a new one and deleting the old one. This value depends on the value of the RequiresRecreation property in the ResourceTargetDefinition structure. For example, if the RequiresRecreation field is Always and the Evaluation field is Static, Replacement is True. If the RequiresRecreation field is Always and the Evaluation field is Dynamic, Replacement is Conditionally. If you have multiple changes with different RequiresRecreation values, the Replacement value depends on the change with the most impact. A RequiresRecreation value of Always has the most impact, followed by Conditionally, and then Never.
    */
  var Replacement: js.UndefOr[typings.awsSdk.cloudformationMod.Replacement] = js.undefined
  
  /**
    * The type of CloudFormation resource, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceType] = js.undefined
  
  /**
    * For the Modify action, indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Scope: js.UndefOr[typings.awsSdk.cloudformationMod.Scope] = js.undefined
}
object ResourceChange {
  
  inline def apply(): ResourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChange]
  }
  
  extension [Self <: ResourceChange](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    inline def setDetails(value: ResourceChangeDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setDetailsVarargs(value: ResourceChangeDetail*): Self = StObject.set(x, "Details", js.Array(value*))
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "LogicalResourceId", js.undefined)
    
    inline def setModuleInfo(value: ModuleInfo): Self = StObject.set(x, "ModuleInfo", value.asInstanceOf[js.Any])
    
    inline def setModuleInfoUndefined: Self = StObject.set(x, "ModuleInfo", js.undefined)
    
    inline def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    inline def setReplacement(value: Replacement): Self = StObject.set(x, "Replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementUndefined: Self = StObject.set(x, "Replacement", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setScopeVarargs(value: ResourceAttribute*): Self = StObject.set(x, "Scope", js.Array(value*))
  }
}
