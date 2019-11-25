package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod._UnmarshalledPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestDescriptionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the updated pull request.</p>
    */
  var pullRequest: _UnmarshalledPullRequest
}

object UpdatePullRequestDescriptionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequest: _UnmarshalledPullRequest): UpdatePullRequestDescriptionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestDescriptionOutput]
  }
}

