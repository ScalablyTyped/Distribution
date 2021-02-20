package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetRepositoriesOutputMod {
  
  @js.native
  trait BatchGetRepositoriesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>A list of repositories returned by the batch get repositories operation.</p>
      */
    var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryMetadata]] = js.native
    
    /**
      * <p>Returns a list of repository names for which information could not be found.</p>
      */
    var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.native
  }
  object BatchGetRepositoriesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRepositoriesOutput]
    }
    
    @scala.inline
    implicit class BatchGetRepositoriesOutputMutableBuilder[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositories(value: js.Array[UnmarshalledRepositoryMetadata]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoriesNotFound(value: js.Array[String]): Self = StObject.set(x, "repositoriesNotFound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoriesNotFoundUndefined: Self = StObject.set(x, "repositoriesNotFound", js.undefined)
      
      @scala.inline
      def setRepositoriesNotFoundVarargs(value: String*): Self = StObject.set(x, "repositoriesNotFound", js.Array(value :_*))
      
      @scala.inline
      def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
      
      @scala.inline
      def setRepositoriesVarargs(value: UnmarshalledRepositoryMetadata*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    }
  }
}
