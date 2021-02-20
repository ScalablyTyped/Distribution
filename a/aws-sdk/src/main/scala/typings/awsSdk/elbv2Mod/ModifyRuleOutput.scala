package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyRuleOutput extends StObject {
  
  /**
    * Information about the modified rule.
    */
  var Rules: js.UndefOr[typings.awsSdk.elbv2Mod.Rules] = js.native
}
object ModifyRuleOutput {
  
  @scala.inline
  def apply(): ModifyRuleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRuleOutput]
  }
  
  @scala.inline
  implicit class ModifyRuleOutputMutableBuilder[Self <: ModifyRuleOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
