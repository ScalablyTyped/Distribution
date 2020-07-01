package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authorization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
    */
  var CdnIdentifierSecret: string = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
    */
  var SecretsRoleArn: string = js.native
}

object Authorization {
  @scala.inline
  def apply(CdnIdentifierSecret: string, SecretsRoleArn: string): Authorization = {
    val __obj = js.Dynamic.literal(CdnIdentifierSecret = CdnIdentifierSecret.asInstanceOf[js.Any], SecretsRoleArn = SecretsRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

