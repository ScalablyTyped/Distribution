package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteVaultAccessPolicyOutputMod {
  
  trait DeleteVaultAccessPolicyOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object DeleteVaultAccessPolicyOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteVaultAccessPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteVaultAccessPolicyOutput]
    }
    
    extension [Self <: DeleteVaultAccessPolicyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
}
