package typings.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestCreatedEventMetadata extends js.Object {
  
  /**
    * <p>The commit ID of the tip of the branch specified as the destination branch when the pull request was created.</p>
    */
  var destinationCommitId: js.UndefOr[String] = js.native
  
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
  
  /**
    * <p>The commit ID on the source branch used when the pull request was created.</p>
    */
  var sourceCommitId: js.UndefOr[String] = js.native
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
    def setDestinationCommitId(value: String): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCommitId: Self = this.set("destinationCommitId", js.undefined)
    
    @scala.inline
    def setMergeBase(value: String): Self = this.set("mergeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeBase: Self = this.set("mergeBase", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: String): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCommitId: Self = this.set("sourceCommitId", js.undefined)
  }
}
