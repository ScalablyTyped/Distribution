package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetRepositoryOutputMod {
  
  trait GetRepositoryOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Information about the repository.</p>
      */
    var repositoryMetadata: js.UndefOr[UnmarshalledRepositoryMetadata] = js.undefined
  }
  object GetRepositoryOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): GetRepositoryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRepositoryOutput]
    }
    
    @scala.inline
    implicit class GetRepositoryOutputMutableBuilder[Self <: GetRepositoryOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryMetadata(value: UnmarshalledRepositoryMetadata): Self = StObject.set(x, "repositoryMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryMetadataUndefined: Self = StObject.set(x, "repositoryMetadata", js.undefined)
    }
  }
}
