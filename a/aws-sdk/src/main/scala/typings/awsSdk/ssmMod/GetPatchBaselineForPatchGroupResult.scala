package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline that should be used for the patch group.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.undefined
  
  /**
    * The operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.undefined
  
  /**
    * The name of the patch group.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.undefined
}
object GetPatchBaselineForPatchGroupResult {
  
  @scala.inline
  def apply(): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
  
  @scala.inline
  implicit class GetPatchBaselineForPatchGroupResultMutableBuilder[Self <: GetPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
