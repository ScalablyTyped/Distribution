package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterPatchBaselineForPatchGroupRequest extends StObject {
  
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId
  
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup
}
object RegisterPatchBaselineForPatchGroupRequest {
  
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): RegisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
  }
  
  @scala.inline
  implicit class RegisterPatchBaselineForPatchGroupRequestMutableBuilder[Self <: RegisterPatchBaselineForPatchGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
