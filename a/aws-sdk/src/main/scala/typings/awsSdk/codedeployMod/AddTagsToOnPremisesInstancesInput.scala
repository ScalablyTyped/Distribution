package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances to which to add tags.
    */
  var instanceNames: InstanceNameList = js.native
  /**
    * The tag key-value pairs to add to the on-premises instances. Keys and values are both required. Keys cannot be null or empty strings. Value-only tags are not allowed.
    */
  var tags: TagList = js.native
}

object AddTagsToOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList, tags: TagList): AddTagsToOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToOnPremisesInstancesInput]
  }
  @scala.inline
  implicit class AddTagsToOnPremisesInstancesInputOps[Self <: AddTagsToOnPremisesInstancesInput] (val x: Self) extends AnyVal {
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
    def setInstanceNamesVarargs(value: InstanceName*): Self = this.set("instanceNames", js.Array(value :_*))
    @scala.inline
    def setInstanceNames(value: InstanceNameList): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

