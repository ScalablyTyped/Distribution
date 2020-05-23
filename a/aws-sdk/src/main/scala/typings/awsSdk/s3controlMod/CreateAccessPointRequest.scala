package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointRequest extends js.Object {
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  var Bucket: BucketName = js.native
  /**
    * The name you want to assign to this access point.
    */
  var Name: AccessPointName = js.native
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.native
  /**
    * If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.native
}

object CreateAccessPointRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    Bucket: BucketName,
    Name: AccessPointName,
    PublicAccessBlockConfiguration: PublicAccessBlockConfiguration = null,
    VpcConfiguration: VpcConfiguration = null
  ): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (PublicAccessBlockConfiguration != null) __obj.updateDynamic("PublicAccessBlockConfiguration")(PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
}

