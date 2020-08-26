package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestTarget extends js.Object {
  /**
    * The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.
    */
  var destinationCommit: js.UndefOr[CommitId] = js.native
  /**
    * The branch of the repository where the pull request changes are merged. Also known as the destination branch. 
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * The commit ID of the most recent commit that the source branch and the destination branch have in common.
    */
  var mergeBase: js.UndefOr[CommitId] = js.native
  /**
    * Returns metadata about the state of the merge, including whether the merge has been made.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * The name of the repository that contains the pull request source and destination branches.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID changes to reflect the new tip of the branch.
    */
  var sourceCommit: js.UndefOr[CommitId] = js.native
  /**
    * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
    */
  var sourceReference: js.UndefOr[ReferenceName] = js.native
}

object PullRequestTarget {
  @scala.inline
  def apply(): PullRequestTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestTarget]
  }
  @scala.inline
  implicit class PullRequestTargetOps[Self <: PullRequestTarget] (val x: Self) extends AnyVal {
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
    def setDestinationCommit(value: CommitId): Self = this.set("destinationCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCommit: Self = this.set("destinationCommit", js.undefined)
    @scala.inline
    def setDestinationReference(value: ReferenceName): Self = this.set("destinationReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationReference: Self = this.set("destinationReference", js.undefined)
    @scala.inline
    def setMergeBase(value: CommitId): Self = this.set("mergeBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeBase: Self = this.set("mergeBase", js.undefined)
    @scala.inline
    def setMergeMetadata(value: MergeMetadata): Self = this.set("mergeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeMetadata: Self = this.set("mergeMetadata", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    @scala.inline
    def setSourceCommit(value: CommitId): Self = this.set("sourceCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCommit: Self = this.set("sourceCommit", js.undefined)
    @scala.inline
    def setSourceReference(value: ReferenceName): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
  }
  
}

