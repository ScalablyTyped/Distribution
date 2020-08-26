package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsOutput extends js.Object {
  /**
    * The ID of the ML object that was tagged.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  /**
    * The type of the ML object that was tagged.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}

object AddTagsOutput {
  @scala.inline
  def apply(): AddTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsOutput]
  }
  @scala.inline
  implicit class AddTagsOutputOps[Self <: AddTagsOutput] (val x: Self) extends AnyVal {
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
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    @scala.inline
    def setResourceType(value: TaggableResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

