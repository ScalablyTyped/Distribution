package typings.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesPullRequestMod.UnmarshalledPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePullRequestTitleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Information about the updated pull request.</p>
    */
  var pullRequest: UnmarshalledPullRequest
}

object UpdatePullRequestTitleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequest: UnmarshalledPullRequest): UpdatePullRequestTitleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdatePullRequestTitleOutput]
  }
}

