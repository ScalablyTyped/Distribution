package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTraceSummariesResult extends StObject {
  
  /**
    * The start time of this page of results.
    */
  var ApproximateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most recent results, closest to the end of the time frame.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Trace IDs and annotations for traces that were found in the specified time frame.
    */
  var TraceSummaries: js.UndefOr[TraceSummaryList] = js.native
  
  /**
    * The total number of traces processed, including traces that did not match the specified filter expression.
    */
  var TracesProcessedCount: js.UndefOr[NullableLong] = js.native
}
object GetTraceSummariesResult {
  
  @scala.inline
  def apply(): GetTraceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTraceSummariesResult]
  }
  
  @scala.inline
  implicit class GetTraceSummariesResultMutableBuilder[Self <: GetTraceSummariesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateTime(value: Timestamp): Self = StObject.set(x, "ApproximateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateTimeUndefined: Self = StObject.set(x, "ApproximateTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTraceSummaries(value: TraceSummaryList): Self = StObject.set(x, "TraceSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSummariesUndefined: Self = StObject.set(x, "TraceSummaries", js.undefined)
    
    @scala.inline
    def setTraceSummariesVarargs(value: TraceSummary*): Self = StObject.set(x, "TraceSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTracesProcessedCount(value: NullableLong): Self = StObject.set(x, "TracesProcessedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracesProcessedCountUndefined: Self = StObject.set(x, "TracesProcessedCount", js.undefined)
  }
}
