package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramServiceDescriptor extends js.Object {
  /**
    * Name of the provider.
    */
  var ProviderName: stringMax256 = js.native
  /**
    * Name of the service.
    */
  var ServiceName: stringMax256 = js.native
}

object MultiplexProgramServiceDescriptor {
  @scala.inline
  def apply(ProviderName: stringMax256, ServiceName: stringMax256): MultiplexProgramServiceDescriptor = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramServiceDescriptor]
  }
  @scala.inline
  implicit class MultiplexProgramServiceDescriptorOps[Self <: MultiplexProgramServiceDescriptor] (val x: Self) extends AnyVal {
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
    def setProviderName(value: stringMax256): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: stringMax256): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
  }
  
}

