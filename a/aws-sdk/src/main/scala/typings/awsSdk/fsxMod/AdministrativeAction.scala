package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministrativeAction extends StObject {
  
  var AdministrativeActionType: js.UndefOr[typings.awsSdk.fsxMod.AdministrativeActionType] = js.native
  
  var FailureDetails: js.UndefOr[AdministrativeActionFailureDetails] = js.native
  
  /**
    * Provides the percent complete of a STORAGE_OPTIMIZATION administrative action. Does not apply to any other administrative action type.
    */
  var ProgressPercent: js.UndefOr[typings.awsSdk.fsxMod.ProgressPercent] = js.native
  
  /**
    * Time that the administrative action request was received.
    */
  var RequestTime: js.UndefOr[typings.awsSdk.fsxMod.RequestTime] = js.native
  
  /**
    * Describes the status of the administrative action, as follows:    FAILED - Amazon FSx failed to process the administrative action successfully.    IN_PROGRESS - Amazon FSx is processing the administrative action.    PENDING - Amazon FSx is waiting to process the administrative action.    COMPLETED - Amazon FSx has finished processing the administrative task.    UPDATED_OPTIMIZING - For a storage capacity increase update, Amazon FSx has updated the file system with the new storage capacity, and is now performing the storage optimization process. For more information, see Managing Storage Capacity.  
    */
  var Status: js.UndefOr[typings.awsSdk.fsxMod.Status] = js.native
  
  /**
    * Describes the target value for the administration action, provided in the UpdateFileSystem operation. Returned for FILE_SYSTEM_UPDATE administrative actions. 
    */
  var TargetFileSystemValues: js.UndefOr[FileSystem] = js.native
}
object AdministrativeAction {
  
  @scala.inline
  def apply(): AdministrativeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeAction]
  }
  
  @scala.inline
  implicit class AdministrativeActionMutableBuilder[Self <: AdministrativeAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdministrativeActionType(value: AdministrativeActionType): Self = StObject.set(x, "AdministrativeActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdministrativeActionTypeUndefined: Self = StObject.set(x, "AdministrativeActionType", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: AdministrativeActionFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = StObject.set(x, "ProgressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "ProgressPercent", js.undefined)
    
    @scala.inline
    def setRequestTime(value: RequestTime): Self = StObject.set(x, "RequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "RequestTime", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetFileSystemValues(value: FileSystem): Self = StObject.set(x, "TargetFileSystemValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFileSystemValuesUndefined: Self = StObject.set(x, "TargetFileSystemValues", js.undefined)
  }
}
