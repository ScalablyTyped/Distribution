package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
}
object DeletePatchBaselineRequest {
  
  @scala.inline
  def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
  
  @scala.inline
  implicit class DeletePatchBaselineRequestMutableBuilder[Self <: DeletePatchBaselineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
