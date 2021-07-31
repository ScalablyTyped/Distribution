package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectDomainTransferFromAnotherAwsAccountRequest extends StObject {
  
  /**
    * The name of the domain that was specified when another AWS account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object RejectDomainTransferFromAnotherAwsAccountRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): RejectDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountRequest]
  }
  
  @scala.inline
  implicit class RejectDomainTransferFromAnotherAwsAccountRequestMutableBuilder[Self <: RejectDomainTransferFromAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
