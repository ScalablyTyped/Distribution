package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory of which to take a snapshot.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The descriptive name to apply to the snapshot.
    */
  var Name: js.UndefOr[SnapshotName] = js.native
}

object CreateSnapshotRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  @scala.inline
  implicit class CreateSnapshotRequestOps[Self <: CreateSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: SnapshotName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

