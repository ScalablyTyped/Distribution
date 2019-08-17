package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscorePullRequestStatusChangedEventMetadataMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CLOSED
import typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PullRequestStatusChangedEventMetadata extends js.Object {
  /**
    * <p>The changed status of the pull request.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.undefined
}

object _PullRequestStatusChangedEventMetadata {
  @scala.inline
  def apply(pullRequestStatus: OPEN | CLOSED | String = null): _PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (pullRequestStatus != null) __obj.updateDynamic("pullRequestStatus")(pullRequestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[_PullRequestStatusChangedEventMetadata]
  }
}

