package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsInput extends js.Object {
  /**
    * The ID of the tagged ML object. For example, exampleModelId.
    */
  var ResourceId: EntityId = js.native
  /**
    * The type of the tagged ML object.
    */
  var ResourceType: TaggableResourceType = js.native
  /**
    * One or more tags to delete.
    */
  var TagKeys: TagKeyList = js.native
}

object DeleteTagsInput {
  @scala.inline
  def apply(ResourceId: EntityId, ResourceType: TaggableResourceType, TagKeys: TagKeyList): DeleteTagsInput = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsInput]
  }
  @scala.inline
  implicit class DeleteTagsInputOps[Self <: DeleteTagsInput] (val x: Self) extends AnyVal {
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
    def setResourceId(value: EntityId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: TaggableResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
  
}

