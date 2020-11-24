package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverInstancesRequest extends js.Object {
  
  /**
    * The health status of the instances that you want to discover.
    */
  var HealthStatus: js.UndefOr[HealthStatusFilter] = js.native
  
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a DiscoverInstances request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[DiscoverMaxResults] = js.native
  
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: typings.awsSdk.servicediscoveryMod.NamespaceName = js.native
  
  /**
    * Opportunistic filters to scope the results based on custom attributes. If there are instances that match both the filters specified in both the QueryParameters parameter and this parameter, they are returned. Otherwise, these filters are ignored and only instances that match the filters specified in the QueryParameters parameter are returned.
    */
  var OptionalParameters: js.UndefOr[Attributes] = js.native
  
  /**
    * Filters to scope the results based on custom attributes for the instance. For example, {version=v1, az=1a}. Only instances that match all the specified key-value pairs will be returned.
    */
  var QueryParameters: js.UndefOr[Attributes] = js.native
  
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: typings.awsSdk.servicediscoveryMod.ServiceName = js.native
}
object DiscoverInstancesRequest {
  
  @scala.inline
  def apply(NamespaceName: NamespaceName, ServiceName: ServiceName): DiscoverInstancesRequest = {
    val __obj = js.Dynamic.literal(NamespaceName = NamespaceName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverInstancesRequest]
  }
  
  @scala.inline
  implicit class DiscoverInstancesRequestOps[Self <: DiscoverInstancesRequest] (val x: Self) extends AnyVal {
    
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
    def setNamespaceName(value: NamespaceName): Self = this.set("NamespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatus(value: HealthStatusFilter): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthStatus: Self = this.set("HealthStatus", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DiscoverMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setOptionalParameters(value: Attributes): Self = this.set("OptionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalParameters: Self = this.set("OptionalParameters", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: Attributes): Self = this.set("QueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("QueryParameters", js.undefined)
  }
}
