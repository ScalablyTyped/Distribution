package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsConfig extends StObject {
  
  /**
    * An array that contains one DnsRecord object for each Route 53 DNS record that you want Cloud Map to create when you register an instance.
    */
  var DnsRecords: DnsRecordList
  
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The routing policy that you want to apply to all Route 53 DNS records that Cloud Map creates when you register an instance and specify this service.  If you want to use this service to register instances that create alias records, specify WEIGHTED for the routing policy.  You can specify the following values:  MULTIVALUE  If you define a health check for the service and the health check is healthy, Route 53 returns the applicable value for up to eight instances. For example, suppose that the service includes configurations for one A record and a health check. You use the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses for all of the healthy instances. If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns the values for up to eight instances. For more information about the multivalue routing policy, see Multivalue Answer Routing in the Route 53 Developer Guide.  WEIGHTED  Route 53 returns the applicable value from one randomly selected instance from among the instances that you registered using the same service. Currently, all records have the same weight, so you can't route more or less traffic to any instances. For example, suppose that the service includes configurations for one A record and a health check. You use the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if all of the instances were healthy. If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns the applicable value for one randomly selected instance. For more information about the weighted routing policy, see Weighted Routing in the Route 53 Developer Guide.  
    */
  var RoutingPolicy: js.UndefOr[typings.awsSdk.servicediscoveryMod.RoutingPolicy] = js.undefined
}
object DnsConfig {
  
  inline def apply(DnsRecords: DnsRecordList): DnsConfig = {
    val __obj = js.Dynamic.literal(DnsRecords = DnsRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnsConfig]
  }
  
  extension [Self <: DnsConfig](x: Self) {
    
    inline def setDnsRecords(value: DnsRecordList): Self = StObject.set(x, "DnsRecords", value.asInstanceOf[js.Any])
    
    inline def setDnsRecordsVarargs(value: DnsRecord*): Self = StObject.set(x, "DnsRecords", js.Array(value*))
    
    inline def setNamespaceId(value: ResourceId): Self = StObject.set(x, "NamespaceId", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdUndefined: Self = StObject.set(x, "NamespaceId", js.undefined)
    
    inline def setRoutingPolicy(value: RoutingPolicy): Self = StObject.set(x, "RoutingPolicy", value.asInstanceOf[js.Any])
    
    inline def setRoutingPolicyUndefined: Self = StObject.set(x, "RoutingPolicy", js.undefined)
  }
}
