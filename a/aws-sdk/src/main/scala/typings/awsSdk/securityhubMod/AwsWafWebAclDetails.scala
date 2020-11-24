package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsWafWebAclDetails extends js.Object {
  
  /**
    * The action to perform if none of the rules contained in the WebACL match.
    */
  var DefaultAction: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An array that contains the action for each rule in a WebACL, the priority of the rule, and the ID of the rule.
    */
  var Rules: js.UndefOr[AwsWafWebAclRuleList] = js.native
  
  /**
    * A unique identifier for a WebACL.
    */
  var WebAclId: js.UndefOr[NonEmptyString] = js.native
}
object AwsWafWebAclDetails {
  
  @scala.inline
  def apply(): AwsWafWebAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafWebAclDetails]
  }
  
  @scala.inline
  implicit class AwsWafWebAclDetailsOps[Self <: AwsWafWebAclDetails] (val x: Self) extends AnyVal {
    
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
    def setDefaultAction(value: NonEmptyString): Self = this.set("DefaultAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAction: Self = this.set("DefaultAction", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: AwsWafWebAclRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: AwsWafWebAclRuleList): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
    
    @scala.inline
    def setWebAclId(value: NonEmptyString): Self = this.set("WebAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebAclId: Self = this.set("WebAclId", js.undefined)
  }
}
