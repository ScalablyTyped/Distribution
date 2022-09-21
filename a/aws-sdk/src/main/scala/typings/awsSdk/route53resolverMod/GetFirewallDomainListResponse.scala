package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallDomainListResponse extends StObject {
  
  /**
    * The domain list that you requested. 
    */
  var FirewallDomainList: js.UndefOr[typings.awsSdk.route53resolverMod.FirewallDomainList] = js.undefined
}
object GetFirewallDomainListResponse {
  
  inline def apply(): GetFirewallDomainListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallDomainListResponse]
  }
  
  extension [Self <: GetFirewallDomainListResponse](x: Self) {
    
    inline def setFirewallDomainList(value: FirewallDomainList): Self = StObject.set(x, "FirewallDomainList", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListUndefined: Self = StObject.set(x, "FirewallDomainList", js.undefined)
  }
}
