package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchGroupStateResult extends js.Object {
  /**
    * The number of instances in the patch group.
    */
  var Instances: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches from the patch baseline that failed to install.
    */
  var InstancesWithFailedPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches installed that aren't defined in the patch baseline.
    */
  var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with installed patches.
    */
  var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.
    */
  var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.native
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
    */
  var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.native
  /**
    * The number of instances with missing patches from the patch baseline.
    */
  var InstancesWithMissingPatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with patches that aren't applicable.
    */
  var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.native
  /**
    * The number of instances with NotApplicable patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.
    */
  var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.native
}

object DescribePatchGroupStateResult {
  @scala.inline
  def apply(): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
  @scala.inline
  implicit class DescribePatchGroupStateResultOps[Self <: DescribePatchGroupStateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstances(value: Integer): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setInstancesWithFailedPatches(value: Integer): Self = this.set("InstancesWithFailedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithFailedPatches: Self = this.set("InstancesWithFailedPatches", js.undefined)
    @scala.inline
    def setInstancesWithInstalledOtherPatches(value: Integer): Self = this.set("InstancesWithInstalledOtherPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithInstalledOtherPatches: Self = this.set("InstancesWithInstalledOtherPatches", js.undefined)
    @scala.inline
    def setInstancesWithInstalledPatches(value: Integer): Self = this.set("InstancesWithInstalledPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithInstalledPatches: Self = this.set("InstancesWithInstalledPatches", js.undefined)
    @scala.inline
    def setInstancesWithInstalledPendingRebootPatches(value: InstancesCount): Self = this.set("InstancesWithInstalledPendingRebootPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithInstalledPendingRebootPatches: Self = this.set("InstancesWithInstalledPendingRebootPatches", js.undefined)
    @scala.inline
    def setInstancesWithInstalledRejectedPatches(value: InstancesCount): Self = this.set("InstancesWithInstalledRejectedPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithInstalledRejectedPatches: Self = this.set("InstancesWithInstalledRejectedPatches", js.undefined)
    @scala.inline
    def setInstancesWithMissingPatches(value: Integer): Self = this.set("InstancesWithMissingPatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithMissingPatches: Self = this.set("InstancesWithMissingPatches", js.undefined)
    @scala.inline
    def setInstancesWithNotApplicablePatches(value: Integer): Self = this.set("InstancesWithNotApplicablePatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithNotApplicablePatches: Self = this.set("InstancesWithNotApplicablePatches", js.undefined)
    @scala.inline
    def setInstancesWithUnreportedNotApplicablePatches(value: Integer): Self = this.set("InstancesWithUnreportedNotApplicablePatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesWithUnreportedNotApplicablePatches: Self = this.set("InstancesWithUnreportedNotApplicablePatches", js.undefined)
  }
  
}

