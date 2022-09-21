package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallDomainListResponse extends StObject {
  
  /**
    * The domain list that you just deleted. 
    */
  var FirewallDomainList: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallDomainList] = js.undefined
}
object DeleteFirewallDomainListResponse {
  
  inline def apply(): DeleteFirewallDomainListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallDomainListResponse]
  }
  
  extension [Self <: DeleteFirewallDomainListResponse](x: Self) {
    
    inline def setFirewallDomainList(value: FirewallDomainList): Self = StObject.set(x, "FirewallDomainList", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListUndefined: Self = StObject.set(x, "FirewallDomainList", js.undefined)
  }
}
