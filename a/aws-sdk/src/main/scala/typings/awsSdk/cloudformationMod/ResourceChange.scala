package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChange extends StObject {
  
  /**
    * The action that AWS CloudFormation takes on the resource, such as Add (adds a new resource), Modify (changes a resource), Remove (deletes a resource), Import (imports a resource), or Dynamic (exact action for the resource cannot be determined).
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * The change set ID of the nested change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.undefined
  
  /**
    * For the Modify action, a list of ResourceChangeDetail structures that describes the changes that AWS CloudFormation will make to the resource. 
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
  
  /**
    * The resource's logical ID, which is defined in the stack's template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceId] = js.undefined
  
  /**
    * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they haven't been created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.undefined
  
  /**
    * For the Modify action, indicates whether AWS CloudFormation will replace the resource by creating a new one and deleting the old one. This value depends on the value of the RequiresRecreation property in the ResourceTargetDefinition structure. For example, if the RequiresRecreation field is Always and the Evaluation field is Static, Replacement is True. If the RequiresRecreation field is Always and the Evaluation field is Dynamic, Replacement is Conditionally. If you have multiple changes with different RequiresRecreation values, the Replacement value depends on the change with the most impact. A RequiresRecreation value of Always has the most impact, followed by Conditionally, and then Never.
    */
  var Replacement: js.UndefOr[typings.awsSdk.cloudformationMod.Replacement] = js.undefined
  
  /**
    * The type of AWS CloudFormation resource, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceType] = js.undefined
  
  /**
    * For the Modify action, indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Scope: js.UndefOr[typings.awsSdk.cloudformationMod.Scope] = js.undefined
}
object ResourceChange {
  
  @scala.inline
  def apply(): ResourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChange]
  }
  
  @scala.inline
  implicit class ResourceChangeMutableBuilder[Self <: ResourceChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    @scala.inline
    def setDetails(value: ResourceChangeDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: ResourceChangeDetail*): Self = StObject.set(x, "Details", js.Array(value :_*))
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceIdUndefined: Self = StObject.set(x, "LogicalResourceId", js.undefined)
    
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = StObject.set(x, "PhysicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalResourceIdUndefined: Self = StObject.set(x, "PhysicalResourceId", js.undefined)
    
    @scala.inline
    def setReplacement(value: Replacement): Self = StObject.set(x, "Replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementUndefined: Self = StObject.set(x, "Replacement", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: ResourceAttribute*): Self = StObject.set(x, "Scope", js.Array(value :_*))
  }
}
