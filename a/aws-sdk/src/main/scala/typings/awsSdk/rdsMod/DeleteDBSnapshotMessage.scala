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
}

