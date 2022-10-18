package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteRepositoryOutputMod {
  
  trait DeleteRepositoryOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The ID of the repository that was deleted.</p>
      */
    var repositoryId: js.UndefOr[String] = js.undefined
  }
  object DeleteRepositoryOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRepositoryOutput]
    }
    
    extension [Self <: DeleteRepositoryOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
      
      inline def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    }
  }
}
