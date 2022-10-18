package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod.UnmarshalledRepositoryNameIdPair
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListRepositoriesOutputMod {
  
  trait ListRepositoriesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.</p>
      */
    var nextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Lists the repositories called by the list repositories operation.</p>
      */
    var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryNameIdPair]] = js.undefined
  }
  object ListRepositoriesOutput {
    
    inline def apply($metadata: ResponseMetadata): ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRepositoriesOutput]
    }
    
    extension [Self <: ListRepositoriesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      inline def setRepositories(value: js.Array[UnmarshalledRepositoryNameIdPair]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
      
      inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
      
      inline def setRepositoriesVarargs(value: UnmarshalledRepositoryNameIdPair*): Self = StObject.set(x, "repositories", js.Array(value*))
    }
  }
}
