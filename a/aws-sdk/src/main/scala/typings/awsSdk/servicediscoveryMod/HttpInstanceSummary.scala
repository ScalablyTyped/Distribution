package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpInstanceSummary extends StObject {
  
  /**
    * If you included any attributes when you registered the instance, the values of those attributes.
    */
  var Attributes: js.UndefOr[typings.awsSdk.servicediscoveryMod.Attributes] = js.undefined
  
  /**
    * If you configured health checking in the service, the current health status of the service instance.
    */
  var HealthStatus: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthStatus] = js.undefined
  
  /**
    * The ID of an instance that matches the values that you specified in the request.
    */
  var InstanceId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    *      The HttpName name of the namespace. It's found in the HttpProperties member of the Properties member of the namespace.
    */
  var NamespaceName: js.UndefOr[NamespaceNameHttp] = js.undefined
  
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicediscoveryMod.ServiceName] = js.undefined
}
object HttpInstanceSummary {
  
  inline def apply(): HttpInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpInstanceSummary]
  }
  
  extension [Self <: HttpInstanceSummary](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setInstanceId(value: ResourceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNamespaceName(value: NamespaceNameHttp): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "NamespaceName", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
