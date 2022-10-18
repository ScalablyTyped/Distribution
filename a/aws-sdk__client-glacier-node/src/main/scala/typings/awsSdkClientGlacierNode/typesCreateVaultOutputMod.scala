package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateVaultOutputMod {
  
  trait CreateVaultOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The URI of the vault that was created.</p>
      */
    var location: js.UndefOr[String] = js.undefined
  }
  object CreateVaultOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateVaultOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateVaultOutput]
    }
    
    extension [Self <: CreateVaultOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
