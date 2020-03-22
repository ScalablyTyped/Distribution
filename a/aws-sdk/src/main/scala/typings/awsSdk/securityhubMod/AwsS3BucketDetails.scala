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
  def apply(
    CreatedAt: NonEmptyString = null,
    OwnerId: NonEmptyString = null,
    OwnerName: NonEmptyString = null,
    ServerSideEncryptionConfiguration: AwsS3BucketServerSideEncryptionConfiguration = null
  ): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName.asInstanceOf[js.Any])
    if (ServerSideEncryptionConfiguration != null) __obj.updateDynamic("ServerSideEncryptionConfiguration")(ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
}

