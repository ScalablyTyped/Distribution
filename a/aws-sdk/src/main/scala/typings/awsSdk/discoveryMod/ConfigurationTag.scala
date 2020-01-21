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
  def apply(
    configurationId: ConfigurationId = null,
    configurationType: ConfigurationItemType = null,
    key: TagKey = null,
    timeOfCreation: TimeStamp = null,
    value: TagValue = null
  ): ConfigurationTag = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (configurationType != null) __obj.updateDynamic("configurationType")(configurationType.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (timeOfCreation != null) __obj.updateDynamic("timeOfCreation")(timeOfCreation.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationTag]
  }
}

