package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallDomainListRequest extends StObject {
  
  /**
    * The ID of the domain list that you want to delete. 
    */
  var FirewallDomainListId: ResourceId
}
object DeleteFirewallDomainListRequest {
  
  inline def apply(FirewallDomainListId: ResourceId): DeleteFirewallDomainListRequest = {
    val __obj = js.Dynamic.literal(FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallDomainListRequest]
  }
  
  extension [Self <: DeleteFirewallDomainListRequest](x: Self) {
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
  }
}
