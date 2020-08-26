package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceResponse extends js.Object {
  /**
    * A complex type that contains information about the new service.
    */
  var Service: js.UndefOr[typings.awsSdk.servicediscoveryMod.Service] = js.native
}

object CreateServiceResponse {
  @scala.inline
  def apply(): CreateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceResponse]
  }
  @scala.inline
  implicit class CreateServiceResponseOps[Self <: CreateServiceResponse] (val x: Self) extends AnyVal {
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
    def setService(value: Service): Self = this.set("Service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("Service", js.undefined)
  }
  
}

