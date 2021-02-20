package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePatchBaselineResult extends StObject {
  
  /**
    * The ID of the created patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
}
object CreatePatchBaselineResult {
  
  @scala.inline
  def apply(): CreatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePatchBaselineResult]
  }
  
  @scala.inline
  implicit class CreatePatchBaselineResultMutableBuilder[Self <: CreatePatchBaselineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
  }
}
