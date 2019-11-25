package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteRepositoryOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRepositoryOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The ID of the repository that was deleted.</p>
    */
  var repositoryId: js.UndefOr[String] = js.undefined
}

object DeleteRepositoryOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, repositoryId: String = null): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
}

