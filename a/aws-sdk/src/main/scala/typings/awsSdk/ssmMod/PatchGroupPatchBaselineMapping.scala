package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchGroupPatchBaselineMapping extends StObject {
  
  /**
    * The patch baseline the patch group is registered with.
    */
  var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.native
  
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.native
}
object PatchGroupPatchBaselineMapping {
  
  @scala.inline
  def apply(): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
  
  @scala.inline
  implicit class PatchGroupPatchBaselineMappingMutableBuilder[Self <: PatchGroupPatchBaselineMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineIdentity(value: PatchBaselineIdentity): Self = StObject.set(x, "BaselineIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdentityUndefined: Self = StObject.set(x, "BaselineIdentity", js.undefined)
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
