package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod._UnmarshalledRepositoryMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/BatchGetRepositoriesOutput", JSImport.Namespace)
@js.native
object typesBatchGetRepositoriesOutputMod extends js.Object {
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
    var repositories: js.UndefOr[js.Array[_UnmarshalledRepositoryMetadata]] = js.native
    /**
      * <p>Returns a list of repository names for which information could not be found.</p>
      */
    var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.native
  }
  
}

