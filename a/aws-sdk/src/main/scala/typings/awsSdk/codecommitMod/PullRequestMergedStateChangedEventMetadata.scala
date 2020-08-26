package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestMergedStateChangedEventMetadata extends js.Object {
  /**
    * The name of the branch that the pull request is merged into.
    */
  var destinationReference: js.UndefOr[ReferenceName] = js.native
  /**
    * Information about the merge state change event.
    */
  var mergeMetadata: js.UndefOr[MergeMetadata] = js.native
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object PullRequestMergedStateChangedEventMetadata {
  @scala.inline
  def apply(): PullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestMergedStateChangedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestMergedStateChangedEventMetadataOps[Self <: PullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
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
    def setDestinationReference(value: ReferenceName): Self = this.set("destinationReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationReference: Self = this.set("destinationReference", js.undefined)
    @scala.inline
    def setMergeMetadata(value: MergeMetadata): Self = this.set("mergeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeMetadata: Self = this.set("mergeMetadata", js.undefined)
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

