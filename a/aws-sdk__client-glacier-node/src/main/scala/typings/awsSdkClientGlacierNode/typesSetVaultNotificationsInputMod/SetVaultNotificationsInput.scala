package typings.awsSdkClientGlacierNode.typesSetVaultNotificationsInputMod

import typings.awsSdkClientGlacierNode.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.VaultNotificationConfig
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetVaultNotificationsInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The <code>AccountId</code> value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '<code>-</code>' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.</p>
    */
  var accountId: String
  /**
    * <p>The name of the vault.</p>
    */
  var vaultName: String
  /**
    * <p>Provides options for specifying notification configuration.</p>
    */
  var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
}

object SetVaultNotificationsInput {
  @scala.inline
  def apply(
    accountId: String,
    vaultName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    vaultNotificationConfig: VaultNotificationConfig = null
  ): SetVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (vaultNotificationConfig != null) __obj.updateDynamic("vaultNotificationConfig")(vaultNotificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVaultNotificationsInput]
  }
}

