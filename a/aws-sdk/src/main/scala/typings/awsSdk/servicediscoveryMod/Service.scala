package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date and time that the service was created, in Unix format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The description of the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.undefined
  
  /**
    *  Public DNS and HTTP namespaces only. A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in DnsConfig. For information about the charges for health checks, see Amazon Route 53 Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.undefined
  
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.undefined
  
  /**
    * The ID that AWS Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count. The count might not reflect pending registrations and deregistrations.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.undefined
  
  /**
    * The ID of the namespace that was used to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Timestamp): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
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
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: ResourceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    @scala.inline
    def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: ResourceId): Self = StObject.set(x, "NamespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceIdUndefined: Self = StObject.set(x, "NamespaceId", js.undefined)
  }
}
