package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationsRequest extends js.Object {
  /**
    * One or more configuration IDs.
    */
  var configurationIds: ConfigurationIdList = js.native
}

object DescribeConfigurationsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList): DescribeConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationsRequest]
  }
}

