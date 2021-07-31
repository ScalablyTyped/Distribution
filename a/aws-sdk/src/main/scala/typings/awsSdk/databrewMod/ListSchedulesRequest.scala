package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchedulesRequest extends StObject {
  
  /**
    * The name of the job that these schedules apply to.
    */
  var JobName: js.UndefOr[typings.awsSdk.databrewMod.JobName] = js.undefined
  
  /**
    * The maximum number of results to return in this request. 
    */
  var MaxResults: js.UndefOr[MaxResults100] = js.undefined
  
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
}
object ListSchedulesRequest {
  
  @scala.inline
  def apply(): ListSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchedulesRequest]
  }
  
  @scala.inline
  implicit class ListSchedulesRequestMutableBuilder[Self <: ListSchedulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
