package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchSummary extends js.Object {
  
  /**
    * The number of patches from the compliance standard that failed to install.
    */
  var FailedCount: js.UndefOr[Integer] = js.native
  
  /**
    * The identifier of the compliance standard that was used to determine the patch compliance status.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The number of patches from the compliance standard that were installed successfully.
    */
  var InstalledCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of installed patches that are not part of the compliance standard.
    */
  var InstalledOtherCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that were applied, but that require the instance to be rebooted in order to be marked as installed.
    */
  var InstalledPendingReboot: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that are installed but are also on a list of patches that the customer rejected.
    */
  var InstalledRejectedCount: js.UndefOr[Integer] = js.native
  
  /**
    * The number of patches that are part of the compliance standard but are not installed. The count includes patches that failed to install.
    */
  var MissingCount: js.UndefOr[Integer] = js.native
  
  /**
    * The type of patch operation performed. For Patch Manager, the values are SCAN and INSTALL. 
    */
  var Operation: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the operation completed. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationEndTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the operation started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var OperationStartTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The reboot option specified for the instance.
    */
  var RebootOption: js.UndefOr[NonEmptyString] = js.native
}
object PatchSummary {
  
  @scala.inline
  def apply(Id: NonEmptyString): PatchSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchSummary]
  }
  
  @scala.inline
  implicit class PatchSummaryOps[Self <: PatchSummary] (val x: Self) extends AnyVal {
    
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
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedCount(value: Integer): Self = this.set("FailedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedCount: Self = this.set("FailedCount", js.undefined)
    
    @scala.inline
    def setInstalledCount(value: Integer): Self = this.set("InstalledCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledCount: Self = this.set("InstalledCount", js.undefined)
    
    @scala.inline
    def setInstalledOtherCount(value: Integer): Self = this.set("InstalledOtherCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledOtherCount: Self = this.set("InstalledOtherCount", js.undefined)
    
    @scala.inline
    def setInstalledPendingReboot(value: Integer): Self = this.set("InstalledPendingReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledPendingReboot: Self = this.set("InstalledPendingReboot", js.undefined)
    
    @scala.inline
    def setInstalledRejectedCount(value: Integer): Self = this.set("InstalledRejectedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstalledRejectedCount: Self = this.set("InstalledRejectedCount", js.undefined)
    
    @scala.inline
    def setMissingCount(value: Integer): Self = this.set("MissingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingCount: Self = this.set("MissingCount", js.undefined)
    
    @scala.inline
    def setOperation(value: NonEmptyString): Self = this.set("Operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperation: Self = this.set("Operation", js.undefined)
    
    @scala.inline
    def setOperationEndTime(value: NonEmptyString): Self = this.set("OperationEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationEndTime: Self = this.set("OperationEndTime", js.undefined)
    
    @scala.inline
    def setOperationStartTime(value: NonEmptyString): Self = this.set("OperationStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationStartTime: Self = this.set("OperationStartTime", js.undefined)
    
    @scala.inline
    def setRebootOption(value: NonEmptyString): Self = this.set("RebootOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebootOption: Self = this.set("RebootOption", js.undefined)
  }
}
