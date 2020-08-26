package typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequestTarget extends PullRequestTarget {
  /**
    * <p>Returns metadata about the state of the merge, including whether the merge has been made.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestTarget: js.UndefOr[UnmarshalledMergeMetadata] = js.native
}

object UnmarshalledPullRequestTarget {
  @scala.inline
  def apply(): UnmarshalledPullRequestTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequestTarget]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestTargetOps[Self <: UnmarshalledPullRequestTarget] (val x: Self) extends AnyVal {
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
    def setMergeMetadata(value: UnmarshalledMergeMetadata): Self = this.set("mergeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeMetadata: Self = this.set("mergeMetadata", js.undefined)
  }
  
}

