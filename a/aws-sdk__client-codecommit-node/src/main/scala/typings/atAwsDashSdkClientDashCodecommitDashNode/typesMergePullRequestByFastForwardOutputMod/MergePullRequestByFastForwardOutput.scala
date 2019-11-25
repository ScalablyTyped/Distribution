package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod._UnmarshalledPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestByFastForwardOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the specified pull request, including information about the merge.</p>
    */
  var pullRequest: js.UndefOr[_UnmarshalledPullRequest] = js.undefined
}

object MergePullRequestByFastForwardOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequest: _UnmarshalledPullRequest = null): MergePullRequestByFastForwardOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (pullRequest != null) __obj.updateDynamic("pullRequest")(pullRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardOutput]
  }
}

