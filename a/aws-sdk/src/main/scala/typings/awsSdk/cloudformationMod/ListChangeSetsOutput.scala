package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChangeSetsOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of ChangeSetSummary structures that provides the ID and status of each change set for the specified stack.
    */
  var Summaries: js.UndefOr[ChangeSetSummaries] = js.native
}
object ListChangeSetsOutput {
  
  @scala.inline
  def apply(): ListChangeSetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsOutput]
  }
  
  @scala.inline
  implicit class ListChangeSetsOutputMutableBuilder[Self <: ListChangeSetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSummaries(value: ChangeSetSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: ChangeSetSummary*): Self = StObject.set(x, "Summaries", js.Array(value :_*))
  }
}
