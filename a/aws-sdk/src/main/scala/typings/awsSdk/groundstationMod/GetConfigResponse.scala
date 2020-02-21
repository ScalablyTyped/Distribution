package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigResponse extends js.Object {
  /**
    * ARN of a Config 
    */
  var configArn: ConfigArn = js.native
  /**
    * Data elements in a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: String = js.native
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object GetConfigResponse {
  @scala.inline
  def apply(
    configArn: ConfigArn,
    configData: ConfigTypeData,
    configId: String,
    name: String,
    configType: ConfigCapabilityType = null,
    tags: TagsMap = null
  ): GetConfigResponse = {
    val __obj = js.Dynamic.literal(configArn = configArn.asInstanceOf[js.Any], configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (configType != null) __obj.updateDynamic("configType")(configType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigResponse]
  }
}

