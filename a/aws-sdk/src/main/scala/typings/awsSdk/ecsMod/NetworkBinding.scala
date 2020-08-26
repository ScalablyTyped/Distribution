package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkBinding extends js.Object {
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.native
  /**
    * The port number on the container that is used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The port number on the host that is used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.native
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.native
}

object NetworkBinding {
  @scala.inline
  def apply(): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBinding]
  }
  @scala.inline
  implicit class NetworkBindingOps[Self <: NetworkBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindIP(value: String): Self = this.set("bindIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindIP: Self = this.set("bindIP", js.undefined)
    @scala.inline
    def setContainerPort(value: BoxedInteger): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    @scala.inline
    def setHostPort(value: BoxedInteger): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    @scala.inline
    def setProtocol(value: TransportProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

