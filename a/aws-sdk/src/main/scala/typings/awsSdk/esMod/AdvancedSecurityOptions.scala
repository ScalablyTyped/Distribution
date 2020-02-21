package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptions extends js.Object {
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
}

object AdvancedSecurityOptions {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    InternalUserDatabaseEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): AdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(InternalUserDatabaseEnabled)) __obj.updateDynamic("InternalUserDatabaseEnabled")(InternalUserDatabaseEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSecurityOptions]
  }
}

