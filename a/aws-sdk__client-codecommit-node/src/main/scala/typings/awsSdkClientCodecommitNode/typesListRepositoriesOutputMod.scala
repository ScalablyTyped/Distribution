package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod.UnmarshalledRepositoryNameIdPair
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListRepositoriesOutputMod {
  
  @js.native
  trait ListRepositoriesOutput extends OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    
    /**
      * <p>An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.</p>
      */
    var nextToken: js.UndefOr[String] = js.native
    
    /**
      * <p>Lists the repositories called by the list repositories operation.</p>
      */
    var repositories: js.UndefOr[js.Array[UnmarshalledRepositoryNameIdPair]] = js.native
  }
  object ListRepositoriesOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListRepositoriesOutput]
    }
    
    @scala.inline
    implicit class ListRepositoriesOutputMutableBuilder[Self <: ListRepositoriesOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
      
      @scala.inline
      def setRepositories(value: js.Array[UnmarshalledRepositoryNameIdPair]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
      
      @scala.inline
      def setRepositoriesVarargs(value: UnmarshalledRepositoryNameIdPair*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    }
  }
}
