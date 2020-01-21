package typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestCreatedEventMetadata extends js.Object {
  /**
    * <p>The commit ID of the tip of the branch specified as the destination branch when the pull request was created.</p>
    */
  var destinationCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
  /**
    * <p>The commit ID on the source branch used when the pull request was created.</p>
    */
  var sourceCommitId: js.UndefOr[String] = js.undefined
}

object PullRequestCreatedEventMetadata {
  @scala.inline
  def apply(
    destinationCommitId: String = null,
    mergeBase: String = null,
    repositoryName: String = null,
    sourceCommitId: String = null
  ): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    if (destinationCommitId != null) __obj.updateDynamic("destinationCommitId")(destinationCommitId.asInstanceOf[js.Any])
    if (mergeBase != null) __obj.updateDynamic("mergeBase")(mergeBase.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
}

