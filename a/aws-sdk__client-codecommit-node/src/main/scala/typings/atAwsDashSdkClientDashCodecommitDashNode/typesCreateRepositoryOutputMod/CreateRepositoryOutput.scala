package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod._UnmarshalledRepositoryMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var repositoryMetadata: js.UndefOr[_UnmarshalledRepositoryMetadata] = js.undefined
}

object CreateRepositoryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, repositoryMetadata: _UnmarshalledRepositoryMetadata = null): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (repositoryMetadata != null) __obj.updateDynamic("repositoryMetadata")(repositoryMetadata)
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
}

