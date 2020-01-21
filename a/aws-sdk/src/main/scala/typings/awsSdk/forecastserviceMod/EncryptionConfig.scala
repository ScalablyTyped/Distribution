package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the KMS key.
    */
  var KMSKeyArn: typings.awsSdk.forecastserviceMod.KMSKeyArn = js.native
  /**
    * The ARN of the IAM role that Amazon Forecast can assume to access the AWS KMS key. Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your account, you get an InvalidInputException error.
    */
  var RoleArn: Arn = js.native
}

object EncryptionConfig {
  @scala.inline
  def apply(KMSKeyArn: KMSKeyArn, RoleArn: Arn): EncryptionConfig = {
    val __obj = js.Dynamic.literal(KMSKeyArn = KMSKeyArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptionConfig]
  }
}

