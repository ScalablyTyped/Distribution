package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestSourceReferenceUpdatedEventMetadata extends js.Object {
  /**
    * The full commit ID of the commit in the source branch that was the tip of the branch at the time the pull request was updated.
    */
  var afterCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was updated.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  /**
    * The name of the repository where the pull request was updated.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PullRequestSourceReferenceUpdatedEventMetadata {
  @scala.inline
  def apply(): PullRequestSourceReferenceUpdatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestSourceReferenceUpdatedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestSourceReferenceUpdatedEventMetadataOps[Self <: PullRequestSourceReferenceUpdatedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCommitId(value: CommitId): Self = this.set("afterCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterCommitId: Self = this.set("afterCommitId", js.undefined)
    @scala.inline
    def setBeforeCommitId(value: CommitId): Self = this.set("beforeCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforeCommitId: Self = this.set("beforeCommitId", js.undefined)
    @scala.inline
    def setMergeBase(value: CommitId): Self = this.set("mergeBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeBase: Self = this.set("mergeBase", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

