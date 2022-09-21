package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverRuleConfig extends StObject {
  
  /**
    * The new name for the Resolver rule. The name that you specify appears in the Resolver dashboard in the Route 53 console. 
    */
  var Name: js.UndefOr[typings.awsSdk.route53resolverMod.Name] = js.undefined
  
  /**
    * The ID of the new outbound Resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify in TargetIps.
    */
  var ResolverEndpointId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * For DNS queries that originate in your VPC, the new IP addresses that you want to route outbound DNS queries to.
    */
  var TargetIps: js.UndefOr[TargetList] = js.undefined
}
object ResolverRuleConfig {
  
  inline def apply(): ResolverRuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleConfig]
  }
  
  extension [Self <: ResolverRuleConfig](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointIdUndefined: Self = StObject.set(x, "ResolverEndpointId", js.undefined)
    
    inline def setTargetIps(value: TargetList): Self = StObject.set(x, "TargetIps", value.asInstanceOf[js.Any])
    
    inline def setTargetIpsUndefined: Self = StObject.set(x, "TargetIps", js.undefined)
    
    inline def setTargetIpsVarargs(value: TargetAddress*): Self = StObject.set(x, "TargetIps", js.Array(value*))
  }
}
