package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslPolicy extends js.Object {
  /**
    * The ciphers.
    */
  var Ciphers: js.UndefOr[typings.awsSdk.elbv2Mod.Ciphers] = js.native
  /**
    * The name of the policy.
    */
  var Name: js.UndefOr[SslPolicyName] = js.native
  /**
    * The protocols.
    */
  var SslProtocols: js.UndefOr[typings.awsSdk.elbv2Mod.SslProtocols] = js.native
}

object SslPolicy {
  @scala.inline
  def apply(): SslPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPolicy]
  }
  @scala.inline
  implicit class SslPolicyOps[Self <: SslPolicy] (val x: Self) extends AnyVal {
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
    def setCiphersVarargs(value: Cipher*): Self = this.set("Ciphers", js.Array(value :_*))
    @scala.inline
    def setCiphers(value: Ciphers): Self = this.set("Ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("Ciphers", js.undefined)
    @scala.inline
    def setName(value: SslPolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSslProtocolsVarargs(value: SslProtocol*): Self = this.set("SslProtocols", js.Array(value :_*))
    @scala.inline
    def setSslProtocols(value: SslProtocols): Self = this.set("SslProtocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProtocols: Self = this.set("SslProtocols", js.undefined)
  }
  
}

