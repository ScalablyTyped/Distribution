package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationExecution extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The execution ID for the association.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.native
  
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[typings.awsSdk.ssmMod.ResourceCountByStatus] = js.native
  
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.native
}
object AssociationExecution {
  
  @scala.inline
  def apply(): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationExecution]
  }
  
  @scala.inline
  implicit class AssociationExecutionMutableBuilder[Self <: AssociationExecution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
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
    def setResourceCountByStatus(value: ResourceCountByStatus): Self = StObject.set(x, "ResourceCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceCountByStatusUndefined: Self = StObject.set(x, "ResourceCountByStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
