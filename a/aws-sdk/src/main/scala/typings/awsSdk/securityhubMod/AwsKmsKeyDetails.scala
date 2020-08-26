package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsKmsKeyDetails extends js.Object {
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[Double] = js.native
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed.
    */
  var KeyManager: js.UndefOr[NonEmptyString] = js.native
  /**
    * The state of the CMK.
    */
  var KeyState: js.UndefOr[NonEmptyString] = js.native
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[NonEmptyString] = js.native
}

object AwsKmsKeyDetails {
  @scala.inline
  def apply(): AwsKmsKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKmsKeyDetails]
  }
  @scala.inline
  implicit class AwsKmsKeyDetailsOps[Self <: AwsKmsKeyDetails] (val x: Self) extends AnyVal {
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
    def setAWSAccountId(value: NonEmptyString): Self = this.set("AWSAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAWSAccountId: Self = this.set("AWSAccountId", js.undefined)
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setKeyId(value: NonEmptyString): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setKeyManager(value: NonEmptyString): Self = this.set("KeyManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyManager: Self = this.set("KeyManager", js.undefined)
    @scala.inline
    def setKeyState(value: NonEmptyString): Self = this.set("KeyState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyState: Self = this.set("KeyState", js.undefined)
    @scala.inline
    def setOrigin(value: NonEmptyString): Self = this.set("Origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("Origin", js.undefined)
  }
  
}

