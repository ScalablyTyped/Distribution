package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreDeleteMarkerReplicationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeleteMarkerReplication extends js.Object {
  /**
    * <p>The status of the delete marker replication.</p> <note> <p> In the current implementation, Amazon S3 does not replicate the delete markers. Therefore, the status must be <code>Disabled</code>. </p> </note>
    */
  var Status: js.UndefOr[Enabled | Disabled | String] = js.undefined
}

object _DeleteMarkerReplication {
  @scala.inline
  def apply(Status: Enabled | Disabled | String = null): _DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeleteMarkerReplication]
  }
}

