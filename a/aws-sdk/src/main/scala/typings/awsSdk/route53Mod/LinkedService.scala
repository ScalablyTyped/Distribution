package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedService extends js.Object {
  /**
    * If the health check or hosted zone was created by another service, an optional description that can be provided by the other service. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * If the health check or hosted zone was created by another service, the service that created the resource. When a resource is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.route53Mod.ServicePrincipal] = js.native
}

object LinkedService {
  @scala.inline
  def apply(): LinkedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedService]
  }
  @scala.inline
  implicit class LinkedServiceOps[Self <: LinkedService] (val x: Self) extends AnyVal {
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
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = this.set("ServicePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicePrincipal: Self = this.set("ServicePrincipal", js.undefined)
  }
  
}

