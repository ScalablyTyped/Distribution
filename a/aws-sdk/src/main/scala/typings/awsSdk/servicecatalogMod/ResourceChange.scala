package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceChange extends js.Object {
  
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.native
  
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.native
  
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.LogicalResourceId] = js.native
  
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.PhysicalResourceId] = js.native
  
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[typings.awsSdk.servicecatalogMod.Replacement] = js.native
  
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.native
  
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[typings.awsSdk.servicecatalogMod.Scope] = js.native
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
    def setResourceType(value: PlanResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
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
