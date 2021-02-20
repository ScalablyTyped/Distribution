package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to retrieve.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
}
object GetPatchBaselineRequest {
  
  @scala.inline
  def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
  
  @scala.inline
  implicit class GetPatchBaselineRequestMutableBuilder[Self <: GetPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
