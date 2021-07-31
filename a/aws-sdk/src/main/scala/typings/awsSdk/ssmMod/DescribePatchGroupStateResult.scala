package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchGroupStateResult extends StObject {
  
  /**
    * The number of instances in the patch group.
    */
  var Instances: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with patches from the patch baseline that failed to install.
    */
  var InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with patches installed that aren't defined in the patch baseline.
    */
  var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with installed patches.
    */
  var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with patches installed by Patch Manager that have not been rebooted after the patch installation. The status of these instances is NON_COMPLIANT.
    */
  var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
    */
  var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of instances with missing patches from the patch baseline.
    */
  var InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with patches that aren't applicable.
    */
  var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of instances with NotApplicable patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.
    */
  var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.undefined
}
object DescribePatchGroupStateResult {
  
  @scala.inline
  def apply(): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
  
  @scala.inline
  implicit class DescribePatchGroupStateResultMutableBuilder[Self <: DescribePatchGroupStateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: Integer): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesWithFailedPatches(value: Integer): Self = StObject.set(x, "InstancesWithFailedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithFailedPatchesUndefined: Self = StObject.set(x, "InstancesWithFailedPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithInstalledOtherPatches(value: Integer): Self = StObject.set(x, "InstancesWithInstalledOtherPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithInstalledOtherPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledOtherPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithInstalledPatches(value: Integer): Self = StObject.set(x, "InstancesWithInstalledPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithInstalledPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithInstalledPendingRebootPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithInstalledPendingRebootPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithInstalledPendingRebootPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledPendingRebootPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithInstalledRejectedPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithInstalledRejectedPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithInstalledRejectedPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledRejectedPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithMissingPatches(value: Integer): Self = StObject.set(x, "InstancesWithMissingPatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithMissingPatchesUndefined: Self = StObject.set(x, "InstancesWithMissingPatches", js.undefined)
    
    @scala.inline
    def setInstancesWithNotApplicablePatches(value: Integer): Self = StObject.set(x, "InstancesWithNotApplicablePatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithNotApplicablePatchesUndefined: Self = StObject.set(x, "InstancesWithNotApplicablePatches", js.undefined)
    
    @scala.inline
    def setInstancesWithUnreportedNotApplicablePatches(value: Integer): Self = StObject.set(x, "InstancesWithUnreportedNotApplicablePatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesWithUnreportedNotApplicablePatchesUndefined: Self = StObject.set(x, "InstancesWithUnreportedNotApplicablePatches", js.undefined)
  }
}
