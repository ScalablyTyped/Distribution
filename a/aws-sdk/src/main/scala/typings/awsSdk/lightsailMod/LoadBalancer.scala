package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancer extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A string to string map of the configuration options for your load balancer. Valid values are listed below.
    */
  var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.native
  
  /**
    * The date when your load balancer was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * The DNS name of your Lightsail load balancer.
    */
  var dnsName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a request to the default (root) page.
    */
  var healthCheckPath: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * An array of InstanceHealthSummary objects describing the health of the load balancer.
    */
  var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.native
  
  /**
    * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port 443.
    */
  var instancePort: js.UndefOr[integer] = js.native
  
  /**
    * The AWS Region where your load balancer was created (e.g., us-east-2a). Lightsail automatically creates your load balancer across Availability Zones.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the load balancer (e.g., my-load-balancer).
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The protocol you have enabled for your load balancer. Valid values are below. You can't just have HTTP_HTTPS, but you can have just HTTP.
    */
  var protocol: js.UndefOr[LoadBalancerProtocol] = js.native
  
  /**
    * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
    */
  var publicPorts: js.UndefOr[PortList] = js.native
  
  /**
    * The resource type (e.g., LoadBalancer.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * The status of your load balancer. Valid values are below.
    */
  var state: js.UndefOr[LoadBalancerState] = js.native
  
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS certificates. For example, if true, the certificate is attached to the load balancer.
    */
  var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.native
}
object LoadBalancer {
  
  @scala.inline
  def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  
  @scala.inline
  implicit class LoadBalancerMutableBuilder[Self <: LoadBalancer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setConfigurationOptions(value: LoadBalancerConfigurationOptions): Self = StObject.set(x, "configurationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationOptionsUndefined: Self = StObject.set(x, "configurationOptions", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDnsName(value: NonEmptyString): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    @scala.inline
    def setHealthCheckPath(value: NonEmptyString): Self = StObject.set(x, "healthCheckPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPathUndefined: Self = StObject.set(x, "healthCheckPath", js.undefined)
    
    @scala.inline
    def setInstanceHealthSummary(value: InstanceHealthSummaryList): Self = StObject.set(x, "instanceHealthSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceHealthSummaryUndefined: Self = StObject.set(x, "instanceHealthSummary", js.undefined)
    
    @scala.inline
    def setInstanceHealthSummaryVarargs(value: InstanceHealthSummary*): Self = StObject.set(x, "instanceHealthSummary", js.Array(value :_*))
    
    @scala.inline
    def setInstancePort(value: integer): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtocol(value: LoadBalancerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setPublicPorts(value: PortList): Self = StObject.set(x, "publicPorts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPortsUndefined: Self = StObject.set(x, "publicPorts", js.undefined)
    
    @scala.inline
    def setPublicPortsVarargs(value: Port*): Self = StObject.set(x, "publicPorts", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setState(value: LoadBalancerState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTlsCertificateSummaries(value: LoadBalancerTlsCertificateSummaryList): Self = StObject.set(x, "tlsCertificateSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsCertificateSummariesUndefined: Self = StObject.set(x, "tlsCertificateSummaries", js.undefined)
    
    @scala.inline
    def setTlsCertificateSummariesVarargs(value: LoadBalancerTlsCertificateSummary*): Self = StObject.set(x, "tlsCertificateSummaries", js.Array(value :_*))
  }
}
