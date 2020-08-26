package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsS3BucketDetails extends js.Object {
  /**
    * The date and time when the S3 bucket was created.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The display name of the owner of the S3 bucket.
    */
  var OwnerName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration] = js.native
}

object AwsS3BucketDetails {
  @scala.inline
  def apply(): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
  @scala.inline
  implicit class AwsS3BucketDetailsOps[Self <: AwsS3BucketDetails] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: NonEmptyString): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setOwnerId(value: NonEmptyString): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setOwnerName(value: NonEmptyString): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerName: Self = this.set("OwnerName", js.undefined)
    @scala.inline
    def setServerSideEncryptionConfiguration(value: AwsS3BucketServerSideEncryptionConfiguration): Self = this.set("ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerSideEncryptionConfiguration: Self = this.set("ServerSideEncryptionConfiguration", js.undefined)
  }
  
}

