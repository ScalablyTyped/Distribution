package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectTargetedSentimentResponse extends StObject {
  
  /**
    * List of errors that the operation can return.
    */
  var ErrorList: BatchItemErrorList
  
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectTargetedSentimentResult
}
object BatchDetectTargetedSentimentResponse {
  
  inline def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectTargetedSentimentResult): BatchDetectTargetedSentimentResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], ResultList = ResultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectTargetedSentimentResponse]
  }
  
  extension [Self <: BatchDetectTargetedSentimentResponse](x: Self) {
    
    inline def setErrorList(value: BatchItemErrorList): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    inline def setErrorListVarargs(value: BatchItemError*): Self = StObject.set(x, "ErrorList", js.Array(value*))
    
    inline def setResultList(value: ListOfDetectTargetedSentimentResult): Self = StObject.set(x, "ResultList", value.asInstanceOf[js.Any])
    
    inline def setResultListVarargs(value: BatchDetectTargetedSentimentItemResult*): Self = StObject.set(x, "ResultList", js.Array(value*))
  }
}
