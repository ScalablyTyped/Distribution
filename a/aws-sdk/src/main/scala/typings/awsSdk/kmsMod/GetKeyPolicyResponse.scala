package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyPolicyResponse extends js.Object {
  
  /**
    * A key policy document in JSON format.
    */
  var Policy: js.UndefOr[PolicyType] = js.native
}
object GetKeyPolicyResponse {
  
  @scala.inline
  def apply(): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
  
  @scala.inline
  implicit class GetKeyPolicyResponseOps[Self <: GetKeyPolicyResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicy(value: PolicyType): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
