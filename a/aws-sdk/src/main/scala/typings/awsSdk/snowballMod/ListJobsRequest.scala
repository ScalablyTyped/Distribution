package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsRequest extends StObject {
  
  /**
    * The number of JobListEntry objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of JobListEntry objects, you have the option of specifying NextToken as the starting point for your returned list.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListJobsRequest {
  
  @scala.inline
  def apply(): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsRequest]
  }
  
  @scala.inline
  implicit class ListJobsRequestMutableBuilder[Self <: ListJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
