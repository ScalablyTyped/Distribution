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
  def apply(): AdministrativeAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeAction]
  }
  @scala.inline
  implicit class AdministrativeActionOps[Self <: AdministrativeAction] (val x: Self) extends AnyVal {
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
    def setAdministrativeActionType(value: AdministrativeActionType): Self = this.set("AdministrativeActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrativeActionType: Self = this.set("AdministrativeActionType", js.undefined)
    @scala.inline
    def setFailureDetails(value: AdministrativeActionFailureDetails): Self = this.set("FailureDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureDetails: Self = this.set("FailureDetails", js.undefined)
    @scala.inline
    def setProgressPercent(value: ProgressPercent): Self = this.set("ProgressPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressPercent: Self = this.set("ProgressPercent", js.undefined)
    @scala.inline
    def setRequestTime(value: RequestTime): Self = this.set("RequestTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTime: Self = this.set("RequestTime", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTargetFileSystemValues(value: FileSystem): Self = this.set("TargetFileSystemValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetFileSystemValues: Self = this.set("TargetFileSystemValues", js.undefined)
  }
  
}

