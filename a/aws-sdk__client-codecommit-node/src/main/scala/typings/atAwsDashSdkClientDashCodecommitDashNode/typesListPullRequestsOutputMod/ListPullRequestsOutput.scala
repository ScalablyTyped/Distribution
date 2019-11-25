package typings.atAwsDashSdkClientDashCodecommitDashNode.typesListPullRequestsOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPullRequestsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The system-generated IDs of the pull requests.</p>
    */
  var pullRequestIds: js.Array[String]
}

object ListPullRequestsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, pullRequestIds: js.Array[String], nextToken: String = null): ListPullRequestsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsOutput]
  }
}

