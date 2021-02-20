package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDefaultPatchBaselineResult extends StObject {
  
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
}
object RegisterDefaultPatchBaselineResult {
  
  @scala.inline
  def apply(): RegisterDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDefaultPatchBaselineResult]
  }
  
  @scala.inline
  implicit class RegisterDefaultPatchBaselineResultMutableBuilder[Self <: RegisterDefaultPatchBaselineResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
  }
}
