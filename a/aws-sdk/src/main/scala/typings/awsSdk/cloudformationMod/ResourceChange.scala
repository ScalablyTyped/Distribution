package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceChange extends js.Object {
  
  /**
    * The action that AWS CloudFormation takes on the resource, such as Add (adds a new resource), Modify (changes a resource), Remove (deletes a resource), Import (imports a resource), or Dynamic (exact action for the resource cannot be determined).
    */
  var Action: js.UndefOr[ChangeAction] = js.native
  
  /**
    * The change set ID of the nested change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.cloudformationMod.ChangeSetId] = js.native
  
  /**
    * For the Modify action, a list of ResourceChangeDetail structures that describes the changes that AWS CloudFormation will make to the resource. 
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.native
  
  /**
    * The resource's logical ID, which is defined in the stack's template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceId] = js.native
  
  /**
    * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they haven't been created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  
  /**
    * For the Modify action, indicates whether AWS CloudFormation will replace the resource by creating a new one and deleting the old one. This value depends on the value of the RequiresRecreation property in the ResourceTargetDefinition structure. For example, if the RequiresRecreation field is Always and the Evaluation field is Static, Replacement is True. If the RequiresRecreation field is Always and the Evaluation field is Dynamic, Replacement is Conditionally. If you have multiple changes with different RequiresRecreation values, the Replacement value depends on the change with the most impact. A RequiresRecreation value of Always has the most impact, followed by Conditionally, and then Never.
    */
  var Replacement: js.UndefOr[typings.awsSdk.cloudformationMod.Replacement] = js.native
  
  /**
    * The type of AWS CloudFormation resource, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceType] = js.native
  
  /**
    * For the Modify action, indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Scope: js.UndefOr[typings.awsSdk.cloudformationMod.Scope] = js.native
}
object ResourceChange {
  
  @scala.inline
  def apply(): ResourceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChange]
  }
  
  @scala.inline
  implicit class ResourceChangeOps[Self <: ResourceChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setChangeSetId(value: ChangeSetId): Self = this.set("ChangeSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSetId: Self = this.set("ChangeSetId", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: ResourceChangeDetail*): Self = this.set("Details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: ResourceChangeDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    
    @scala.inline
    def setLogicalResourceId(value: LogicalResourceId): Self = this.set("LogicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalResourceId: Self = this.set("LogicalResourceId", js.undefined)
    
    @scala.inline
    def setPhysicalResourceId(value: PhysicalResourceId): Self = this.set("PhysicalResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalResourceId: Self = this.set("PhysicalResourceId", js.undefined)
    
    @scala.inline
    def setReplacement(value: Replacement): Self = this.set("Replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacement: Self = this.set("Replacement", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: ResourceAttribute*): Self = this.set("Scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: Scope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
  }
}
