package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database snapshot that you are deleting.
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
}

object DeleteRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): DeleteRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
  }
}

