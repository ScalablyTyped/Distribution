package typings.atAwsDashSdkClientDashGlacierDashNode.typesListVaultsOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDescribeVaultOutputMod._UnmarshalledDescribeVaultOutput
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVaultsOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * <p>List of vaults.</p>
    */
  var VaultList: js.UndefOr[js.Array[_UnmarshalledDescribeVaultOutput]] = js.undefined
}

object ListVaultsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Marker: String = null,
    VaultList: js.Array[_UnmarshalledDescribeVaultOutput] = null
  ): ListVaultsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (VaultList != null) __obj.updateDynamic("VaultList")(VaultList)
    __obj.asInstanceOf[ListVaultsOutput]
  }
}

