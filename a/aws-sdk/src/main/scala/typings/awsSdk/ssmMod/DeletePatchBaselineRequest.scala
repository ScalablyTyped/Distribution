package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId
}
object DeletePatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
  
  extension [Self <: DeletePatchBaselineRequest](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
