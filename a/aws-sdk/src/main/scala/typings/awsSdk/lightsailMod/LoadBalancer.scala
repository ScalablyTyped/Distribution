package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancer extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A string to string map of the configuration options for your load balancer. Valid values are listed below.
    */
  var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.undefined
  
  /**
    * The date when your load balancer was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The DNS name of your Lightsail load balancer.
    */
  var dnsName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a request to the default (root) page.
    */
  var healthCheckPath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A Boolean value that indicates whether HTTPS redirection is enabled for the load balancer.
    */
  var httpsRedirectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of InstanceHealthSummary objects describing the health of the load balancer.
    */
  var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.undefined
  
  /**
    * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port 443.
    */
  var instancePort: js.UndefOr[integer] = js.undefined
  
  /**
    * The IP address type of the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * The AWS Region where your load balancer was created (e.g., us-east-2a). Lightsail automatically creates your load balancer across Availability Zones.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the load balancer (e.g., my-load-balancer).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The protocol you have enabled for your load balancer. Valid values are below. You can't just have HTTP_HTTPS, but you can have just HTTP.
    */
  var protocol: js.UndefOr[LoadBalancerProtocol] = js.undefined
  
  /**
    * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
    */
  var publicPorts: js.UndefOr[PortList] = js.undefined
  
  /**
    * The resource type (e.g., LoadBalancer.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The status of your load balancer. Valid values are below.
    */
  var state: js.UndefOr[LoadBalancerState] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS certificates. For example, if true, the certificate is attached to the load balancer.
    */
  var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.undefined
  
  /**
    * The name of the TLS security policy for the load balancer.
    */
  var tlsPolicyName: js.UndefOr[ResourceName] = js.undefined
}
object LoadBalancer {
  
  inline def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  extension [Self <: LoadBalancer](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setConfigurationOptions(value: LoadBalancerConfigurationOptions): Self = StObject.set(x, "configurationOptions", value.asInstanceOf[js.Any])
    
    inline def setConfigurationOptionsUndefined: Self = StObject.set(x, "configurationOptions", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDnsName(value: NonEmptyString): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setHealthCheckPath(value: NonEmptyString): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
    
    inline def setHttpsRedirectionEnabled(value: Boolean): Self = StObject.set(x, "httpsRedirectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setHttpsRedirectionEnabledUndefined: Self = StObject.set(x, "httpsRedirectionEnabled", js.undefined)
    
    inline def setInstanceHealthSummary(value: InstanceHealthSummaryList): Self = StObject.set(x, "instanceHealthSummary", value.asInstanceOf[js.Any])
    
    inline def setInstanceHealthSummaryUndefined: Self = StObject.set(x, "instanceHealthSummary", js.undefined)
    
    inline def setInstanceHealthSummaryVarargs(value: InstanceHealthSummary*): Self = StObject.set(x, "instanceHealthSummary", js.Array(value*))
    
    inline def setInstancePort(value: integer): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
    
    inline def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: LoadBalancerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setPublicPorts(value: PortList): Self = StObject.set(x, "publicPorts", value.asInstanceOf[js.Any])
    
    inline def setPublicPortsUndefined: Self = StObject.set(x, "publicPorts", js.undefined)
    
    inline def setPublicPortsVarargs(value: Port*): Self = StObject.set(x, "publicPorts", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setState(value: LoadBalancerState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTlsCertificateSummaries(value: LoadBalancerTlsCertificateSummaryList): Self = StObject.set(x, "tlsCertificateSummaries", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateSummariesUndefined: Self = StObject.set(x, "tlsCertificateSummaries", js.undefined)
    
    inline def setTlsCertificateSummariesVarargs(value: LoadBalancerTlsCertificateSummary*): Self = StObject.set(x, "tlsCertificateSummaries", js.Array(value*))
    
    inline def setTlsPolicyName(value: ResourceName): Self = StObject.set(x, "tlsPolicyName", value.asInstanceOf[js.Any])
    
    inline def setTlsPolicyNameUndefined: Self = StObject.set(x, "tlsPolicyName", js.undefined)
  }
}
