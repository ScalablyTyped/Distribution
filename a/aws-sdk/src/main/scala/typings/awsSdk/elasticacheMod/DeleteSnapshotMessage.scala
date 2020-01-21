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
}

