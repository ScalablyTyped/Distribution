package typings.atAwsDashSdkClientDashCodecommitDashNode

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod._UnmarshalledRepositoryMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/types/CreateRepositoryOutput", JSImport.Namespace)
@js.native
object typesCreateRepositoryOutputMod extends js.Object {
  @js.native
  trait CreateRepositoryOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Information about the newly created repository.</p>
      */
    var repositoryMetadata: js.UndefOr[_UnmarshalledRepositoryMetadata] = js.native
  }
  
}

