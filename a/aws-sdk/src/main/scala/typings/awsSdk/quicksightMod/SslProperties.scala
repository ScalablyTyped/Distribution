package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslProperties extends js.Object {
  /**
    * A Boolean option to control whether SSL should be disabled.
    */
  var DisableSsl: js.UndefOr[Boolean] = js.native
}

object SslProperties {
  @scala.inline
  def apply(DisableSsl: js.UndefOr[scala.Boolean] = js.undefined): SslProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DisableSsl)) __obj.updateDynamic("DisableSsl")(DisableSsl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslProperties]
  }
}

