package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDefaultPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline that should be the default patch baseline.
    */
  var BaselineId: typings.awsSdk2Types.clientsSsmMod.BaselineId
}
object RegisterDefaultPatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterDefaultPatchBaselineRequest] (val x: Self) extends AnyVal {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
