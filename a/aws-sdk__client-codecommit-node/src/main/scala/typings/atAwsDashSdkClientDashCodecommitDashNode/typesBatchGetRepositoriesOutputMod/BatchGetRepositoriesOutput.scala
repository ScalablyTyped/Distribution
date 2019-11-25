package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod._UnmarshalledRepositoryMetadata
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetRepositoriesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of repositories returned by the batch get repositories operation.</p>
    */
  var repositories: js.UndefOr[js.Array[_UnmarshalledRepositoryMetadata]] = js.undefined
  /**
    * <p>Returns a list of repository names for which information could not be found.</p>
    */
  var repositoriesNotFound: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchGetRepositoriesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    repositories: js.Array[_UnmarshalledRepositoryMetadata] = null,
    repositoriesNotFound: js.Array[String] = null
  ): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    if (repositoriesNotFound != null) __obj.updateDynamic("repositoriesNotFound")(repositoriesNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
}

