package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSystemInstancesResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of objects that contain summary data abour the system instances in the result set.
    */
  var summaries: js.UndefOr[SystemInstanceSummaries] = js.undefined
}
object SearchSystemInstancesResponse {
  
  @scala.inline
  def apply(): SearchSystemInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSystemInstancesResponse]
  }
  
  @scala.inline
  implicit class SearchSystemInstancesResponseMutableBuilder[Self <: SearchSystemInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: SystemInstanceSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: SystemInstanceSummary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
