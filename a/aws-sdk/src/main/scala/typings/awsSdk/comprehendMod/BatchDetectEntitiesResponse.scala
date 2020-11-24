package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetectEntitiesResponse extends js.Object {
  
  /**
    * A list containing one object for each document that contained an error. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If there are no errors in the batch, the ErrorList is empty.
    */
  var ErrorList: BatchItemErrorList = js.native
  
  /**
    * A list of objects containing the results of the operation. The results are sorted in ascending order by the Index field and match the order of the documents in the input list. If all of the documents contain an error, the ResultList is empty.
    */
  var ResultList: ListOfDetectEntitiesResult = js.native
}
object BatchDetectEntitiesResponse {
  
  @scala.inline
  def apply(ErrorList: BatchItemErrorList, ResultList: ListOfDetectEntitiesResult): BatchDetectEntitiesResponse = {
    val __obj = js.Dynamic.literal(ErrorList = ErrorList.asInstanceOf[js.Any], ResultList = ResultList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectEntitiesResponse]
  }
  
  @scala.inline
  implicit class BatchDetectEntitiesResponseOps[Self <: BatchDetectEntitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorListVarargs(value: BatchItemError*): Self = this.set("ErrorList", js.Array(value :_*))
    
    @scala.inline
    def setErrorList(value: BatchItemErrorList): Self = this.set("ErrorList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultListVarargs(value: BatchDetectEntitiesItemResult*): Self = this.set("ResultList", js.Array(value :_*))
    
    @scala.inline
    def setResultList(value: ListOfDetectEntitiesResult): Self = this.set("ResultList", value.asInstanceOf[js.Any])
  }
}
