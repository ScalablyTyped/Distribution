package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministrativeAction extends js.Object {
  var AdministrativeActionType: js.UndefOr[typings.awsSdk.fsxMod.AdministrativeActionType] = js.native
  var FailureDetails: js.UndefOr[AdministrativeActionFailureDetails] = js.native
  /**
    * Provides the percent complete of a STORAGE_OPTIMIZATION administrative action.
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
    * Describes the target StorageCapacity or ThroughputCapacity value provided in the UpdateFileSystem operation. Returned for FILE_SYSTEM_UPDATE administrative actions. 
    */
  var TargetFileSystemValues: js.UndefOr[FileSystem] = js.native
}

object AdministrativeAction {
  @scala.inline
  def apply(
    AdministrativeActionType: AdministrativeActionType = null,
    FailureDetails: AdministrativeActionFailureDetails = null,
    ProgressPercent: js.UndefOr[ProgressPercent] = js.undefined,
    RequestTime: RequestTime = null,
    Status: Status = null,
    TargetFileSystemValues: FileSystem = null
  ): AdministrativeAction = {
    val __obj = js.Dynamic.literal()
    if (AdministrativeActionType != null) __obj.updateDynamic("AdministrativeActionType")(AdministrativeActionType.asInstanceOf[js.Any])
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(ProgressPercent)) __obj.updateDynamic("ProgressPercent")(ProgressPercent.get.asInstanceOf[js.Any])
    if (RequestTime != null) __obj.updateDynamic("RequestTime")(RequestTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetFileSystemValues != null) __obj.updateDynamic("TargetFileSystemValues")(TargetFileSystemValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrativeAction]
  }
}

