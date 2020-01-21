package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationAggregatorResponse extends js.Object {
  /**
    * Returns a ConfigurationAggregator object.
    */
  var ConfigurationAggregator: js.UndefOr[typings.awsSdk.configserviceMod.ConfigurationAggregator] = js.native
}

object PutConfigurationAggregatorResponse {
  @scala.inline
  def apply(ConfigurationAggregator: ConfigurationAggregator = null): PutConfigurationAggregatorResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationAggregator != null) __obj.updateDynamic("ConfigurationAggregator")(ConfigurationAggregator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationAggregatorResponse]
  }
}

