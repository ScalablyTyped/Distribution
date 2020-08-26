package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectResult extends js.Object {
  /**
    *  Resources which were deleted. 
    */
  var deletedResources: js.UndefOr[Resources] = js.native
  /**
    *  Resources which were not deleted, due to a risk of losing potentially important data or files. 
    */
  var orphanedResources: js.UndefOr[Resources] = js.native
}

object DeleteProjectResult {
  @scala.inline
  def apply(): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResult]
  }
  @scala.inline
  implicit class DeleteProjectResultOps[Self <: DeleteProjectResult] (val x: Self) extends AnyVal {
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
    def setDeletedResourcesVarargs(value: Resource*): Self = this.set("deletedResources", js.Array(value :_*))
    @scala.inline
    def setDeletedResources(value: Resources): Self = this.set("deletedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedResources: Self = this.set("deletedResources", js.undefined)
    @scala.inline
    def setOrphanedResourcesVarargs(value: Resource*): Self = this.set("orphanedResources", js.Array(value :_*))
    @scala.inline
    def setOrphanedResources(value: Resources): Self = this.set("orphanedResources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrphanedResources: Self = this.set("orphanedResources", js.undefined)
  }
  
}

