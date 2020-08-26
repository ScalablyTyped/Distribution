package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigRequest extends js.Object {
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType = js.native
  /**
    * Name of a Config.
    */
  var name: SafeName = js.native
}

object UpdateConfigRequest {
  @scala.inline
  def apply(configData: ConfigTypeData, configId: String, configType: ConfigCapabilityType, name: SafeName): UpdateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], configType = configType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigRequest]
  }
  @scala.inline
  implicit class UpdateConfigRequestOps[Self <: UpdateConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigData(value: ConfigTypeData): Self = this.set("configData", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: SafeName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

