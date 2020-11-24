package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeMetadata extends js.Object {
  
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.native
  
  /**
    * The commit ID for the merge commit, if any.
    */
  var mergeCommitId: js.UndefOr[CommitId] = js.native
  
  /**
    * The merge strategy used in the merge.
    */
  var mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.native
}
object MergeMetadata {
  
  @scala.inline
  def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  
  @scala.inline
  implicit class MergeMetadataOps[Self <: MergeMetadata] (val x: Self) extends AnyVal {
    
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
    def setIsMerged(value: IsMerged): Self = this.set("isMerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMerged: Self = this.set("isMerged", js.undefined)
    
    @scala.inline
    def setMergeCommitId(value: CommitId): Self = this.set("mergeCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeCommitId: Self = this.set("mergeCommitId", js.undefined)
    
    @scala.inline
    def setMergeOption(value: MergeOptionTypeEnum): Self = this.set("mergeOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeOption: Self = this.set("mergeOption", js.undefined)
    
    @scala.inline
    def setMergedBy(value: Arn): Self = this.set("mergedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergedBy: Self = this.set("mergedBy", js.undefined)
  }
}
