package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProgressUpdateStreamsResult extends StObject {
  
  /**
    * If there are more streams created than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * List of progress update streams up to the max number of results passed in the input.
    */
  var ProgressUpdateStreamSummaryList: js.UndefOr[typings.awsSdk.migrationhubMod.ProgressUpdateStreamSummaryList] = js.undefined
}
object ListProgressUpdateStreamsResult {
  
  @scala.inline
  def apply(): ListProgressUpdateStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProgressUpdateStreamsResult]
  }
  
  @scala.inline
  implicit class ListProgressUpdateStreamsResultMutableBuilder[Self <: ListProgressUpdateStreamsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProgressUpdateStreamSummaryList(value: ProgressUpdateStreamSummaryList): Self = StObject.set(x, "ProgressUpdateStreamSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStreamSummaryListUndefined: Self = StObject.set(x, "ProgressUpdateStreamSummaryList", js.undefined)
    
    @scala.inline
    def setProgressUpdateStreamSummaryListVarargs(value: ProgressUpdateStreamSummary*): Self = StObject.set(x, "ProgressUpdateStreamSummaryList", js.Array(value :_*))
  }
}
