package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigIdResponse extends js.Object {
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
}

object ConfigIdResponse {
  @scala.inline
  def apply(configArn: ConfigArn = null, configId: String = null, configType: ConfigCapabilityType = null): ConfigIdResponse = {
    val __obj = js.Dynamic.literal()
    if (configArn != null) __obj.updateDynamic("configArn")(configArn.asInstanceOf[js.Any])
    if (configId != null) __obj.updateDynamic("configId")(configId.asInstanceOf[js.Any])
    if (configType != null) __obj.updateDynamic("configType")(configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigIdResponse]
  }
}

