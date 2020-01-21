package typings.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
  /**
    * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository where the pull request was updated.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object PullRequestSourceReferenceUpdatedEventMetadata {
  @scala.inline
  def apply(
    afterCommitId: String = null,
    beforeCommitId: String = null,
    mergeBase: String = null,
    repositoryName: String = null
  ): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
}

