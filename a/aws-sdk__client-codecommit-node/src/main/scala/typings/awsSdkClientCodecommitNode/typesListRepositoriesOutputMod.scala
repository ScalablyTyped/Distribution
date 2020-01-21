package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryNameIdPairMod.UnmarshalledRepositoryNameIdPair
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/ListRepositoriesOutput", JSImport.Namespace)
@js.native
object typesListRepositoriesOutputMod extends js.Object {
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
  
}

