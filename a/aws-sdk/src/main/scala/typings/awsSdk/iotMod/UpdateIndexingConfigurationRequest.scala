package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIndexingConfigurationRequest extends js.Object {
  /**
    * Thing group indexing configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.native
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.native
}

object UpdateIndexingConfigurationRequest {
  @scala.inline
  def apply(
    thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration = null,
    thingIndexingConfiguration: ThingIndexingConfiguration = null
  ): UpdateIndexingConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (thingGroupIndexingConfiguration != null) __obj.updateDynamic("thingGroupIndexingConfiguration")(thingGroupIndexingConfiguration.asInstanceOf[js.Any])
    if (thingIndexingConfiguration != null) __obj.updateDynamic("thingIndexingConfiguration")(thingIndexingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
  }
}

