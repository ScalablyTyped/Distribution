package typings.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRepositoryOutput extends OutputTypesUnion {
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
  def apply($metadata: ResponseMetadata, repositoryMetadata: UnmarshalledRepositoryMetadata = null): GetRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryOutput]
  }
}

