package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStackResourcesOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
  
  /**
    * A list of StackResourceSummary structures.
    */
  var StackResourceSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.StackResourceSummaries] = js.native
}
object ListStackResourcesOutput {
  
  @scala.inline
  def apply(): ListStackResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackResourcesOutput]
  }
  
  @scala.inline
  implicit class ListStackResourcesOutputMutableBuilder[Self <: ListStackResourcesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackResourceSummaries(value: StackResourceSummaries): Self = StObject.set(x, "StackResourceSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackResourceSummariesUndefined: Self = StObject.set(x, "StackResourceSummaries", js.undefined)
    
    @scala.inline
    def setStackResourceSummariesVarargs(value: StackResourceSummary*): Self = StObject.set(x, "StackResourceSummaries", js.Array(value :_*))
  }
}
