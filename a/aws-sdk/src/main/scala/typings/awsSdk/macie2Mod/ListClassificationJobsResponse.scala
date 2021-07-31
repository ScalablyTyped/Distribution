package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClassificationJobsResponse extends StObject {
  
  /**
    * An array of objects, one for each job that meets the filter criteria specified in the request.
    */
  var items: js.UndefOr[listOfJobSummary] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListClassificationJobsResponse {
  
  @scala.inline
  def apply(): ListClassificationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationJobsResponse]
  }
  
  @scala.inline
  implicit class ListClassificationJobsResponseMutableBuilder[Self <: ListClassificationJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: listOfJobSummary): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: JobSummary*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
