package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceAccessPoliciesResponse extends js.Object {
  
  /**
    * The access rules configured for the domain.
    */
  var AccessPolicies: AccessPoliciesStatus = js.native
}
object UpdateServiceAccessPoliciesResponse {
  
  @scala.inline
  def apply(AccessPolicies: AccessPoliciesStatus): UpdateServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class UpdateServiceAccessPoliciesResponseOps[Self <: UpdateServiceAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicies(value: AccessPoliciesStatus): Self = this.set("AccessPolicies", value.asInstanceOf[js.Any])
  }
}
