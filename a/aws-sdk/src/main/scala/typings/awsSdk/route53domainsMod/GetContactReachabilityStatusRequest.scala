package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactReachabilityStatusRequest extends StObject {
  
  /**
    * The name of the domain for which you want to know whether the registrant contact has confirmed that the email address is valid.
    */
  var domainName: js.UndefOr[DomainName] = js.native
}
object GetContactReachabilityStatusRequest {
  
  @scala.inline
  def apply(): GetContactReachabilityStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactReachabilityStatusRequest]
  }
  
  @scala.inline
  implicit class GetContactReachabilityStatusRequestMutableBuilder[Self <: GetContactReachabilityStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
  }
}
