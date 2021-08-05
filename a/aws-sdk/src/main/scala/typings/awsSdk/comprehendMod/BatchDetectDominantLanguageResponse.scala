package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectDominantLanguageResponse extends StObject {
  
  /**
    * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
    */
  var ErrorList: BatchItemErrorList
  
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectDominantLanguageResult
}
object BatchDetectDominantLanguageResponse {
  
  inline def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectDominantLanguageResult): BatchDetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], ResultList = ResultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageResponse]
  }
  
  extension [Self <: BatchDetectDominantLanguageResponse](x: Self) {
    
    inline def setErrorList(value: BatchItemErrorList): Self = StObject.set(x, "ErrorList", value.asInstanceOf[js.Any])
    
    inline def setErrorListVarargs(value: BatchItemError*): Self = StObject.set(x, "ErrorList", js.Array(value :_*))
    
    inline def setResultList(value: ListOfDetectDominantLanguageResult): Self = StObject.set(x, "ResultList", value.asInstanceOf[js.Any])
    
    inline def setResultListVarargs(value: BatchDetectDominantLanguageItemResult*): Self = StObject.set(x, "ResultList", js.Array(value :_*))
  }
}
