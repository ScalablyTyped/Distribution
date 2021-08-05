package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInstancesRequest extends StObject {
  
  /**
    * The health status of the instances that you want to discover.
    */
  var HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined
  
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[DiscoverMaxResults] = js.undefined
  
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: typings.awsSdk.servicediscoveryMod.NamespaceName
  
  /**
    * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the filters specified in both the QueryParameters parameter and this parameter, they are returned. Otherwise, these filters are ignored and only instances that match the filters specified in the QueryParameters parameter are returned.
    */
  var OptionalParameters: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Filters to scope the results based on custom attributes for the instance. For example, {version=v1, az=1a}. Only instances that match all the specified key-value pairs will be returned.
    */
  var QueryParameters: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: typings.awsSdk.servicediscoveryMod.ServiceName
}
object DiscoverInstancesRequest {
  
  inline def apply(NamespaceName: NamespaceName, ServiceName: ServiceName): DiscoverInstancesRequest = {
    val __obj = js.Dynamic.literal(NamespaceName = NamespaceName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInstancesRequest]
  }
  
  extension [Self <: DiscoverInstancesRequest](x: Self) {
    
    inline def setHealthStatus(value: HealthStatusFilter): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setMaxResults(value: DiscoverMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "NamespaceName", value.asInstanceOf[js.Any])
    
    inline def setOptionalParameters(value: Attributes): Self = StObject.set(x, "OptionalParameters", value.asInstanceOf[js.Any])
    
    inline def setOptionalParametersUndefined: Self = StObject.set(x, "OptionalParameters", js.undefined)
    
    inline def setQueryParameters(value: Attributes): Self = StObject.set(x, "QueryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "QueryParameters", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
  }
}
