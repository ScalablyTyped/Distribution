package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRuleResult extends StObject {
  
  /**
    * The created rule.
    */
  var rule: js.UndefOr[Rule] = js.native
}
object CreateRuleResult {
  
  @scala.inline
  def apply(): CreateRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResult]
  }
  
  @scala.inline
  implicit class CreateRuleResultMutableBuilder[Self <: CreateRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
