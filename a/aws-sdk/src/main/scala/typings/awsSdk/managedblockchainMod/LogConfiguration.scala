package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfiguration extends js.Object {
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[typings.awsSdk.managedblockchainMod.Enabled] = js.native
}

object LogConfiguration {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): LogConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfiguration]
  }
}

