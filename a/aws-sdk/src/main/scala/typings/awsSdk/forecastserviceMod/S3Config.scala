package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Config extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Key Management Service (KMS) key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsSdk.forecastserviceMod.KMSKeyArn] = js.native
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket or file(s) in an Amazon S3 bucket.
    */
  var Path: S3Path = js.native
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket or files. If you provide a value for the KMSKeyArn key, the role must allow access to the key. Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an InvalidInputException error.
    */
  var RoleArn: Arn = js.native
}

object S3Config {
  @scala.inline
  def apply(Path: S3Path, RoleArn: Arn, KMSKeyArn: KMSKeyArn = null): S3Config = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
}

