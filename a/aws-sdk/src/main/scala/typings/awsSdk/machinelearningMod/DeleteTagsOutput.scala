package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTagsOutput extends js.Object {
  /**
    * The ID of the ML object from which tags were deleted.
    */
  var ResourceId: js.UndefOr[EntityId] = js.native
  /**
    * The type of the ML object from which tags were deleted.
    */
  var ResourceType: js.UndefOr[TaggableResourceType] = js.native
}

object DeleteTagsOutput {
  @scala.inline
  def apply(): DeleteTagsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTagsOutput]
  }
  @scala.inline
  implicit class DeleteTagsOutputOps[Self <: DeleteTagsOutput] (val x: Self) extends AnyVal {
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

