package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConfigurationSetRequest extends js.Object {
  /**
    * The name of the configuration set that you want to delete.
    */
  var ConfigurationSetName: typings.awsSdk.pinpointemailMod.ConfigurationSetName = js.native
}

object DeleteConfigurationSetRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): DeleteConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfigurationSetRequest]
  }
  @scala.inline
  implicit class DeleteConfigurationSetRequestOps[Self <: DeleteConfigurationSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
  }
  
}

