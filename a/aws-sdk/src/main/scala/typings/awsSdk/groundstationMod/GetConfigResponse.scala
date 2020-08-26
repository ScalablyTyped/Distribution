package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigResponse extends js.Object {
  /**
    * ARN of a Config 
    */
  var configArn: ConfigArn = js.native
  /**
    * Data elements in a Config.
    */
  var configData: ConfigTypeData = js.native
  /**
    * UUID of a Config.
    */
  var configId: String = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: String = js.native
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object GetConfigResponse {
  @scala.inline
  def apply(configArn: ConfigArn, configData: ConfigTypeData, configId: String, name: String): GetConfigResponse = {
    val __obj = js.Dynamic.literal(configArn = configArn.asInstanceOf[js.Any], configData = configData.asInstanceOf[js.Any], configId = configId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigResponse]
  }
  @scala.inline
  implicit class GetConfigResponseOps[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
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
    def setConfigArn(value: ConfigArn): Self = this.set("configArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigData(value: ConfigTypeData): Self = this.set("configData", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigType: Self = this.set("configType", js.undefined)
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

