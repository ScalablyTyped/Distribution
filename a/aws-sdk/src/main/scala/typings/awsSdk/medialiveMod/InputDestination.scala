package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDestination extends js.Object {
  /**
    * The system-generated static IP address of endpoint.
  It remains fixed for the lifetime of the input.
    */
  var Ip: js.UndefOr[string] = js.native
  /**
    * The port number for the input.
    */
  var Port: js.UndefOr[string] = js.native
  /**
    * This represents the endpoint that the customer stream will be
  pushed to.
    */
  var Url: js.UndefOr[string] = js.native
  var Vpc: js.UndefOr[InputDestinationVpc] = js.native
}

object InputDestination {
  @scala.inline
  def apply(): InputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestination]
  }
  @scala.inline
  implicit class InputDestinationOps[Self <: InputDestination] (val x: Self) extends AnyVal {
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
    def setIp(value: string): Self = this.set("Ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("Ip", js.undefined)
    @scala.inline
    def setPort(value: string): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
    @scala.inline
    def setVpc(value: InputDestinationVpc): Self = this.set("Vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("Vpc", js.undefined)
  }
  
}

