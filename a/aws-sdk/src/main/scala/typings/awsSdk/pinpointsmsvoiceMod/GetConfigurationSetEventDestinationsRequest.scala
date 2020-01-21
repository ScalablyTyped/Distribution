package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetEventDestinationsRequest extends js.Object {
  /**
    * ConfigurationSetName
    */
  var ConfigurationSetName: _String = js.native
}

object GetConfigurationSetEventDestinationsRequest {
  @scala.inline
  def apply(ConfigurationSetName: _String): GetConfigurationSetEventDestinationsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
  }
}

