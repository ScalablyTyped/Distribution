package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDefaultPatchBaselineRequest extends StObject {
  
  /**
    * The ID of the patch baseline that should be the default patch baseline.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId
}
object RegisterDefaultPatchBaselineRequest {
  
  inline def apply(BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
  }
  
  extension [Self <: RegisterDefaultPatchBaselineRequest](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
  }
}
