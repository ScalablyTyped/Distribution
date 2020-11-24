package typings.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod

import typings.awsSdkClientCodecommitNode.typesMergeMetadataMod.UnmarshalledMergeMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledPullRequestMergedStateChangedEventMetadata extends PullRequestMergedStateChangedEventMetadata {
  
  /**
    * <p>Information about the merge state change event.</p>
    */
  @JSName("mergeMetadata")
  var mergeMetadata_UnmarshalledPullRequestMergedStateChangedEventMetadata: js.UndefOr[UnmarshalledMergeMetadata] = js.native
}
object UnmarshalledPullRequestMergedStateChangedEventMetadata {
  
  @scala.inline
  def apply(): UnmarshalledPullRequestMergedStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequestMergedStateChangedEventMetadata]
  }
  
  @scala.inline
  implicit class UnmarshalledPullRequestMergedStateChangedEventMetadataOps[Self <: UnmarshalledPullRequestMergedStateChangedEventMetadata] (val x: Self) extends AnyVal {
    
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
