package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRetrievalPolicy extends js.Object {
  
  /**
    * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
    */
  var Rules: js.UndefOr[DataRetrievalRulesList] = js.native
}
object DataRetrievalPolicy {
  
  @scala.inline
  def apply(): DataRetrievalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRetrievalPolicy]
  }
  
  @scala.inline
  implicit class DataRetrievalPolicyOps[Self <: DataRetrievalPolicy] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: DataRetrievalRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: DataRetrievalRulesList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
}
