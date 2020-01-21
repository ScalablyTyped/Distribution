package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateResourceConfigResponse extends js.Object {
  /**
    * Returns a ConfigurationItem object.
    */
  var ConfigurationItem: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationItem] = js.native
}

object GetAggregateResourceConfigResponse {
  @scala.inline
  def apply(ConfigurationItem: ConfigurationItem = null): GetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationItem != null) __obj.updateDynamic("ConfigurationItem")(ConfigurationItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateResourceConfigResponse]
  }
}

