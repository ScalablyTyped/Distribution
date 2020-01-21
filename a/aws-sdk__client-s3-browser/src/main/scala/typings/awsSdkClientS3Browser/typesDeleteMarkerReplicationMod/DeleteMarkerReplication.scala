package typings.awsSdkClientS3Browser.typesDeleteMarkerReplicationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMarkerReplication extends js.Object {
  /**
    * <p>The status of the delete marker replication.</p> <note> <p> In the current implementation, Amazon S3 does not replicate the delete markers. Therefore, the status must be <code>Disabled</code>. </p> </note>
    */
  var Status: js.UndefOr[Enabled | Disabled | String] = js.undefined
}

object DeleteMarkerReplication {
  @scala.inline
  def apply(Status: Enabled | Disabled | String = null): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
}

