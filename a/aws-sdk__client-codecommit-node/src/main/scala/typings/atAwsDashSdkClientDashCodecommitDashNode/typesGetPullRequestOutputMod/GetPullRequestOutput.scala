package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetPullRequestOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestMod._UnmarshalledPullRequest
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the specified pull request.</p>
    */
  var pullRequest: _UnmarshalledPullRequest
}

object GetPullRequestOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequest: _UnmarshalledPullRequest): GetPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, pullRequest = pullRequest)
  
    __obj.asInstanceOf[GetPullRequestOutput]
  }
}

