package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDomainTransferToAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain for which you want to cancel the transfer to another AWS account.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object CancelDomainTransferToAnotherAwsAccountRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): CancelDomainTransferToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountRequest]
  }
  
  @scala.inline
  implicit class CancelDomainTransferToAnotherAwsAccountRequestMutableBuilder[Self <: CancelDomainTransferToAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
