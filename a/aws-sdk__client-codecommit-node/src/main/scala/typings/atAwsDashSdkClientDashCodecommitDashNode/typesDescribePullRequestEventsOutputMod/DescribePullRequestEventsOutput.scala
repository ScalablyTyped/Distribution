package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDescribePullRequestEventsOutputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestEventMod._UnmarshalledPullRequestEvent
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePullRequestEventsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An enumeration token that can be used in a request to return the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Information about the pull request events.</p>
    */
  var pullRequestEvents: js.Array[_UnmarshalledPullRequestEvent]
}

object DescribePullRequestEventsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    pullRequestEvents: js.Array[_UnmarshalledPullRequestEvent],
    nextToken: String = null
  ): DescribePullRequestEventsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsOutput]
  }
}

