package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingActor extends StObject {
  
  /**
    * The domain name of the device that the entity used to perform the action on the affected resource.
    */
  var domainDetails: js.UndefOr[DomainDetails] = js.undefined
  
  /**
    * The IP address of the device that the entity used to perform the action on the affected resource. This object also provides information such as the owner and geographic location for the IP address.
    */
  var ipAddressDetails: js.UndefOr[IpAddressDetails] = js.undefined
  
  /**
    * The type and other characteristics of the entity that performed the action on the affected resource.
    */
  var userIdentity: js.UndefOr[UserIdentity] = js.undefined
}
object FindingActor {
  
  inline def apply(): FindingActor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingActor]
  }
  
  extension [Self <: FindingActor](x: Self) {
    
    inline def setDomainDetails(value: DomainDetails): Self = StObject.set(x, "domainDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainDetailsUndefined: Self = StObject.set(x, "domainDetails", js.undefined)
    
    inline def setIpAddressDetails(value: IpAddressDetails): Self = StObject.set(x, "ipAddressDetails", value.asInstanceOf[js.Any])
    
    inline def setIpAddressDetailsUndefined: Self = StObject.set(x, "ipAddressDetails", js.undefined)
    
    inline def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
  }
}
