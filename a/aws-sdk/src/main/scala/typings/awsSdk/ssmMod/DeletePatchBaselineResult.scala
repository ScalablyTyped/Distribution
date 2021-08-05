package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePatchBaselineResult extends StObject {
  
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.undefined
}
object DeletePatchBaselineResult {
  
  inline def apply(): DeletePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePatchBaselineResult]
  }
  
  extension [Self <: DeletePatchBaselineResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
  }
}
