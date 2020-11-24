package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePoliciesResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * A key policy document, in JSON format.
    */
  var policies: js.UndefOr[PolicyList] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Policy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: PolicyList): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}
