package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecutionTarget extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typings.awsSdk.ssmMod.OutputSource] = js.native
  
  /**
    * The resource ID, for example, the instance ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.native
  
  /**
    * The resource type, for example, instance.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.native
  
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.native
}
object AssociationExecutionTarget {
  
  @scala.inline
  def apply(): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
  
  @scala.inline
  implicit class AssociationExecutionTargetMutableBuilder[Self <: AssociationExecutionTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    @scala.inline
    def setExecutionId(value: AssociationExecutionId): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
    
    @scala.inline
    def setLastExecutionDate(value: DateTime): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    @scala.inline
    def setOutputSource(value: OutputSource): Self = StObject.set(x, "OutputSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSourceUndefined: Self = StObject.set(x, "OutputSource", js.undefined)
    
    @scala.inline
    def setResourceId(value: AssociationResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: AssociationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
