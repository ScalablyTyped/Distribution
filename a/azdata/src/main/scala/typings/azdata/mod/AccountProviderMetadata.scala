package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountProviderMetadata extends js.Object {
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var args: js.UndefOr[js.Any] = js.undefined
  /**
    * Display name of the provider
    */
  var displayName: String
  /**
    * The identifier of the provider
    */
  var id: String
  /**
    * Optional settings that identify an instantiation of a provider
    */
  var settings: js.UndefOr[js.Object] = js.undefined
}

object AccountProviderMetadata {
  @scala.inline
  def apply(displayName: String, id: String, args: js.Any = null, settings: js.Object = null): AccountProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProviderMetadata]
  }
}

