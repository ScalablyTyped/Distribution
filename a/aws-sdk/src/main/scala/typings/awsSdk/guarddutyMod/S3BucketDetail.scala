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
  def apply(
    Arn: String = null,
    CreatedAt: Timestamp = null,
    DefaultServerSideEncryption: DefaultServerSideEncryption = null,
    Name: String = null,
    Owner: Owner = null,
    PublicAccess: PublicAccess = null,
    Tags: Tags = null,
    Type: String = null
  ): S3BucketDetail = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (DefaultServerSideEncryption != null) __obj.updateDynamic("DefaultServerSideEncryption")(DefaultServerSideEncryption.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (PublicAccess != null) __obj.updateDynamic("PublicAccess")(PublicAccess.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketDetail]
  }
}

