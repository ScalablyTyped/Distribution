package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestCreatedEventMetadata extends js.Object {
  /**
    * The commit ID of the tip of the branch specified as the destination branch when the pull request was created.
    */
  var destinationCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The commit ID on the source branch used when the pull request was created.
    */
  var sourceCommitId: js.UndefOr[CommitId] = js.native
}

object PullRequestCreatedEventMetadata {
  @scala.inline
  def apply(
    destinationCommitId: CommitId = null,
    mergeBase: CommitId = null,
    repositoryName: RepositoryName = null,
    sourceCommitId: CommitId = null
  ): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationCommitId != null) __obj.updateDynamic("destinationCommitId")(destinationCommitId.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
}

