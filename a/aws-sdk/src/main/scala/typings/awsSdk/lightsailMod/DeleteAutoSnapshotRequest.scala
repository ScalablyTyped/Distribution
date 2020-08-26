package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAutoSnapshotRequest extends js.Object {
  /**
    * The date of the automatic snapshot to delete in YYYY-MM-DD format. Use the get auto snapshots operation to get the available automatic snapshots for a resource.
    */
  var date: AutoSnapshotDate = js.native
  /**
    * The name of the source instance or disk from which to delete the automatic snapshot.
    */
  var resourceName: ResourceName = js.native
}

object DeleteAutoSnapshotRequest {
  @scala.inline
  def apply(date: AutoSnapshotDate, resourceName: ResourceName): DeleteAutoSnapshotRequest = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAutoSnapshotRequest]
  }
  @scala.inline
  implicit class DeleteAutoSnapshotRequestOps[Self <: DeleteAutoSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setDate(value: AutoSnapshotDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
  }
  
}

