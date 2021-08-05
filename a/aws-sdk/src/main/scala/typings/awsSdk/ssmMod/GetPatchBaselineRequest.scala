package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline to retrieve.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId
}
object GetPatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
  
  extension [Self <: GetPatchBaselineRequest](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
