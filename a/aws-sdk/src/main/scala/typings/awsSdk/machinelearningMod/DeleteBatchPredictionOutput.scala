package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBatchPredictionOutput extends js.Object {
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction. This value should be identical to the value of the BatchPredictionID in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.native
}
object DeleteBatchPredictionOutput {
  
  @scala.inline
  def apply(): DeleteBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBatchPredictionOutput]
  }
  
  @scala.inline
  implicit class DeleteBatchPredictionOutputOps[Self <: DeleteBatchPredictionOutput] (val x: Self) extends AnyVal {
    
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
    def setBatchPredictionId(value: EntityId): Self = this.set("BatchPredictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchPredictionId: Self = this.set("BatchPredictionId", js.undefined)
  }
}
