package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceProviderMetadata extends js.Object {
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

object ResourceProviderMetadata {
  @scala.inline
  def apply(displayName: String, id: String, settings: js.Object = null): ResourceProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceProviderMetadata]
  }
}

