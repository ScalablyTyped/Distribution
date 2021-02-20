package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAssociationStatusInfo extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.native
  
  /**
    * The name of the association applied to the instance.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.native
  
  /**
    * The version of the association applied to the instance.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.native
  
  /**
    * Detailed status information about the instance association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  
  /**
    * The association document versions.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.native
  
  /**
    * The date the instance association ran. 
    */
  var ExecutionDate: js.UndefOr[DateTime] = js.native
  
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.native
  
  /**
    * The instance ID where the association was created.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  
  /**
    * A URL for an S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.native
  
  /**
    * Status information about the instance association.
    */
  var Status: js.UndefOr[StatusName] = js.native
}
object InstanceAssociationStatusInfo {
  
  @scala.inline
  def apply(): InstanceAssociationStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
  
  @scala.inline
  implicit class InstanceAssociationStatusInfoMutableBuilder[Self <: InstanceAssociationStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    @scala.inline
    def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setErrorCode(value: AgentErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setExecutionDate(value: DateTime): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionDateUndefined: Self = StObject.set(x, "ExecutionDate", js.undefined)
    
    @scala.inline
    def setExecutionSummary(value: InstanceAssociationExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionSummaryUndefined: Self = StObject.set(x, "ExecutionSummary", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputUrl(value: InstanceAssociationOutputUrl): Self = StObject.set(x, "OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUrlUndefined: Self = StObject.set(x, "OutputUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
