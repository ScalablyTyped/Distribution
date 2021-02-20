package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInputsResponse extends StObject {
  
  /**
    * Summary information about the inputs.
    */
  var inputSummaries: js.UndefOr[InputSummaries] = js.native
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListInputsResponse {
  
  @scala.inline
  def apply(): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsResponse]
  }
  
  @scala.inline
  implicit class ListInputsResponseMutableBuilder[Self <: ListInputsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSummaries(value: InputSummaries): Self = StObject.set(x, "inputSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSummariesUndefined: Self = StObject.set(x, "inputSummaries", js.undefined)
    
    @scala.inline
    def setInputSummariesVarargs(value: InputSummary*): Self = StObject.set(x, "inputSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
