package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBatchPredictionInput extends StObject {
  
  /**
    * An ID assigned to the BatchPrediction at creation.
    */
  var BatchPredictionId: EntityId = js.native
}
object GetBatchPredictionInput {
  
  @scala.inline
  def apply(BatchPredictionId: EntityId): GetBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchPredictionInput]
  }
  
  @scala.inline
  implicit class GetBatchPredictionInputMutableBuilder[Self <: GetBatchPredictionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
  }
}
