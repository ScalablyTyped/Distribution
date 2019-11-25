package typings.atAwsDashSdkClientDashGlacierDashNode.typesGetVaultNotificationsOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultNotificationConfigMod._UnmarshalledVaultNotificationConfig
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var vaultNotificationConfig: js.UndefOr[_UnmarshalledVaultNotificationConfig] = js.undefined
}

object GetVaultNotificationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, vaultNotificationConfig: _UnmarshalledVaultNotificationConfig = null): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (vaultNotificationConfig != null) __obj.updateDynamic("vaultNotificationConfig")(vaultNotificationConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
}

