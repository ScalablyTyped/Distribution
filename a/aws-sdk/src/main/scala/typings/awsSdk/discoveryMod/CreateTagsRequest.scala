package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTagsRequest extends js.Object {
  /**
    * A list of configuration items that you want to tag.
    */
  var configurationIds: ConfigurationIdList = js.native
  /**
    * Tags that you want to associate with one or more configuration items. Specify the tags that you want to create in a key-value format. For example:  {"key": "serverType", "value": "webServer"} 
    */
  var tags: TagSet = js.native
}

object CreateTagsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList, tags: TagSet): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  @scala.inline
  implicit class CreateTagsRequestOps[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
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
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = this.set("configurationIds", js.Array(value :_*))
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = this.set("configurationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagSet): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

