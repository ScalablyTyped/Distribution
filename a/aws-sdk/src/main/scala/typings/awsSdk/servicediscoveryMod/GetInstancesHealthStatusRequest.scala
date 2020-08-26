package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesHealthStatusRequest extends js.Object {
  /**
    * An array that contains the IDs of all the instances that you want to get the health status for. If you omit Instances, AWS Cloud Map returns the health status for all the instances that are associated with the specified service.  To get the IDs for the instances that you've registered by using a specified service, submit a ListInstances request. 
    */
  var Instances: js.UndefOr[InstanceIdList] = js.native
  /**
    * The maximum number of instances that you want AWS Cloud Map to return in the response to a GetInstancesHealthStatus request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 instances.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicediscoveryMod.MaxResults] = js.native
  /**
    * For the first GetInstancesHealthStatus request, omit this value. If more than MaxResults instances match the specified criteria, you can submit another GetInstancesHealthStatus request to get the next group of results. Specify the value of NextToken from the previous response in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.native
  /**
    * The ID of the service that the instance is associated with.
    */
  var ServiceId: ResourceId = js.native
}

object GetInstancesHealthStatusRequest {
  @scala.inline
  def apply(ServiceId: ResourceId): GetInstancesHealthStatusRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesHealthStatusRequest]
  }
  @scala.inline
  implicit class GetInstancesHealthStatusRequestOps[Self <: GetInstancesHealthStatusRequest] (val x: Self) extends AnyVal {
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
    def setServiceId(value: ResourceId): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstancesVarargs(value: ResourceId*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: InstanceIdList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

