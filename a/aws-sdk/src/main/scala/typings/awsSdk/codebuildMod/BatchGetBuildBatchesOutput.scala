package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetBuildBatchesOutput extends js.Object {
  
  /**
    * An array of BuildBatch objects that represent the retrieved batch builds.
    */
  var buildBatches: js.UndefOr[BuildBatches] = js.native
  
  /**
    * An array that contains the identifiers of any batch builds that are not found.
    */
  var buildBatchesNotFound: js.UndefOr[BuildBatchIds] = js.native
}
object BatchGetBuildBatchesOutput {
  
  @scala.inline
  def apply(): BatchGetBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBuildBatchesOutput]
  }
  
  @scala.inline
  implicit class BatchGetBuildBatchesOutputOps[Self <: BatchGetBuildBatchesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildBatchesVarargs(value: BuildBatch*): Self = this.set("buildBatches", js.Array(value :_*))
    
    @scala.inline
    def setBuildBatches(value: BuildBatches): Self = this.set("buildBatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatches: Self = this.set("buildBatches", js.undefined)
    
    @scala.inline
    def setBuildBatchesNotFoundVarargs(value: NonEmptyString*): Self = this.set("buildBatchesNotFound", js.Array(value :_*))
    
    @scala.inline
    def setBuildBatchesNotFound(value: BuildBatchIds): Self = this.set("buildBatchesNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildBatchesNotFound: Self = this.set("buildBatchesNotFound", js.undefined)
  }
}
