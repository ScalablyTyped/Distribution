package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAssociationStatusInfo extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.undefined
  
  /**
    * The name of the association applied to the managed node.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.undefined
  
  /**
    * The version of the association applied to the managed node.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.undefined
  
  /**
    * Detailed status information about the association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  
  /**
    * The association document versions.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined
  
  /**
    * The date the association ran. 
    */
  var ExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined
  
  /**
    * The managed node ID where the association was created.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * A URL for an S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined
  
  /**
    * Status information about the association.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
}
object InstanceAssociationStatusInfo {
  
  inline def apply(): InstanceAssociationStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
  
  extension [Self <: InstanceAssociationStatusInfo](x: Self) {
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    inline def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setDetailedStatus(value: StatusName): Self = StObject.set(x, "DetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setDetailedStatusUndefined: Self = StObject.set(x, "DetailedStatus", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setErrorCode(value: AgentErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setExecutionDate(value: js.Date): Self = StObject.set(x, "ExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setExecutionDateUndefined: Self = StObject.set(x, "ExecutionDate", js.undefined)
    
    inline def setExecutionSummary(value: InstanceAssociationExecutionSummary): Self = StObject.set(x, "ExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummaryUndefined: Self = StObject.set(x, "ExecutionSummary", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputUrl(value: InstanceAssociationOutputUrl): Self = StObject.set(x, "OutputUrl", value.asInstanceOf[js.Any])
    
    inline def setOutputUrlUndefined: Self = StObject.set(x, "OutputUrl", js.undefined)
    
    inline def setStatus(value: StatusName): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
