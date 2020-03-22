package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncDestinationDataSharing extends js.Object {
  /**
    * The sharing data type. Only Organization is supported.
    */
  var DestinationDataSharingType: js.UndefOr[ResourceDataSyncDestinationDataSharingType] = js.native
}

object ResourceDataSyncDestinationDataSharing {
  @scala.inline
  def apply(DestinationDataSharingType: ResourceDataSyncDestinationDataSharingType = null): ResourceDataSyncDestinationDataSharing = {
    val __obj = js.Dynamic.literal()
    if (DestinationDataSharingType != null) __obj.updateDynamic("DestinationDataSharingType")(DestinationDataSharingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncDestinationDataSharing]
  }
}

