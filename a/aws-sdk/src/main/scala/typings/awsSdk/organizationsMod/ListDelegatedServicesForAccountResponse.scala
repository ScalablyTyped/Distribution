package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDelegatedServicesForAccountResponse extends js.Object {
  
  /**
    * The services for which the account is a delegated administrator.
    */
  var DelegatedServices: js.UndefOr[typings.awsSdk.organizationsMod.DelegatedServices] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}
object ListDelegatedServicesForAccountResponse {
  
  @scala.inline
  def apply(): ListDelegatedServicesForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedServicesForAccountResponse]
  }
  
  @scala.inline
  implicit class ListDelegatedServicesForAccountResponseOps[Self <: ListDelegatedServicesForAccountResponse] (val x: Self) extends AnyVal {
    
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
    def setDelegatedServicesVarargs(value: DelegatedService*): Self = this.set("DelegatedServices", js.Array(value :_*))
    
    @scala.inline
    def setDelegatedServices(value: DelegatedServices): Self = this.set("DelegatedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedServices: Self = this.set("DelegatedServices", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
