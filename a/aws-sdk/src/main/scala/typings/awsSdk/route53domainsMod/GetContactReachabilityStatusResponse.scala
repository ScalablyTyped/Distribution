package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContactReachabilityStatusResponse extends StObject {
  
  /**
    * The domain name for which you requested the reachability status.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * Whether the registrant contact has responded. Values include the following:  PENDING  We sent the confirmation email and haven't received a response yet.  DONE  We sent the email and got confirmation from the registrant contact.  EXPIRED  The time limit expired before the registrant contact responded.  
    */
  var status: js.UndefOr[ReachabilityStatus] = js.native
}
object GetContactReachabilityStatusResponse {
  
  @scala.inline
  def apply(): GetContactReachabilityStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactReachabilityStatusResponse]
  }
  
  @scala.inline
  implicit class GetContactReachabilityStatusResponseMutableBuilder[Self <: GetContactReachabilityStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setStatus(value: ReachabilityStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
