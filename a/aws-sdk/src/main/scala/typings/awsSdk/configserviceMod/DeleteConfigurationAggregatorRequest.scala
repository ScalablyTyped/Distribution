package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationAggregatorRequest extends js.Object {
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
}

object DeleteConfigurationAggregatorRequest {
  @scala.inline
  def apply(ConfigurationAggregatorName: ConfigurationAggregatorName): DeleteConfigurationAggregatorRequest = {
    val __obj = js.Dynamic.literal(ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigurationAggregatorRequest]
  }
}

