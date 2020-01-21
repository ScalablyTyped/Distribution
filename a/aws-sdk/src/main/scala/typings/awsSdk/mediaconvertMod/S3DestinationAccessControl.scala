package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3DestinationAccessControl extends js.Object {
  /**
    * Choose an Amazon S3 canned ACL for MediaConvert to apply to this output.
    */
  var CannedAcl: js.UndefOr[S3ObjectCannedAcl] = js.native
}

object S3DestinationAccessControl {
  @scala.inline
  def apply(CannedAcl: S3ObjectCannedAcl = null): S3DestinationAccessControl = {
    val __obj = js.Dynamic.literal()
    if (CannedAcl != null) __obj.updateDynamic("CannedAcl")(CannedAcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationAccessControl]
  }
}

