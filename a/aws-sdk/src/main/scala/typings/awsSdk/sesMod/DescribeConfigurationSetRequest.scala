package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationSetRequest extends js.Object {
  /**
    * A list of configuration set attributes to return.
    */
  var ConfigurationSetAttributeNames: js.UndefOr[ConfigurationSetAttributeList] = js.native
  /**
    * The name of the configuration set to describe.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
}

object DescribeConfigurationSetRequest {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName,
    ConfigurationSetAttributeNames: ConfigurationSetAttributeList = null
  ): DescribeConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (ConfigurationSetAttributeNames != null) __obj.updateDynamic("ConfigurationSetAttributeNames")(ConfigurationSetAttributeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSetRequest]
  }
}

