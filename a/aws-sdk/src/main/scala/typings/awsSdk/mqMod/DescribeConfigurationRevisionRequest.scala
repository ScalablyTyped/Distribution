package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
  /**
    * The revision of the configuration.
    */
  var ConfigurationRevision: string = js.native
}

object DescribeConfigurationRevisionRequest {
  @scala.inline
  def apply(ConfigurationId: string, ConfigurationRevision: string): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any], ConfigurationRevision = ConfigurationRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
}

