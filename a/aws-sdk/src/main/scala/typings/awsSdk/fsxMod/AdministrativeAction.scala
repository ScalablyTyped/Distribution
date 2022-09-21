package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeAction extends StObject {
  
  var AdministrativeActionType: js.UndefOr[typings.awsSdk.fsxMod.AdministrativeActionType] = js.undefined
  
  var FailureDetails: js.UndefOr[AdministrativeActionFailureDetails] = js.undefined
  
  /**
    * The percentage-complete status of a STORAGE_OPTIMIZATION administrative action. Does not apply to any other administrative action type.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.fsxMod.ProgressPercent] = js.undefined
  
  /**
    * The time that the administrative action request was received.
    */
  var RequestTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the status of the administrative action, as follows:    FAILED - Amazon FSx failed to process the administrative action successfully.    IN_PROGRESS - Amazon FSx is processing the administrative action.    PENDING - Amazon FSx is waiting to process the administrative action.    COMPLETED - Amazon FSx has finished processing the administrative task.    UPDATED_OPTIMIZING - For a storage-capacity increase update, Amazon FSx has updated the file system with the new storage capacity, and is now performing the storage-optimization process.   
    */
  var Status: js.UndefOr[typings.awsSdk.fsxMod.Status] = js.undefined
  
  /**
    * Describes the target value for the administration action, provided in the UpdateFileSystem operation. Returned for FILE_SYSTEM_UPDATE administrative actions. 
    */
  var TargetFileSystemValues: js.UndefOr[FileSystem] = js.undefined
  
  var TargetSnapshotValues: js.UndefOr[Snapshot] = js.undefined
  
  var TargetVolumeValues: js.UndefOr[Volume] = js.undefined
}
object AdministrativeAction {
  
  inline def apply(): AdministrativeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeAction]
  }
  
  extension [Self <: AdministrativeAction](x: Self) {
    
    inline def setAdministrativeActionType(value: AdministrativeActionType): Self = StObject.set(x, "AdministrativeActionType", value.asInstanceOf[js.Any])
    
    inline def setAdministrativeActionTypeUndefined: Self = StObject.set(x, "AdministrativeActionType", js.undefined)
    
    inline def setFailureDetails(value: AdministrativeActionFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    inline def setRequestTime(value: js.Date): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetFileSystemValues(value: FileSystem): Self = StObject.set(x, "TargetFileSystemValues", value.asInstanceOf[js.Any])
    
    inline def setTargetFileSystemValuesUndefined: Self = StObject.set(x, "TargetFileSystemValues", js.undefined)
    
    inline def setTargetSnapshotValues(value: Snapshot): Self = StObject.set(x, "TargetSnapshotValues", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotValuesUndefined: Self = StObject.set(x, "TargetSnapshotValues", js.undefined)
    
    inline def setTargetVolumeValues(value: Volume): Self = StObject.set(x, "TargetVolumeValues", value.asInstanceOf[js.Any])
    
    inline def setTargetVolumeValuesUndefined: Self = StObject.set(x, "TargetVolumeValues", js.undefined)
  }
}
