package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceDataSyncRequest extends js.Object {
  /**
    * The name of the resource data sync you want to update.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: ResourceDataSyncSource = js.native
  /**
    * The type of resource data sync. The supported SyncType is SyncFromSource.
    */
  var SyncType: ResourceDataSyncType = js.native
}

object UpdateResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName, SyncSource: ResourceDataSyncSource, SyncType: ResourceDataSyncType): UpdateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any], SyncSource = SyncSource.asInstanceOf[js.Any], SyncType = SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDataSyncRequest]
  }
}

