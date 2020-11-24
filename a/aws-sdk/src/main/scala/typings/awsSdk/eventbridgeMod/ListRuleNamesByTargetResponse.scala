package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRuleNamesByTargetResponse extends js.Object {
  
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.native
}
object ListRuleNamesByTargetResponse {
  
  @scala.inline
  def apply(): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
  
  @scala.inline
  implicit class ListRuleNamesByTargetResponseOps[Self <: ListRuleNamesByTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setRuleNamesVarargs(value: RuleName*): Self = this.set("RuleNames", js.Array(value :_*))
    
    @scala.inline
    def setRuleNames(value: RuleNameList): Self = this.set("RuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleNames: Self = this.set("RuleNames", js.undefined)
  }
}
