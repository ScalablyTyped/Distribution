package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typings.awsSdk.rdsMod.DBSnapshot] = js.native
}

object ModifyDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): ModifyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotResult]
  }
}

