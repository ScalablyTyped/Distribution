package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpInstanceSummary extends js.Object {
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
  implicit class HttpInstanceSummaryOps[Self <: HttpInstanceSummary] (val x: Self) extends AnyVal {
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
    def setAttributes(value: Attributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setHealthStatus(value: HealthStatus): Self = this.set("HealthStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthStatus: Self = this.set("HealthStatus", js.undefined)
    @scala.inline
    def setInstanceId(value: ResourceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setNamespaceName(value: NamespaceName): Self = this.set("NamespaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceName: Self = this.set("NamespaceName", js.undefined)
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
  }
  
}

