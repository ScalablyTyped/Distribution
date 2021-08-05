package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.undefined
  
  /**
    * The date and time that the service was created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The description that you specify when you create the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.undefined
  
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.undefined
  
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
}
object ServiceSummary {
  
  inline def apply(): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSummary]
  }
  
  extension [Self <: ServiceSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreateDate(value: Timestamp): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsConfig(value: DnsConfig): Self = StObject.set(x, "DnsConfig", value.asInstanceOf[js.Any])
    
    inline def setDnsConfigUndefined: Self = StObject.set(x, "DnsConfig", js.undefined)
    
    inline def setHealthCheckConfig(value: HealthCheckConfig): Self = StObject.set(x, "HealthCheckConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckConfigUndefined: Self = StObject.set(x, "HealthCheckConfig", js.undefined)
    
    inline def setHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = StObject.set(x, "HealthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckCustomConfigUndefined: Self = StObject.set(x, "HealthCheckCustomConfig", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceCount(value: ResourceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
