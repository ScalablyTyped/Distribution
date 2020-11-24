package typings.awsSdkClientGlacierNode.typesListVaultsOutputMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeMod.UnmarshalledDescribeVaultOutput
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var VaultList: js.UndefOr[js.Array[UnmarshalledDescribeVaultOutput]] = js.native
}
object ListVaultsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListVaultsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVaultsOutput]
  }
  
  @scala.inline
  implicit class ListVaultsOutputOps[Self <: ListVaultsOutput] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setVaultListVarargs(value: UnmarshalledDescribeVaultOutput*): Self = this.set("VaultList", js.Array(value :_*))
    
    @scala.inline
    def setVaultList(value: js.Array[UnmarshalledDescribeVaultOutput]): Self = this.set("VaultList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultList: Self = this.set("VaultList", js.undefined)
  }
}
