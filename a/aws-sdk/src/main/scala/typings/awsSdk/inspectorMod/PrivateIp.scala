package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIp extends js.Object {
  /**
    * The DNS name of the private IP address.
    */
  var privateDnsName: js.UndefOr[Text] = js.native
  /**
    * The full IP address of the network inteface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.native
}

object PrivateIp {
  @scala.inline
  def apply(): PrivateIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIp]
  }
  @scala.inline
  implicit class PrivateIpOps[Self <: PrivateIp] (val x: Self) extends AnyVal {
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
    def setPrivateDnsName(value: Text): Self = this.set("privateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("privateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: Text): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
  }
  
}

