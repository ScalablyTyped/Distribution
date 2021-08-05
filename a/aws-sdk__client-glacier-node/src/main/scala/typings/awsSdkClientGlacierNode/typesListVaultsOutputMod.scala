package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeMod.UnmarshalledDescribeVaultOutput
import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListVaultsOutputMod {
  
  trait ListVaultsOutput
    extends StObject
       with _OutputTypesUnion {
    
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
    var VaultList: js.UndefOr[js.Array[UnmarshalledDescribeVaultOutput]] = js.undefined
  }
  object ListVaultsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListVaultsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListVaultsOutput]
    }
    
    extension [Self <: ListVaultsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setVaultList(value: js.Array[UnmarshalledDescribeVaultOutput]): Self = StObject.set(x, "VaultList", value.asInstanceOf[js.Any])
      
      inline def setVaultListUndefined: Self = StObject.set(x, "VaultList", js.undefined)
      
      inline def setVaultListVarargs(value: UnmarshalledDescribeVaultOutput*): Self = StObject.set(x, "VaultList", js.Array(value :_*))
    }
  }
}
