package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRulesResult extends js.Object {
  
  /**
    * The next page token to be used in subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The details of the requested rule.
    */
  var ruleDetails: js.UndefOr[RuleDetailList] = js.native
}
object GetRulesResult {
  
  @scala.inline
  def apply(): GetRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRulesResult]
  }
  
  @scala.inline
  implicit class GetRulesResultOps[Self <: GetRulesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRuleDetailsVarargs(value: RuleDetail*): Self = this.set("ruleDetails", js.Array(value :_*))
    
    @scala.inline
    def setRuleDetails(value: RuleDetailList): Self = this.set("ruleDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleDetails: Self = this.set("ruleDetails", js.undefined)
  }
}
