package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpInstanceSummary extends StObject {
  
  /**
    * If you included any attributes when you registered the instance, the values of those attributes.
    */
  var Attributes: js.UndefOr[typings.awsSdk.servicediscoveryMod.Attributes] = js.native
  
  /**
    * If you configured health checking in the service, the current health status of the service instance.
    */
  var HealthStatus: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthStatus] = js.native
  
  /**
    * The ID of an instance that matches the values that you specified in the request.
    */
  var InstanceId: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: js.UndefOr[typings.awsSdk.servicediscoveryMod.NamespaceName] = js.native
  
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicediscoveryMod.ServiceName] = js.native
}
object HttpInstanceSummary {
  
  @scala.inline
  def apply(): HttpInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpInstanceSummary]
  }
  
  @scala.inline
  implicit class HttpInstanceSummaryMutableBuilder[Self <: HttpInstanceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    @scala.inline
    def setInstanceId(value: ResourceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceNameUndefined: Self = StObject.set(x, "NamespaceName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
