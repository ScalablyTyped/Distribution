package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/DeleteRepositoryOutput", JSImport.Namespace)
@js.native
object typesDeleteRepositoryOutputMod extends js.Object {
  @js.native
  trait DeleteRepositoryOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The ID of the repository that was deleted.</p>
      */
    var repositoryId: js.UndefOr[String] = js.native
  }
  
}

