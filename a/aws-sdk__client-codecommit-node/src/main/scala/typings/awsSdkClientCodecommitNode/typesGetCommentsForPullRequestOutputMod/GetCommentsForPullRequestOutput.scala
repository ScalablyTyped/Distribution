package typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod

import typings.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCodecommitNode.typesCommentsForPullRequestMod.UnmarshalledCommentsForPullRequest
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForPullRequestOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An array of comment objects on the pull request.</p>
    */
  var commentsForPullRequestData: js.UndefOr[js.Array[UnmarshalledCommentsForPullRequest]] = js.undefined
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object GetCommentsForPullRequestOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    commentsForPullRequestData: js.Array[UnmarshalledCommentsForPullRequest] = null,
    nextToken: String = null
  ): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (commentsForPullRequestData != null) __obj.updateDynamic("commentsForPullRequestData")(commentsForPullRequestData.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
}

