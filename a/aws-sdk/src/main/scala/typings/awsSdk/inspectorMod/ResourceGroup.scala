package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroup extends js.Object {
  /**
    * The ARN of the resource group.
    */
  var arn: Arn = js.native
  /**
    * The time at which resource group is created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The tags (key and value pairs) of the resource group. This data type property is used in the CreateResourceGroup action.
    */
  var tags: ResourceGroupTags = js.native
}

object ResourceGroup {
  @scala.inline
  def apply(arn: Arn, createdAt: Timestamp, tags: ResourceGroupTags): ResourceGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceGroup]
  }
  @scala.inline
  implicit class ResourceGroupOps[Self <: ResourceGroup] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: ResourceGroupTag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: ResourceGroupTags): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

