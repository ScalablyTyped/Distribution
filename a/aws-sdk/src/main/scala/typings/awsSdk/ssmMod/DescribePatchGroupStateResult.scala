package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchGroupStateResult extends StObject {
  
  /**
    * The number of managed nodes in the patch group.
    */
  var Instances: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes where patches that are specified as Critical for compliance reporting in the patch baseline aren't installed. These patches might be missing, have failed installation, were rejected, or were installed but awaiting a required managed node reboot. The status of these managed nodes is NON_COMPLIANT.
    */
  var InstancesWithCriticalNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of managed nodes with patches from the patch baseline that failed to install.
    */
  var InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes with patches installed that aren't defined in the patch baseline.
    */
  var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes with installed patches.
    */
  var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes with patches installed by Patch Manager that haven't been rebooted after the patch installation. The status of these managed nodes is NON_COMPLIANT.
    */
  var InstancesWithInstalledPendingRebootPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of managed nodes with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
    */
  var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of managed nodes with missing patches from the patch baseline.
    */
  var InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes with patches that aren't applicable.
    */
  var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of managed nodes with patches installed that are specified as other than Critical or Security but aren't compliant with the patch baseline. The status of these managed nodes is NON_COMPLIANT.
    */
  var InstancesWithOtherNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of managed nodes where patches that are specified as Security in a patch advisory aren't installed. These patches might be missing, have failed installation, were rejected, or were installed but awaiting a required managed node reboot. The status of these managed nodes is NON_COMPLIANT.
    */
  var InstancesWithSecurityNonCompliantPatches: js.UndefOr[InstancesCount] = js.undefined
  
  /**
    * The number of managed nodes with NotApplicable patches beyond the supported limit, which aren't reported by name to Inventory. Inventory is a capability of Amazon Web Services Systems Manager.
    */
  var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.undefined
}
object DescribePatchGroupStateResult {
  
  inline def apply(): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
  
  extension [Self <: DescribePatchGroupStateResult](x: Self) {
    
    inline def setInstances(value: Integer): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesWithCriticalNonCompliantPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithCriticalNonCompliantPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithCriticalNonCompliantPatchesUndefined: Self = StObject.set(x, "InstancesWithCriticalNonCompliantPatches", js.undefined)
    
    inline def setInstancesWithFailedPatches(value: Integer): Self = StObject.set(x, "InstancesWithFailedPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithFailedPatchesUndefined: Self = StObject.set(x, "InstancesWithFailedPatches", js.undefined)
    
    inline def setInstancesWithInstalledOtherPatches(value: Integer): Self = StObject.set(x, "InstancesWithInstalledOtherPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithInstalledOtherPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledOtherPatches", js.undefined)
    
    inline def setInstancesWithInstalledPatches(value: Integer): Self = StObject.set(x, "InstancesWithInstalledPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithInstalledPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledPatches", js.undefined)
    
    inline def setInstancesWithInstalledPendingRebootPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithInstalledPendingRebootPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithInstalledPendingRebootPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledPendingRebootPatches", js.undefined)
    
    inline def setInstancesWithInstalledRejectedPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithInstalledRejectedPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithInstalledRejectedPatchesUndefined: Self = StObject.set(x, "InstancesWithInstalledRejectedPatches", js.undefined)
    
    inline def setInstancesWithMissingPatches(value: Integer): Self = StObject.set(x, "InstancesWithMissingPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithMissingPatchesUndefined: Self = StObject.set(x, "InstancesWithMissingPatches", js.undefined)
    
    inline def setInstancesWithNotApplicablePatches(value: Integer): Self = StObject.set(x, "InstancesWithNotApplicablePatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithNotApplicablePatchesUndefined: Self = StObject.set(x, "InstancesWithNotApplicablePatches", js.undefined)
    
    inline def setInstancesWithOtherNonCompliantPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithOtherNonCompliantPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithOtherNonCompliantPatchesUndefined: Self = StObject.set(x, "InstancesWithOtherNonCompliantPatches", js.undefined)
    
    inline def setInstancesWithSecurityNonCompliantPatches(value: InstancesCount): Self = StObject.set(x, "InstancesWithSecurityNonCompliantPatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithSecurityNonCompliantPatchesUndefined: Self = StObject.set(x, "InstancesWithSecurityNonCompliantPatches", js.undefined)
    
    inline def setInstancesWithUnreportedNotApplicablePatches(value: Integer): Self = StObject.set(x, "InstancesWithUnreportedNotApplicablePatches", value.asInstanceOf[js.Any])
    
    inline def setInstancesWithUnreportedNotApplicablePatchesUndefined: Self = StObject.set(x, "InstancesWithUnreportedNotApplicablePatches", js.undefined)
  }
}
