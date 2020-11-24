package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePoliciesResponse extends js.Object {
  
  /**
    * A list of the individual resource policies and the account-level resource policy.
    */
  var GetResourcePoliciesResponseList: js.UndefOr[typings.awsSdk.glueMod.GetResourcePoliciesResponseList] = js.native
  
  /**
    * A continuation token, if the returned list does not contain the last resource policy available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object GetResourcePoliciesResponse {
  
  @scala.inline
  def apply(): GetResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePoliciesResponse]
  }
  
  @scala.inline
  implicit class GetResourcePoliciesResponseOps[Self <: GetResourcePoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setGetResourcePoliciesResponseListVarargs(value: GluePolicy*): Self = this.set("GetResourcePoliciesResponseList", js.Array(value :_*))
    
    @scala.inline
    def setGetResourcePoliciesResponseList(value: GetResourcePoliciesResponseList): Self = this.set("GetResourcePoliciesResponseList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetResourcePoliciesResponseList: Self = this.set("GetResourcePoliciesResponseList", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
