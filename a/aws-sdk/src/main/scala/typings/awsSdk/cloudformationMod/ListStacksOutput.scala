package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStacksOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of StackSummary structures containing information about the specified stacks.
    */
  var StackSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.StackSummaries] = js.native
}
object ListStacksOutput {
  
  @scala.inline
  def apply(): ListStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksOutput]
  }
  
  @scala.inline
  implicit class ListStacksOutputMutableBuilder[Self <: ListStacksOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackSummaries(value: StackSummaries): Self = StObject.set(x, "StackSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSummariesUndefined: Self = StObject.set(x, "StackSummaries", js.undefined)
    
    @scala.inline
    def setStackSummariesVarargs(value: StackSummary*): Self = StObject.set(x, "StackSummaries", js.Array(value :_*))
  }
}
