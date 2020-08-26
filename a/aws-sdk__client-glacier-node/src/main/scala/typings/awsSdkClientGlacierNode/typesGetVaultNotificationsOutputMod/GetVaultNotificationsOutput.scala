package typings.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesVaultNotificationConfigMod.UnmarshalledVaultNotificationConfig
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultNotificationsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Returns the notification configuration set on the vault.</p>
    */
  var vaultNotificationConfig: js.UndefOr[UnmarshalledVaultNotificationConfig] = js.native
}

object GetVaultNotificationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetVaultNotificationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultNotificationsOutput]
  }
  @scala.inline
  implicit class GetVaultNotificationsOutputOps[Self <: GetVaultNotificationsOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultNotificationConfig(value: UnmarshalledVaultNotificationConfig): Self = this.set("vaultNotificationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVaultNotificationConfig: Self = this.set("vaultNotificationConfig", js.undefined)
  }
  
}

