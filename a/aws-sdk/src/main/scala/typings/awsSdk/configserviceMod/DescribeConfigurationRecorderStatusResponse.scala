package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecorderStatusResponse extends js.Object {
  /**
    * A list that contains status of the specified recorders.
    */
  var ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.native
}

object DescribeConfigurationRecorderStatusResponse {
  @scala.inline
  def apply(ConfigurationRecordersStatus: ConfigurationRecorderStatusList = null): DescribeConfigurationRecorderStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecordersStatus != null) __obj.updateDynamic("ConfigurationRecordersStatus")(ConfigurationRecordersStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusResponse]
  }
}

