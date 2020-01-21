package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance snapshot request.
    */
  var instanceSnapshot: js.UndefOr[InstanceSnapshot] = js.native
}

object GetInstanceSnapshotResult {
  @scala.inline
  def apply(instanceSnapshot: InstanceSnapshot = null): GetInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (instanceSnapshot != null) __obj.updateDynamic("instanceSnapshot")(instanceSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceSnapshotResult]
  }
}

