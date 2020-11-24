package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentityPoliciesResponse extends js.Object {
  
  /**
    * A list of names of policies that apply to the specified identity.
    */
  var PolicyNames: PolicyNameList = js.native
}
object ListIdentityPoliciesResponse {
  
  @scala.inline
  def apply(PolicyNames: PolicyNameList): ListIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListIdentityPoliciesResponseOps[Self <: ListIdentityPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicyNamesVarargs(value: PolicyName*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: PolicyNameList): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
  }
}
