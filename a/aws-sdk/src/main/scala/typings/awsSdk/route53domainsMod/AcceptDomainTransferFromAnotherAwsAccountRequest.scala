package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDomainTransferFromAnotherAwsAccountRequest extends js.Object {
  
  /**
    * The name of the domain that was specified when another AWS account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The password that was returned by the TransferDomainToAnotherAwsAccount request. 
    */
  var Password: String = js.native
}
object AcceptDomainTransferFromAnotherAwsAccountRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, Password: String): AcceptDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountRequest]
  }
  
  @scala.inline
  implicit class AcceptDomainTransferFromAnotherAwsAccountRequestOps[Self <: AcceptDomainTransferFromAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
  }
}
