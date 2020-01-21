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
  def apply(
    AWSAccountId: NonEmptyString = null,
    CreationDate: Int | scala.Double = null,
    KeyId: NonEmptyString = null,
    KeyManager: NonEmptyString = null,
    KeyState: NonEmptyString = null,
    Origin: NonEmptyString = null
  ): AwsKmsKeyDetails = {
    val __obj = js.Dynamic.literal()
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (KeyManager != null) __obj.updateDynamic("KeyManager")(KeyManager.asInstanceOf[js.Any])
    if (KeyState != null) __obj.updateDynamic("KeyState")(KeyState.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsKmsKeyDetails]
  }
}

