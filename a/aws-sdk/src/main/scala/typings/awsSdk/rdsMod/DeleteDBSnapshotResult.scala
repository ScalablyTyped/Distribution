package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}

object DeleteDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): DeleteDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSnapshotResult]
  }
}

