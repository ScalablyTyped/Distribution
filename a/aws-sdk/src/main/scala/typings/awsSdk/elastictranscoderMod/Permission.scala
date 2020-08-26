package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    *  The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.  
    */
  var Access: js.UndefOr[AccessControls] = js.native
  /**
    * The AWS user or group that you want to have access to transcoded files and playlists. To identify the user or group, you can specify the canonical user ID for an AWS account, an origin access identity for a CloudFront distribution, the registered email address of an AWS account, or a predefined Amazon S3 group.
    */
  var Grantee: js.UndefOr[typings.awsSdk.elastictranscoderMod.Grantee] = js.native
  /**
    * The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.  
    */
  var GranteeType: js.UndefOr[typings.awsSdk.elastictranscoderMod.GranteeType] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessVarargs(value: AccessControl*): Self = this.set("Access", js.Array(value :_*))
    @scala.inline
    def setAccess(value: AccessControls): Self = this.set("Access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("Access", js.undefined)
    @scala.inline
    def setGrantee(value: Grantee): Self = this.set("Grantee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantee: Self = this.set("Grantee", js.undefined)
    @scala.inline
    def setGranteeType(value: GranteeType): Self = this.set("GranteeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranteeType: Self = this.set("GranteeType", js.undefined)
  }
  
}

