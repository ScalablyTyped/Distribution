package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBatchGetRepositoriesOutputMod {
  
  trait BatchGetRepositoriesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A list of repositories returned by the batch get repositories operation.</p>
      */
    var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryMetadata]] = js.undefined
    
    /**
      * <p>Returns a list of repository names for which information could not be found.</p>
      */
    var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.undefined
  }
  object BatchGetRepositoriesOutput {
    
    inline def apply($metadata: ResponseMetadata): BatchGetRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchGetRepositoriesOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setRepositories(value: js.Array[UnmarshalledRepositoryMetadata]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
      
      inline def setRepositoriesNotFound(value: js.Array[String]): Self = StObject.set(x, "repositoriesNotFound", value.asInstanceOf[js.Any])
      
      inline def setRepositoriesNotFoundUndefined: Self = StObject.set(x, "repositoriesNotFound", js.undefined)
      
      inline def setRepositoriesNotFoundVarargs(value: String*): Self = StObject.set(x, "repositoriesNotFound", js.Array(value*))
      
      inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
      
      inline def setRepositoriesVarargs(value: UnmarshalledRepositoryMetadata*): Self = StObject.set(x, "repositories", js.Array(value*))
    }
  }
}
