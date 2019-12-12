package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreVaultNotificationConfigMod._UnmarshalledVaultNotificationConfig
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/GetVaultNotificationsOutput", JSImport.Namespace)
@js.native
object typesGetVaultNotificationsOutputMod extends js.Object {
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
    var vaultNotificationConfig: js.UndefOr[_UnmarshalledVaultNotificationConfig] = js.native
  }
  
}

