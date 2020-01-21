package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigListItem extends js.Object {
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.native
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: js.UndefOr[String] = js.native
}

object ConfigListItem {
  @scala.inline
  def apply(
    configArn: ConfigArn = null,
    configId: String = null,
    configType: ConfigCapabilityType = null,
    name: String = null
  ): ConfigListItem = {
    val __obj = js.Dynamic.literal()
    if (configArn != null) __obj.updateDynamic("configArn")(configArn.asInstanceOf[js.Any])
    if (configId != null) __obj.updateDynamic("configId")(configId.asInstanceOf[js.Any])
    if (configType != null) __obj.updateDynamic("configType")(configType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigListItem]
  }
}

