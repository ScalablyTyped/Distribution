package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.undefined
  
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  You can't add, update, or delete a HealthCheckCustomConfig configuration from an existing service.
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.undefined
  
  /**
    * The name that you want to assign to the service. If you want AWS Cloud Map to create an SRV record when you register an instance, and if you're using a system that requires a specific SRV format, such as HAProxy, specify the following for Name:   Start the name with an underscore (_), such as _exampleservice    End the name with ._protocol, such as ._tcp    When you register an instance, AWS Cloud Map creates an SRV record and assigns a name to the record by concatenating the service name and the namespace name, for example:  _exampleservice._tcp.example.com 
    */
  var Name: ServiceName
  
  /**
    * The ID of the namespace that you want to use to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The tags to add to the service. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateServiceRequest {
  
  @scala.inline
  def apply(Name: ServiceName): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  @scala.inline
  implicit class CreateServiceRequestMutableBuilder[Self <: CreateServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatorRequestId(value: ResourceId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDnsConfig(value: DnsConfig): Self = StObject.set(x, "DnsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsConfigUndefined: Self = StObject.set(x, "DnsConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckConfigUndefined: Self = StObject.set(x, "HealthCheckConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = StObject.set(x, "HealthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckCustomConfigUndefined: Self = StObject.set(x, "HealthCheckCustomConfig", js.undefined)
    
    @scala.inline
    def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceId(value: ResourceId): Self = StObject.set(x, "NamespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "NamespaceId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
