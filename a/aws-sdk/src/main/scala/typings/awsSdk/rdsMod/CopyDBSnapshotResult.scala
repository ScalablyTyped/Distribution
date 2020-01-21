package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}

object CopyDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): CopyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBSnapshotResult]
  }
}

