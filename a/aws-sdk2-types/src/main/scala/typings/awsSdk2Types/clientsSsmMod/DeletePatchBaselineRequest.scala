package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typings.awsSdk2Types.clientsSsmMod.BaselineId
}
object DeletePatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePatchBaselineRequest] (val x: Self) extends AnyVal {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
