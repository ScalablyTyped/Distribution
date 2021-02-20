package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckDomainTransferabilityRequest extends StObject {
  
  /**
    * If the registrar for the top-level domain (TLD) requires an authorization code to transfer the domain, the code that you got from the current registrar for the domain.
    */
  var AuthCode: js.UndefOr[DomainAuthCode] = js.native
  
  /**
    * The name of the domain that you want to transfer to Route 53. The top-level domain (TLD), such as .com, must be a TLD that Route 53 supports. For a list of supported TLDs, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide. The domain name can contain only the following characters:   Letters a through z. Domain names are not case sensitive.   Numbers 0 through 9.   Hyphen (-). You can't specify a hyphen at the beginning or end of a label.    Period (.) to separate the labels in the name, such as the . in example.com.  
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}
object CheckDomainTransferabilityRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): CheckDomainTransferabilityRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainTransferabilityRequest]
  }
  
  @scala.inline
  implicit class CheckDomainTransferabilityRequestMutableBuilder[Self <: CheckDomainTransferabilityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCode(value: DomainAuthCode): Self = StObject.set(x, "AuthCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthCodeUndefined: Self = StObject.set(x, "AuthCode", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
