package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceDataSyncRequest extends js.Object {
  /**
    * The name of the configuration to delete.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify the type of resource data sync to delete.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object DeleteResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName, SyncType: ResourceDataSyncType = null): DeleteResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    if (SyncType != null) __obj.updateDynamic("SyncType")(SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDataSyncRequest]
  }
}

