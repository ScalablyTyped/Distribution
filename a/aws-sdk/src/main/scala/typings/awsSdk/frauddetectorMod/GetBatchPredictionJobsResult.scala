package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBatchPredictionJobsResult extends StObject {
  
  /**
    * An array containing the details of each batch prediction job.
    */
  var batchPredictions: js.UndefOr[BatchPredictionList] = js.undefined
  
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetBatchPredictionJobsResult {
  
  inline def apply(): GetBatchPredictionJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBatchPredictionJobsResult]
  }
  
  extension [Self <: GetBatchPredictionJobsResult](x: Self) {
    
    inline def setBatchPredictions(value: BatchPredictionList): Self = StObject.set(x, "batchPredictions", value.asInstanceOf[js.Any])
    
    inline def setBatchPredictionsUndefined: Self = StObject.set(x, "batchPredictions", js.undefined)
    
    inline def setBatchPredictionsVarargs(value: BatchPrediction*): Self = StObject.set(x, "batchPredictions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
