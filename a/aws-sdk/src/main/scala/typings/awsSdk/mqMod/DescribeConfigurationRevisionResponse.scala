package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionResponse extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: js.UndefOr[string] = js.native
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[string] = js.native
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.native
}

object DescribeConfigurationRevisionResponse {
  @scala.inline
  def apply(
    ConfigurationId: string = null,
    Created: timestampIso8601 = null,
    Data: string = null,
    Description: string = null
  ): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationId != null) __obj.updateDynamic("ConfigurationId")(ConfigurationId.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
}

