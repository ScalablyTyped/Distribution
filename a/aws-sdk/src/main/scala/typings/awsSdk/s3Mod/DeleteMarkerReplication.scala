package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerReplication extends js.Object {
  /**
    * Indicates whether to replicate delete markers.   In the current implementation, Amazon S3 doesn't replicate the delete markers. The status must be Disabled.  
    */
  var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.native
}

object DeleteMarkerReplication {
  @scala.inline
  def apply(Status: DeleteMarkerReplicationStatus = null): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
}

