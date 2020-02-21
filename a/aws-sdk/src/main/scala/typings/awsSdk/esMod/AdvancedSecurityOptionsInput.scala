package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptionsInput extends js.Object {
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  var MasterUserOptions: js.UndefOr[typings.awsSdk.esMod.MasterUserOptions] = js.native
}

object AdvancedSecurityOptionsInput {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    InternalUserDatabaseEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    MasterUserOptions: MasterUserOptions = null
  ): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(InternalUserDatabaseEnabled)) __obj.updateDynamic("InternalUserDatabaseEnabled")(InternalUserDatabaseEnabled.asInstanceOf[js.Any])
    if (MasterUserOptions != null) __obj.updateDynamic("MasterUserOptions")(MasterUserOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
}

