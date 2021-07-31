package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchPredictionOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction. This value is identical to the value of the BatchPredictionId in the request.
    */
  var BatchPredictionId: js.UndefOr[EntityId] = js.undefined
}
object CreateBatchPredictionOutput {
  
  @scala.inline
  def apply(): CreateBatchPredictionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchPredictionOutput]
  }
  
  @scala.inline
  implicit class CreateBatchPredictionOutputMutableBuilder[Self <: CreateBatchPredictionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPredictionIdUndefined: Self = StObject.set(x, "BatchPredictionId", js.undefined)
  }
}
