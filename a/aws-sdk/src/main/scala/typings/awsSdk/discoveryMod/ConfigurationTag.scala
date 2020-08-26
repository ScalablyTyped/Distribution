package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTag extends js.Object {
  /**
    * The configuration ID for the item to tag. You can specify a list of keys and values.
    */
  var configurationId: js.UndefOr[ConfigurationId] = js.native
  /**
    * A type of IT asset to tag.
    */
  var configurationType: js.UndefOr[ConfigurationItemType] = js.native
  /**
    * A type of tag on which to filter. For example, serverType.
    */
  var key: js.UndefOr[TagKey] = js.native
  /**
    * The time the configuration tag was created in Coordinated Universal Time (UTC).
    */
  var timeOfCreation: js.UndefOr[TimeStamp] = js.native
  /**
    * A value on which to filter. For example key = serverType and value = web server.
    */
  var value: js.UndefOr[TagValue] = js.native
}

object ConfigurationTag {
  @scala.inline
  def apply(): ConfigurationTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTag]
  }
  @scala.inline
  implicit class ConfigurationTagOps[Self <: ConfigurationTag] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: ConfigurationId): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
    @scala.inline
    def setConfigurationType(value: ConfigurationItemType): Self = this.set("configurationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationType: Self = this.set("configurationType", js.undefined)
    @scala.inline
    def setKey(value: TagKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setTimeOfCreation(value: TimeStamp): Self = this.set("timeOfCreation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOfCreation: Self = this.set("timeOfCreation", js.undefined)
    @scala.inline
    def setValue(value: TagValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

