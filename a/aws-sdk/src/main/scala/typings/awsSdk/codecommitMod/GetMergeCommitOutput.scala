package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeCommitOutput extends js.Object {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the fast-forward merge strategy was used, there is no merge commit.
    */
  var mergedCommitId: js.UndefOr[ObjectId] = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.native
}
object GetMergeCommitOutput {
  
  @scala.inline
  def apply(): GetMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMergeCommitOutput]
  }
  
  @scala.inline
  implicit class GetMergeCommitOutputOps[Self <: GetMergeCommitOutput] (val x: Self) extends AnyVal {
    
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
    def setBaseCommitId(value: ObjectId): Self = this.set("baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseCommitId: Self = this.set("baseCommitId", js.undefined)
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCommitId: Self = this.set("destinationCommitId", js.undefined)
    
    @scala.inline
    def setMergedCommitId(value: ObjectId): Self = this.set("mergedCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergedCommitId: Self = this.set("mergedCommitId", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCommitId: Self = this.set("sourceCommitId", js.undefined)
  }
}
