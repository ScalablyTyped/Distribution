package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigListItem extends js.Object {
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.native
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.native
  /**
    * Name of a Config.
    */
  var name: js.UndefOr[String] = js.native
}

object ConfigListItem {
  @scala.inline
  def apply(): ConfigListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigListItem]
  }
  @scala.inline
  implicit class ConfigListItemOps[Self <: ConfigListItem] (val x: Self) extends AnyVal {
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
    def deleteConfigArn: Self = this.set("configArn", js.undefined)
    @scala.inline
    def setConfigId(value: String): Self = this.set("configId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigId: Self = this.set("configId", js.undefined)
    @scala.inline
    def setConfigType(value: ConfigCapabilityType): Self = this.set("configType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigType: Self = this.set("configType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

