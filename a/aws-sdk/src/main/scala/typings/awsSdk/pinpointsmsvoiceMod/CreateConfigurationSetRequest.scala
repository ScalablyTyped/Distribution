package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationSetRequest extends js.Object {
  /**
    * The name that you want to give the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
}

object CreateConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: WordCharactersWithDelimiters = null): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
}

