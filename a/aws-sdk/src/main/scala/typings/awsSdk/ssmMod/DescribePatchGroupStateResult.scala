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
  def apply(
    Instances: js.UndefOr[Integer] = js.undefined,
    InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.undefined,
    InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
    InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.undefined
  ): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Instances)) __obj.updateDynamic("Instances")(Instances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithFailedPatches)) __obj.updateDynamic("InstancesWithFailedPatches")(InstancesWithFailedPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithInstalledOtherPatches)) __obj.updateDynamic("InstancesWithInstalledOtherPatches")(InstancesWithInstalledOtherPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithInstalledPatches)) __obj.updateDynamic("InstancesWithInstalledPatches")(InstancesWithInstalledPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithInstalledPendingRebootPatches)) __obj.updateDynamic("InstancesWithInstalledPendingRebootPatches")(InstancesWithInstalledPendingRebootPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithInstalledRejectedPatches)) __obj.updateDynamic("InstancesWithInstalledRejectedPatches")(InstancesWithInstalledRejectedPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithMissingPatches)) __obj.updateDynamic("InstancesWithMissingPatches")(InstancesWithMissingPatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithNotApplicablePatches)) __obj.updateDynamic("InstancesWithNotApplicablePatches")(InstancesWithNotApplicablePatches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InstancesWithUnreportedNotApplicablePatches)) __obj.updateDynamic("InstancesWithUnreportedNotApplicablePatches")(InstancesWithUnreportedNotApplicablePatches.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
}

