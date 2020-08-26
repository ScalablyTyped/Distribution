package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The date and time the bucket was created at.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * Describes the server side encryption method used in the S3 bucket.
    */
  var DefaultServerSideEncryption: js.UndefOr[typings.awsSdk.guarddutyMod.DefaultServerSideEncryption] = js.native
  /**
    * The name of the S3 bucket.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The owner of the S3 bucket.
    */
  var Owner: js.UndefOr[typings.awsSdk.guarddutyMod.Owner] = js.native
  /**
    * Describes the public access policies that apply to the S3 bucket.
    */
  var PublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.PublicAccess] = js.native
  /**
    * All tags attached to the S3 bucket
    */
  var Tags: js.UndefOr[typings.awsSdk.guarddutyMod.Tags] = js.native
  /**
    * Describes whether the bucket is a source or destination bucket.
    */
  var Type: js.UndefOr[String] = js.native
}

object S3BucketDetail {
  @scala.inline
  def apply(): S3BucketDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketDetail]
  }
  @scala.inline
  implicit class S3BucketDetailOps[Self <: S3BucketDetail] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDefaultServerSideEncryption(value: DefaultServerSideEncryption): Self = this.set("DefaultServerSideEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultServerSideEncryption: Self = this.set("DefaultServerSideEncryption", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setPublicAccess(value: PublicAccess): Self = this.set("PublicAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccess: Self = this.set("PublicAccess", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

