package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleSummary extends StObject {
  
  var Action: js.UndefOr[RuleAction] = js.native
  
  /**
    * The name of the rule. 
    */
  var Name: js.UndefOr[EntityName] = js.native
}
object RuleSummary {
  
  @scala.inline
  def apply(): RuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSummary]
  }
  
  @scala.inline
  implicit class RuleSummaryMutableBuilder[Self <: RuleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RuleAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
