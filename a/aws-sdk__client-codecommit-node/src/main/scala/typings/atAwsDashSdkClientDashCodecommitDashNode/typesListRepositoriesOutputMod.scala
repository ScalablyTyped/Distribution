package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryNameIdPairMod._UnmarshalledRepositoryNameIdPair
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    var repositories: js.UndefOr[js.Array[_UnmarshalledRepositoryNameIdPair]] = js.native
  }
  
}

