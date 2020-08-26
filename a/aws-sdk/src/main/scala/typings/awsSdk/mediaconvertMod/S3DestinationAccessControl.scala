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
  def apply(): S3DestinationAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationAccessControl]
  }
  @scala.inline
  implicit class S3DestinationAccessControlOps[Self <: S3DestinationAccessControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCannedAcl(value: S3ObjectCannedAcl): Self = this.set("CannedAcl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannedAcl: Self = this.set("CannedAcl", js.undefined)
  }
  
}

