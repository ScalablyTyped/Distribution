package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTagsForResourceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resouce to be updated. Must be the ARN of an Elastic Beanstalk resource.
    */
  var ResourceArn: typings.awsSdk.elasticbeanstalkMod.ResourceArn = js.native
  /**
    * A list of tags to add or update. If a key of an existing tag is added, the tag's value is updated. Specify at least one of these parameters: TagsToAdd, TagsToRemove.
    */
  var TagsToAdd: js.UndefOr[TagList] = js.native
  /**
    * A list of tag keys to remove. If a tag key doesn't exist, it is silently ignored. Specify at least one of these parameters: TagsToAdd, TagsToRemove.
    */
  var TagsToRemove: js.UndefOr[TagKeyList] = js.native
}

object UpdateTagsForResourceMessage {
  @scala.inline
  def apply(ResourceArn: ResourceArn): UpdateTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForResourceMessage]
  }
  @scala.inline
  implicit class UpdateTagsForResourceMessageOps[Self <: UpdateTagsForResourceMessage] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsToAddVarargs(value: Tag*): Self = this.set("TagsToAdd", js.Array(value :_*))
    @scala.inline
    def setTagsToAdd(value: TagList): Self = this.set("TagsToAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagsToAdd: Self = this.set("TagsToAdd", js.undefined)
    @scala.inline
    def setTagsToRemoveVarargs(value: TagKey*): Self = this.set("TagsToRemove", js.Array(value :_*))
    @scala.inline
    def setTagsToRemove(value: TagKeyList): Self = this.set("TagsToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagsToRemove: Self = this.set("TagsToRemove", js.undefined)
  }
  
}

