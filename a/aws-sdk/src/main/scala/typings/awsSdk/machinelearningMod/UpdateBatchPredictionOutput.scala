package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBatchPredictionOutput extends StObject {
  
  /**
    * The ID assigned to the BatchPrediction during creation. This value should be identical to the value of the BatchPredictionId in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
}
object UpdateBatchPredictionOutput {
  
  @scala.inline
  def apply(): UpdateBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBatchPredictionOutput]
  }
  
  @scala.inline
  implicit class UpdateBatchPredictionOutputMutableBuilder[Self <: UpdateBatchPredictionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPredictionIdUndefined: Self = StObject.set(x, "BatchPredictionId", js.undefined)
  }
}
