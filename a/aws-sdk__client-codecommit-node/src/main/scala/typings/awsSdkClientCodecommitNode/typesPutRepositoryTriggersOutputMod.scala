package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRepositoryTriggersOutputMod {
  
  trait PutRepositoryTriggersOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The system-generated unique ID for the create or update operation.</p>
      */
    var configurationId: js.UndefOr[String] = js.undefined
  }
  object PutRepositoryTriggersOutput {
    
    inline def apply($metadata: ResponseMetadata): PutRepositoryTriggersOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRepositoryTriggersOutput]
    }
    
    extension [Self <: PutRepositoryTriggersOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
      
      inline def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
    }
  }
}
