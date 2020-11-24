package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPolicyVersionsResponse extends js.Object {
  
  /**
    * The policy versions.
    */
  var policyVersions: js.UndefOr[PolicyVersions] = js.native
}
object ListPolicyVersionsResponse {
  
  @scala.inline
  def apply(): ListPolicyVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPolicyVersionsResponse]
  }
  
  @scala.inline
  implicit class ListPolicyVersionsResponseOps[Self <: ListPolicyVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicyVersionsVarargs(value: PolicyVersion*): Self = this.set("policyVersions", js.Array(value :_*))
    
    @scala.inline
    def setPolicyVersions(value: PolicyVersions): Self = this.set("policyVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyVersions: Self = this.set("policyVersions", js.undefined)
  }
}
