package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChange extends StObject {
  
  /**
    * The change action.
    */
  var Action: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * Information about the resource changes.
    */
  var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
  
  /**
    * The ID of the resource, as defined in the CloudFormation template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.LogicalResourceId] = js.undefined
  
  /**
    * The ID of the resource, if it was already created.
    */
  var PhysicalResourceId: js.UndefOr[typings.awsSdk.servicecatalogMod.PhysicalResourceId] = js.undefined
  
  /**
    * If the change type is Modify, indicates whether the existing resource is deleted and replaced with a new one.
    */
  var Replacement: js.UndefOr[typings.awsSdk.servicecatalogMod.Replacement] = js.undefined
  
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[PlanResourceType] = js.undefined
  
  /**
    * The change scope.
    */
  var Scope: js.UndefOr[typings.awsSdk.servicecatalogMod.Scope] = js.undefined
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
    def setResourceType(value: PlanResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
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
