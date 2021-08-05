package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInitiateVaultLockOutputMod {
  
  trait InitiateVaultLockOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The lock ID, which is used to complete the vault locking process.</p>
      */
    var lockId: js.UndefOr[String] = js.undefined
  }
  object InitiateVaultLockOutput {
    
    inline def apply($metadata: ResponseMetadata): InitiateVaultLockOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitiateVaultLockOutput]
    }
    
    extension [Self <: InitiateVaultLockOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setLockId(value: String): Self = StObject.set(x, "lockId", value.asInstanceOf[js.Any])
      
      inline def setLockIdUndefined: Self = StObject.set(x, "lockId", js.undefined)
    }
  }
}
