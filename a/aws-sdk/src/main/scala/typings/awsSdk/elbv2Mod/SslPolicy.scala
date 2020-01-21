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
  def apply(Ciphers: Ciphers = null, Name: SslPolicyName = null, SslProtocols: SslProtocols = null): SslPolicy = {
    val __obj = js.Dynamic.literal()
    if (Ciphers != null) __obj.updateDynamic("Ciphers")(Ciphers.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SslProtocols != null) __obj.updateDynamic("SslProtocols")(SslProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslPolicy]
  }
}

