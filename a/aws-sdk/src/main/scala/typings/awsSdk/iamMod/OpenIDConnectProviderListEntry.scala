package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIDConnectProviderListEntry extends js.Object {
  var Arn: js.UndefOr[arnType] = js.native
}

object OpenIDConnectProviderListEntry {
  @scala.inline
  def apply(Arn: arnType = null): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
}

