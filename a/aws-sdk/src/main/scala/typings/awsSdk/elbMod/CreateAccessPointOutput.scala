package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointOutput extends js.Object {
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.elbMod.DNSName] = js.native
}

object CreateAccessPointOutput {
  @scala.inline
  def apply(): CreateAccessPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointOutput]
  }
  @scala.inline
  implicit class CreateAccessPointOutputOps[Self <: CreateAccessPointOutput] (val x: Self) extends AnyVal {
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
    def setDNSName(value: DNSName): Self = this.set("DNSName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDNSName: Self = this.set("DNSName", js.undefined)
  }
  
}

