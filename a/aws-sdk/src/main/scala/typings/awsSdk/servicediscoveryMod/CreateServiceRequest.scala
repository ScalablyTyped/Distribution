package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServiceRequest extends js.Object {
  
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  You can't add, update, or delete a HealthCheckCustomConfig configuration from an existing service.
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  
  /**
    * The name that you want to assign to the service. If you want AWS Cloud Map to create an SRV record when you register an instance, and if you're using a system that requires a specific SRV format, such as HAProxy, specify the following for Name:   Start the name with an underscore (_), such as _exampleservice    End the name with ._protocol, such as ._tcp    When you register an instance, AWS Cloud Map creates an SRV record and assigns a name to the record by concatenating the service name and the namespace name, for example:  _exampleservice._tcp.example.com 
    */
  var Name: ServiceName = js.native
  
  /**
    * The ID of the namespace that you want to use to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The tags to add to the service. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateServiceRequest {
  
  @scala.inline
  def apply(Name: ServiceName): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  @scala.inline
  implicit class CreateServiceRequestOps[Self <: CreateServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ServiceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestId(value: ResourceId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDnsConfig(value: DnsConfig): Self = this.set("DnsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsConfig: Self = this.set("DnsConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = this.set("HealthCheckConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckConfig: Self = this.set("HealthCheckConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = this.set("HealthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckCustomConfig: Self = this.set("HealthCheckCustomConfig", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: ResourceId): Self = this.set("NamespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceId: Self = this.set("NamespaceId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
