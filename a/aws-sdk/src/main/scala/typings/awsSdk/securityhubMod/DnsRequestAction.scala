package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsRequestAction extends StObject {
  
  /**
    * Indicates whether the DNS request was blocked.
    */
  var Blocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The DNS domain that is associated with the DNS request.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The protocol that was used for the DNS request.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
}
object DnsRequestAction {
  
  inline def apply(): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRequestAction]
  }
  
  extension [Self <: DnsRequestAction](x: Self) {
    
    inline def setBlocked(value: Boolean): Self = StObject.set(x, "Blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedUndefined: Self = StObject.set(x, "Blocked", js.undefined)
    
    inline def setDomain(value: NonEmptyString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
  }
}
