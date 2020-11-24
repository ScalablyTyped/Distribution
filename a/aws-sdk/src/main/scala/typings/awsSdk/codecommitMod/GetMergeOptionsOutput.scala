package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMergeOptionsOutput extends js.Object {
  
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: ObjectId = js.native
  
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  
  /**
    * The merge option or strategy used to merge the code.
    */
  var mergeOptions: MergeOptions = js.native
  
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}
object GetMergeOptionsOutput {
  
  @scala.inline
  def apply(
    baseCommitId: ObjectId,
    destinationCommitId: ObjectId,
    mergeOptions: MergeOptions,
    sourceCommitId: ObjectId
  ): GetMergeOptionsOutput = {
    val __obj = js.Dynamic.literal(baseCommitId = baseCommitId.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeOptionsOutput]
  }
  
  @scala.inline
  implicit class GetMergeOptionsOutputOps[Self <: GetMergeOptionsOutput] (val x: Self) extends AnyVal {
    
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
    def setDestinationCommitId(value: ObjectId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOptionsVarargs(value: MergeOptionTypeEnum*): Self = this.set("mergeOptions", js.Array(value :_*))
    
    @scala.inline
    def setMergeOptions(value: MergeOptions): Self = this.set("mergeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
  }
}
