package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): PullRequestCreatedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestCreatedEventMetadata]
  }
  
  @scala.inline
  implicit class PullRequestCreatedEventMetadataOps[Self <: PullRequestCreatedEventMetadata] (val x: Self) extends AnyVal {
    
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
    def setDestinationCommitId(value: CommitId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCommitId: Self = this.set("destinationCommitId", js.undefined)
    
    @scala.inline
    def setMergeBase(value: CommitId): Self = this.set("mergeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeBase: Self = this.set("mergeBase", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: CommitId): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCommitId: Self = this.set("sourceCommitId", js.undefined)
  }
}
