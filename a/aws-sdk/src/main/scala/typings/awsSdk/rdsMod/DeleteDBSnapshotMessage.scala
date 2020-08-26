package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBSnapshotMessage extends js.Object {
  /**
    * The DB snapshot identifier. Constraints: Must be the name of an existing DB snapshot in the available state.
    */
  var DBSnapshotIdentifier: String = js.native
}

object DeleteDBSnapshotMessage {
  @scala.inline
  def apply(DBSnapshotIdentifier: String): DeleteDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSnapshotMessage]
  }
  @scala.inline
  implicit class DeleteDBSnapshotMessageOps[Self <: DeleteDBSnapshotMessage] (val x: Self) extends AnyVal {
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
    def setDBSnapshotIdentifier(value: String): Self = this.set("DBSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
  
}

