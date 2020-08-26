package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotMessage extends js.Object {
  /**
    * The name of the snapshot to be deleted.
    */
  var SnapshotName: String = js.native
}

object DeleteSnapshotMessage {
  @scala.inline
  def apply(SnapshotName: String): DeleteSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotMessage]
  }
  @scala.inline
  implicit class DeleteSnapshotMessageOps[Self <: DeleteSnapshotMessage] (val x: Self) extends AnyVal {
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
    def setSnapshotName(value: String): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
  }
  
}

