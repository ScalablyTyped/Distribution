package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePullRequestEventsOutput extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information about the pull request events.
    */
  var pullRequestEvents: PullRequestEventList = js.native
}

object DescribePullRequestEventsOutput {
  @scala.inline
  def apply(pullRequestEvents: PullRequestEventList, nextToken: NextToken = null): DescribePullRequestEventsOutput = {
    val __obj = js.Dynamic.literal(pullRequestEvents = pullRequestEvents.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePullRequestEventsOutput]
  }
}

