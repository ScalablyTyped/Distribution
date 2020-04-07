package typings.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.UnmarshalledVaultNotificationConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVaultNotificationsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Returns the notification configuration set on the vault.</p>
    */
  var vaultNotificationConfig: js.UndefOr[UnmarshalledVaultNotificationConfig] = js.undefined
}

object GetVaultNotificationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, vaultNotificationConfig: UnmarshalledVaultNotificationConfig = null): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (vaultNotificationConfig != null) __obj.updateDynamic("vaultNotificationConfig")(vaultNotificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
}

