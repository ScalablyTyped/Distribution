package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * The AWS account.
    */
  var targetAwsAccount: AwsAccountId = js.native
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
}

object TransferCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId, targetAwsAccount: AwsAccountId, transferMessage: Message = null): TransferCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], targetAwsAccount = targetAwsAccount.asInstanceOf[js.Any])
    if (transferMessage != null) __obj.updateDynamic("transferMessage")(transferMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCertificateRequest]
  }
}

