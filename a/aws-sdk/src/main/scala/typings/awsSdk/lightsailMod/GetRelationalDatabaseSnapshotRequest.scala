package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database snapshot for which to get information.
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
}

object GetRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): GetRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotRequest]
  }
}

