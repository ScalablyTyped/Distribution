package typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.MergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequestTarget extends js.Object {
  
  /**
    * <p>The full commit ID that is the tip of the destination branch. This is the commit where the pull request was or will be merged.</p>
    */
  var destinationCommit: js.UndefOr[String] = js.native
  
  /**
    * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch. </p>
    */
  var destinationReference: js.UndefOr[String] = js.native
  
  /**
    * <p>The commit ID of the most recent commit that the source branch and the destination branch have in common.</p>
    */
  var mergeBase: js.UndefOr[String] = js.native
  
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  
  /**
    * <p>The name of the repository that contains the pull request source and destination branches.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
  
  /**
    * <p>The full commit ID of the tip of the source branch used to create the pull request. If the pull request branch is updated by a push while the pull request is open, the commit ID will change to reflect the new tip of the branch.</p>
    */
  var sourceCommit: js.UndefOr[String] = js.native
  
  /**
    * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
    */
  var sourceReference: js.UndefOr[String] = js.native
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
    def setDestinationCommit(value: String): Self = this.set("destinationCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCommit: Self = this.set("destinationCommit", js.undefined)
    
    @scala.inline
    def setDestinationReference(value: String): Self = this.set("destinationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationReference: Self = this.set("destinationReference", js.undefined)
    
    @scala.inline
    def setMergeBase(value: String): Self = this.set("mergeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeBase: Self = this.set("mergeBase", js.undefined)
    
    @scala.inline
    def setMergeMetadata(value: MergeMetadata): Self = this.set("mergeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeMetadata: Self = this.set("mergeMetadata", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
    
    @scala.inline
    def setSourceCommit(value: String): Self = this.set("sourceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCommit: Self = this.set("sourceCommit", js.undefined)
    
    @scala.inline
    def setSourceReference(value: String): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
  }
}
