package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline the patch group was deregistered from.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  
  /**
    * The name of the patch group deregistered from the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.native
}
object DeregisterPatchBaselineForPatchGroupResult {
  
  @scala.inline
  def apply(): DeregisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
  }
  
  @scala.inline
  implicit class DeregisterPatchBaselineForPatchGroupResultMutableBuilder[Self <: DeregisterPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
