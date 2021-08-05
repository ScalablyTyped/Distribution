package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchPredictionInput extends StObject {
  
  /**
    * An ID assigned to the BatchPrediction at creation.
    */
  var BatchPredictionId: EntityId
}
object GetBatchPredictionInput {
  
  inline def apply(BatchPredictionId: EntityId): GetBatchPredictionInput = {
    val __obj = js.Dynamic.literal(BatchPredictionId = BatchPredictionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBatchPredictionInput]
  }
  
  extension [Self <: GetBatchPredictionInput](x: Self) {
    
    inline def setBatchPredictionId(value: EntityId): Self = StObject.set(x, "BatchPredictionId", value.asInstanceOf[js.Any])
  }
}
