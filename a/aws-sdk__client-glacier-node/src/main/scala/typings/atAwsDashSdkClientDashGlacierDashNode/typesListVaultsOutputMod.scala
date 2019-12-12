package typings.atAwsDashSdkClientDashGlacierDashNode

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDescribeVaultOutputMod._UnmarshalledDescribeVaultOutput
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListVaultsOutput", JSImport.Namespace)
@js.native
object typesListVaultsOutputMod extends js.Object {
  @js.native
  trait ListVaultsOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.</p>
      */
    var Marker: js.UndefOr[String] = js.native
    /**
      * <p>List of vaults.</p>
      */
    var VaultList: js.UndefOr[js.Array[_UnmarshalledDescribeVaultOutput]] = js.native
  }
  
}

