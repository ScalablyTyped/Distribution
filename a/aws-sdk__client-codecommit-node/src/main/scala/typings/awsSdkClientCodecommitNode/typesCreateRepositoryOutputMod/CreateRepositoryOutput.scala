package typings.awsSdkClientCodecommitNode.typesCreateRepositoryOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod.UnmarshalledRepositoryMetadata
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRepositoryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the newly created repository.</p>
    */
  var repositoryMetadata: js.UndefOr[UnmarshalledRepositoryMetadata] = js.undefined
}

object CreateRepositoryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, repositoryMetadata: UnmarshalledRepositoryMetadata = null): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
}

