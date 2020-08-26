package typings.awsSdk.configUseDualstackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseDualstackConfigOptions extends js.Object {
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. 
    * In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. 
    * Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  var useDualstack: js.UndefOr[Boolean] = js.native
}

object UseDualstackConfigOptions {
  @scala.inline
  def apply(): UseDualstackConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDualstackConfigOptions]
  }
  @scala.inline
  implicit class UseDualstackConfigOptionsOps[Self <: UseDualstackConfigOptions] (val x: Self) extends AnyVal {
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
    def setUseDualstack(value: Boolean): Self = this.set("useDualstack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDualstack: Self = this.set("useDualstack", js.undefined)
  }
  
}

