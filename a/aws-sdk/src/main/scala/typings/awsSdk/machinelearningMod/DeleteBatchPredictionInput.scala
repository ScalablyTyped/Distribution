package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBatchPredictionInput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the BatchPrediction.
    */
  var BatchPredictionId: EntityId = js.native
}
object DeleteBatchPredictionInput {
  
  @scala.inline
  def apply(BatchPredictionId: EntityId): DeleteBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBatchPredictionInput]
  }
  
  @scala.inline
  implicit class DeleteBatchPredictionInputMutableBuilder[Self <: DeleteBatchPredictionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
  }
}
