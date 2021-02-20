package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRuleVersionResult extends StObject {
  
  /**
    * The new rule version that was created.
    */
  var rule: js.UndefOr[Rule] = js.native
}
object UpdateRuleVersionResult {
  
  @scala.inline
  def apply(): UpdateRuleVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleVersionResult]
  }
  
  @scala.inline
  implicit class UpdateRuleVersionResultMutableBuilder[Self <: UpdateRuleVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
