package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotResult extends js.Object {
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.native
}

object GetRelationalDatabaseSnapshotResult {
  @scala.inline
  def apply(relationalDatabaseSnapshot: RelationalDatabaseSnapshot = null): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (relationalDatabaseSnapshot != null) __obj.updateDynamic("relationalDatabaseSnapshot")(relationalDatabaseSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
}

